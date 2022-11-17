package Com.MateusB.LigacaoDependencia;

public class DocumentoMain {

	public static void main(String[] args) {

		Documento doc = new Documento();
		doc.setTexto("Tongo");
		
		Impressora Hp = new Impressora();
		Hp.imprimir(doc);
		
	}

}

