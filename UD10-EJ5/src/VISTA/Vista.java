package VISTA;

import javax.swing.JOptionPane;

import OBJ.Password;

public class Vista {

	public void imprimirPass(Password pass) {
		System.out.println("Longitud: "+pass.getLongitud()
				+"\nPassword: "+pass.getPassword());
		
	}

	public int getCantidad() {
	
		return Integer.parseInt(JOptionPane.showInputDialog("Cuantas contraseñas quieres?"));
		
	}

	public int getLongitud() {
		
		return Integer.parseInt(JOptionPane.showInputDialog("Longitud de las contraseñas"));
	}

	public void verPass(Password password) {
		System.out.println("Contraseña: "+password.getPassword()+" ------ Fuerte: "+password.esFuerte());
		
	}

}
