package VISTA;

import javax.swing.JOptionPane;

import EXCEPTIONS.MiExcepcion;
import OBJ.Calculadora;

public class Vista {

	public void imprimirResult(int i) {
		JOptionPane.showMessageDialog(null, "El resultado es: "+i);
	}

	public void imprimirResult(double num) {
		JOptionPane.showMessageDialog(null, "El resultado es: "+num);
	}
	
	public void verOperacion() {
		String op = JOptionPane.showInputDialog("Que operacion quieres realizar:\n"
				+ "1.- Suma\n"
				+ "2.- Resta\n"
				+ "3.- Multiplicacion\n"
				+ "4.- Division\n"
				+ "5.- Raiz cuadrada\n"
				+ "6.- Raiz cubica\n"
				+ "7.- Potencia");
		
		try {
			switch(op) {
			case "1":
				pedirNums("+");
				break;
			case "2":
				pedirNums("-");
				break;
			case "3":
				pedirNums("*");
				break;
			case "4":
				pedirNums("/");
				break;
			case "5":
				pedirNum("2");
				break;
			case "6":
				pedirNum("3");
				break;
			case "7":
				pedirNums("^");
				break;
			default:
				throw new MiExcepcion(13);
			}
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Error de claculo");
		}catch(MiExcepcion me) {
			
		}
	}

	private void pedirNum(String op) {
		String num1 = JOptionPane.showInputDialog("Primer Numero");
		new Calculadora(Integer.parseInt(num1),0,op);
		
	}

	private void pedirNums(String op) {
		
		String num1 = JOptionPane.showInputDialog("Primer Numero");
		String num2 = JOptionPane.showInputDialog("Segundo Numero");
		new Calculadora(Integer.parseInt(num1),Integer.parseInt(num2),op);
	}

}
