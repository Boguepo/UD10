package VISTA;

import javax.swing.JOptionPane;

import EXCEPTIONS.MiExcepcion;

public class Vista {
	
	public void imprimirEx(MiExcepcion e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
	}

	public void primerMsg() {
		JOptionPane.showMessageDialog(null, "Bienvenido");
		
	}
	
}
