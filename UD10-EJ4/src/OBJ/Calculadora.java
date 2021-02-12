package OBJ;

import VISTA.Vista;

public class Calculadora {
	private Vista v =  new Vista();
	
	private int num1,num2;
	
	
	
	public Calculadora(int num1, int num2, String operador) {
		this.num1 = num1;
		this.num2 = num2;
		this.operacion(operador);
	}


	private void operacion(String op) {
		
		switch(op) {
		case "+":
			v.imprimirResult(num1+num2);
			break;
		case "-":
			v.imprimirResult(num1-num2);
			break;
		case "*":
			v.imprimirResult(num1*num2);
			break;
		case "/":
			v.imprimirResult(num1/num2);
			break;
		case "2":
			v.imprimirResult(Math.sqrt(num1));
			break;
		case "3":
			v.imprimirResult(Math.cbrt(num1));
			break;
		case "^":
			v.imprimirResult(Math.pow(num1, num2));
			break;
		
		}
		
	}
	
	

	

}
