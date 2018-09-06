package teste;

import negocio.Coordenador;
import negocio.Documentacao;
import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
//		Especializacao esp = new Especializacao("JAVA", 300, 1000, 2017);
//		esp.show();	
		
		Documentacao doc = new Documentacao();
		doc.setCpf("213.314.455-84");
		doc.setRg("32.435.347-5");
		doc.setTituloDeEleitor("7685438");
		doc.setCtps("8743876543");
		
		Documentacao docCoo = new Documentacao();
		docCoo.setCpf("564.536.764-33");
		docCoo.setRg("23.345.845-1");
		docCoo.setTituloDeEleitor("7468763");
		docCoo.setCtps("98747685");
		
		Coordenador coo = new Coordenador();
		coo.setNome("Rivaldo");
		coo.setEmail("email@email.com");
		coo.setCelular("(21)97364-6392");
		coo.setEndereco("Rua Qualquer, 763 - Rio de Janeiro - RJ");
		coo.setDocumentacao(docCoo);
		
		Graduacao grad = new Graduacao("ADS", 500, 2500, true );
		grad.setDocumentacao(doc);
		grad.setCoordenador(coo);
		grad.show();
		
		
	}
}
