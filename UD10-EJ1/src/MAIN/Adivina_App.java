package MAIN;

import java.util.InputMismatchException;

import OBJ.Numero;
import VISUAL.Visual;

public class Adivina_App {

	public static void main(String[] args) {
		Numero num = new Numero();
		Visual v = new Visual();
		
		boolean fin = false;
		
		while(fin == false) {
			try {
				fin = num.comprobarValor(v.pedirNum());
			} catch (InputMismatchException e) {
				num.sumarIntento();
				v.errorNum();
			}catch(Exception ex) {
				num.sumarIntento();
				v.errorNum();
			}
		}
	}
}
