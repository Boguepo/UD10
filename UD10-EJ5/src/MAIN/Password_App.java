package MAIN;

import OBJ.Password;
import VISTA.Vista;

public class Password_App {

	public static void main(String[] args) {
		Vista v = new Vista();
		
		int cant = v.getCantidad();
		Password paswrds[] = new Password[cant];
		boolean fuerte[] =  new boolean[cant];;
		
		int longi = v.getLongitud();
		
		for (int i = 0; i < paswrds.length; i++) {
			paswrds[i] = new Password(longi);
			if(paswrds[i].esFuerte()) {
				fuerte[i] = true;
			}else {
				fuerte[i] = false;
			}
			
			v.verPass(paswrds[i]);
		}

	}

}
