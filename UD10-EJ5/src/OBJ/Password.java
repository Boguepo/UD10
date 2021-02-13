package OBJ;

import java.util.Random;

import VISTA.Vista;

public class Password {
	
	private Vista v =  new Vista();
	private Random r = new Random();

	
	private int longitud = 8;
	private String password;
	private int nMin,nMay,nNum;
	
	public Password() {
		
		this.password = "";
		this.nMin= 0;
		this.nMay = 0;
		this.nNum = 0;
		generarPassword(this.longitud);
	}
	
	

	public Password(int longitud) {
		
		this.longitud = longitud;
		this.password= "";
		this.nMin= 0;
		this.nMay = 0;
		this.nNum = 0;
		generarPassword(this.longitud);
	}
	
	private void generarPassword(int longitud2) {
		for (int i = 0; i < longitud2; i++) {
			int op = r.nextInt(3);
		
		switch(op) {
		case 0:
			this.password += Character.toString(r.nextInt(25)+'A');//genero un random entre A y Z (mayusculas)
			this.nMay++;
			break;
		case 1:
			this.password += Character.toString(r.nextInt(25)+'a');//gener un random entre a y z (minusculas)
			this.nMin++;
			break;
		case 2:
			this.password += r.nextInt(9)+1;
			this.nNum++;
			break;
		}
		}
		
		
	}
	
	public boolean esFuerte() {
		if(nMin >= 1 && nMay >= 2 && nNum >= 5) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public void imprimirPass(Password pass) {
		v.imprimirPass(pass);
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	
	
	

}
