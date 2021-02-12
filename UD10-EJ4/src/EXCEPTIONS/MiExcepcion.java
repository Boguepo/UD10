package EXCEPTIONS;

public class MiExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	private int codigoEx;

	public MiExcepcion() {
		super();
	}

	public MiExcepcion(int codigo) {
		super();
		this.codigoEx = codigo;
	}

	@Override
	public String getMessage() {

		String msg = "";

		switch (this.codigoEx) {
		case 13:
			msg = "Caracter erroneo";
			break;
		
		}

		return msg;

	}

}