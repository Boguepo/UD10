package MAIN;

import OBJ.Numero;
import VISTA.Vista;

public class MainApp {
	
	public static void main(String[] args) {
		Numero num  = new Numero();
		Vista v =  new Vista();
		
		v.primero(num.getNumero());
		num.comprobarValor();
	}
}
