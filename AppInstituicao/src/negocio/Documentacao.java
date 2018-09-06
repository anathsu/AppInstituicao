package negocio;

public class Documentacao {
	private String cpf;
	private String rg;
	private String tituloDeEleitor;
	private String ctps;
	
	public void show() {
		System.out.printf("== DOCUMENTACAO ==\n"
				+ "CPF: %s\n"
				+ "RG: %s\n"
				+ "Título de Eleitor: %s\n"
				+ "CTPS %s\n\n",
				cpf,
				rg,
				tituloDeEleitor,
				ctps
				);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTituloDeEleitor() {
		return tituloDeEleitor;
	}
	public void setTituloDeEleitor(String tituloDeEleitor) {
		this.tituloDeEleitor = tituloDeEleitor;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
}
