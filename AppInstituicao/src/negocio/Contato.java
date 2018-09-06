package negocio;

public class Contato {
	private String email;
	private String celular;
	private String endereço;
	
	public void exibir() {
		System.out.printf("== CONTATO =="
				+ "E-mail: %s\n"
				+ "Celular: %s\n"
				+ "Endereço: %s\n\n",
				email,
				celular,
				endereço
				);
	}

}
