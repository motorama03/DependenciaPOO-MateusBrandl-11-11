package Com.MateusB.LigacaoDependencia;

public class Documento {

	private String texto;

	public Documento() {
		
	}
	
	public Documento(String texto) {
		setTexto(getTexto());
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		if(texto.length() > 0) {
			this.texto = texto;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	
	}
}
