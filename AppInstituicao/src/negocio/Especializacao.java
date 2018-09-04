package negocio;

public class Especializacao extends Curso {
	private int anoTerminoGraduacao;
	
	public Especializacao(String nome, int cargaHoraria, int valor, int anoTerminoGraduacao) {
		super(nome, cargaHoraria, valor);
		this.anoTerminoGraduacao = anoTerminoGraduacao;
	}
	
	public void show() {
		System.out.println("== ESPECIALIZA��O ==");
		System.out.printf("Ano de t�rmino: %d\n\n",
				anoTerminoGraduacao
				);
	}
	public int getAnoTerminoGraduacao() {
		return anoTerminoGraduacao;
	}

	public void setAnoTerminoGraduacao(int anoTerminoGraduacao) {
		this.anoTerminoGraduacao = anoTerminoGraduacao;
	}
}
