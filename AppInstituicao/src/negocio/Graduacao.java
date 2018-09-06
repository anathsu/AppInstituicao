package negocio;

public class Graduacao extends Curso{
	private boolean indicativoTec;
	private Documentacao documentacao;
	
	
	public Graduacao(String nome, int cargaHoraria, int valor, boolean indicativoTec) {
		super(nome, cargaHoraria, valor);
		this.indicativoTec = indicativoTec;
	}

	public void show() {
		System.out.println("== GRADUAÇÃO ==");
		System.out.printf("Indicativo Técnológico: %s \n\n",
				indicativoTec ? "SIM" : "NÃO"
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
