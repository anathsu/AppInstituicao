package negocio;

public class Curso {
	private String nome;
	private int cargaHoraria;
	private int valor;
	
	public Curso(String nome, int cargaHoraria, int valor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void show() {
		System.out.printf("Nome: %s\n"
				+ "Carga Horaria: %d\n"
				+ "Valor da Parcela: %d\n",
				nome,
				cargaHoraria,
				valor
				);
	}

}
