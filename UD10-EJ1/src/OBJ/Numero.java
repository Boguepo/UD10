package OBJ;

import java.util.Random;

import VISUAL.Visual;

public class Numero {
	private Random r =  new Random();
	private Visual v = new Visual();
	
	private int numero;
	private int intentos;

	public Numero() {
		this.numero = r.nextInt(500)+1;
		this.intentos = 0;
	}
	
	public boolean comprobarValor(int num) {
		if(num > this.numero) {
		
			v.imprimirOp(">");
			this.sumarIntento();
			return false;
		}else if(num< this.numero) {
			v.imprimirOp("<");
			this.sumarIntento();
			return false;
		}else {
			v.imprimirOp(this.intentos);
			return true;
		}
		
	}
	
	public void sumarIntento() {
		this.intentos++;
	}
	
	
	
	
	//No genero GET & SET porque voy a usar los atributos solo en la clase


}
