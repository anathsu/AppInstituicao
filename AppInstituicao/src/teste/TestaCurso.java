package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
		Especializacao esp = new Especializacao("JAVA", 300, 1000, 2017);
		esp.show();
		
		Graduacao grad = new Graduacao("ADS", 500, 2500, true );
		grad.show();
	}
}
