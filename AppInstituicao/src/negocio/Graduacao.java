package negocio;

public class Graduacao extends Curso{
	private boolean indicativoTec;
	private Documentacao documentacao;
	
	
	public Graduacao(String nome, int cargaHoraria, int valor, boolean indicativoTec) {
		super(nome, cargaHoraria, valor);
		this.indicativoTec = indicativoTec;
	}

	public void show() {
		System.out.println("== GRADUA��O ==");
		System.out.printf("Indicativo T�cnol�gico: %s \n\n",
				indicativoTec ? "SIM" : "N�O"
				);
		super.show();
		documentacao.show();
	}

	public boolean isIndicativoTec() {
		return indicativoTec;
	}

	public void setIndicativoTec(boolean indicativoTec) {
		this.indicativoTec = indicativoTec;
	}

	public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}
}
