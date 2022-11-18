package Teste;


import java.util.List;

public class Main {

	public static void main(String[] args) {

		ListaPessoas l = new ListaPessoas();
		
		Pessoa p = new Pessoa("Eva Dias", "Lindinho002@mainmaill.com");
		
		l.add(p);
		
		p = new Pessoa("Sujiro", "TerezaGamers03@esquecii.com");
		
		l.add(p);
		
		l.alteraCadastro("Sujiro", "Luquinhas", "Lucãodelas@hotmail.com");
		
		// Busca contatos
		l.buscaCadastros("S");
		
		// Dominio dos emails
		l.pegaDominio();
		
		// Selecionar o nome igual a um da lista para deletalo
		l.deletaArquivoLista("Eva Dias");
		
		List<Pessoa> lista = l.getLista();
		
		for(Pessoa item : lista) {
			System.out.println(item.toString());
		}
		
	}

}
