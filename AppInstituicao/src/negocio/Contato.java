package negocio;

public class Contato {
	private String email;
	private String celular;
	private String endere�o;
	
	public void exibir() {
		System.out.printf("== CONTATO =="
				+ "E-mail: %s\n"
				+ "Celular: %s\n"
				+ "Endere�o: %s\n\n",
				email,
				celular,
				endere�o
				);
	}

}
