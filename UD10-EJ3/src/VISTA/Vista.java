package VISTA;

import javax.swing.JOptionPane;

public class Vista {

	public void imprimir(String message) {
		JOptionPane.showMessageDialog(null, "El numero "+message);
		
	}

	public void primero(int num) {
		JOptionPane.showMessageDialog(null, "Bienvenido\nEl numero es: "+num);
		
	}

}
