package VISUAL;

import javax.swing.JOptionPane;

public class Visual {

	public void imprimirOp(String op) {
		switch(op) {
		case "<":
			JOptionPane.showMessageDialog(null, "Tu numero es menor que el buscado");
			break;
		case ">":
			JOptionPane.showMessageDialog(null, "Tu numero es mayor que el buscado");
		}
		
	}

	public void imprimirOp(int intentos) {

		JOptionPane.showMessageDialog(null, "Has acertado el numero\nEnhorabuena!!\nIntentos: "+intentos);
		
	}
	
	public int pedirNum() {
		
		return Integer.parseInt(JOptionPane.showInputDialog("Cual es tu numero?"));
	}
	
	public void errorNum() {
		JOptionPane.showMessageDialog(null, "Has introducido algo que no es un numero\n Se te suma 1 intento  :-)");
	}

}
