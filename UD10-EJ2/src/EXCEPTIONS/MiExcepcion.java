package EXCEPTIONS;

public class MiExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String codigoEx;

	public MiExcepcion() {
		super();
	}
	
	public MiExcepcion(String codigo) {
		super();
		this.codigoEx = codigo;
	}
	
	@Override
	public String getMessage() {
		
		
		return this.codigoEx;
		
	}

}
