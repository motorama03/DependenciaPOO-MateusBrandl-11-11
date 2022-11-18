package Teste;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

	private List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	
	// 	MOSTRAR IDADE
	
	// BUSCAR IDADE > ?
	
	// ANIVERSSARIANTES DO MÊS 1 - JAN, 2 - FEV 
	
	public void alteraCadastro(String nome, String alterado, String email) {
		for(int x = 0; x < lista.size(); x++) {
			if(nome == lista.get(x).getNome()){
				lista.get(x).setNome(alterado);
				lista.get(x).setEmail(email);
			}
		}
	}
	
	public String buscaCadastros(String inicial) {
		StringBuilder saida = new StringBuilder();
		saida.append("Estes são os cadastrados que se encaixam a sua busca: \n");
		for(int x = 0; x < lista.size(); x++) {
			if(lista.get(x).getNome().contains(inicial)){
				saida.append(lista.get(x).getNome());
			}
		}
		System.out.println(saida);
		return saida.toString();
	}

	public String pegaDominio() {
		StringBuilder saida = new StringBuilder();
		saida.append("\nLista de dominios: \n");
		for(int x = 0; x < lista.size(); x++) {
			String[] result = lista.get(0).getEmail().split("@");
			String dominas = result[1];
			saida.append(dominas+"\n");
		}
	    System.out.println(saida);
	    return saida.toString();
	}
	
	public boolean add(Pessoa pessoa) {
		// Valida se já existe alguém com este nome e se o nome é maior q 3 cacteres
		boolean passou = true;
		for(int x = 0; x < lista.size(); x++) {
			for(int v = 0; v < lista.size(); v++) {
				if(pessoa.getNome() == lista.get(x).getNome() || pessoa.getNome().length() < 3) {
					passou = false;
					break;			
				}
			}
		}
		if(passou) {
			lista.add(pessoa);
		}
		return(passou);
	}
	
	public void deletaArquivoLista(String nome) {
		String vitima = nome;
		for(int x = 0; x < lista.size(); x++) {
			if(vitima == lista.get(x).getNome()) {
				lista.remove(x);
			}
		}
		
	}

}
