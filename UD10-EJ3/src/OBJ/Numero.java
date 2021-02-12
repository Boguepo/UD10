package OBJ;

import java.util.Random;

import EXCEPTIONS.MiExcepcion;
import VISTA.Vista;

public class Numero {

	private Random r =  new Random();
	private Vista v = new Vista();
	
	private int numero;
	private int intentos;

	public Numero() {
		this.numero = r.nextInt(500)+1;
		this.intentos = 0;
	}
	
	public void comprobarValor() {
		try {
		if(this.numero%2 == 0) {throw new MiExcepcion(2);}
		else {throw new MiExcepcion(3);}
		}catch(MiExcepcion e) {
			v.imprimir(e.getMessage());
		}

	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the intentos
	 */
	public int getIntentos() {
		return intentos;
	}

	/**
	 * @param intentos the intentos to set
	 */
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	

}
