package negocio;

public class Graduacao extends Curso{
	private boolean indicativoTec;
	
	
	public Graduacao(String nome, int cargaHoraria, int valor, boolean indicativoTec) {
		super(nome, cargaHoraria, valor);
		this.indicativoTec = indicativoTec;
	}

	public void show() {
		System.out.println("== GRADUAÇÃO ==");
		System.out.printf("Indicativo Técnológico: %s \n\n",
				indicativoTec ? "SIM" : "NÃO"
				);
	}

	public boolean isIndicativoTec() {
		return indicativoTec;
	}

	public void setIndicativoTec(boolean indicativoTec) {
		this.indicativoTec = indicativoTec;
	}
}
