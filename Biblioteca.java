package bibliotecaSistema;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String nome;
	private List<Livro>livros; //Composição
	public Biblioteca(String nome) {
		this.nome=nome;
		this.livros = new ArrayList<>();
	}
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

}
