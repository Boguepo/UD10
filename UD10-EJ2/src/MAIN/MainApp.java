package MAIN;

import EXCEPTIONS.MiExcepcion;
import VISTA.Vista;

public class MainApp {

	public static void main(String[] args) {
		Vista v = new Vista();
		try {
			v.primerMsg();
			throw new MiExcepcion("Mensaje de la Exception");
		}catch(MiExcepcion e) {
			v.imprimirEx(e);
		}
	}

}
