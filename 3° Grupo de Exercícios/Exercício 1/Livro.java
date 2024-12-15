package livraria;
import java.util.Objects;

public class Livro extends Produto {
	private final String autorPrincipal;
	private String editora;

	public Livro(String nome, double preco, String autorPrincipal, String editora) {
		super(nome, preco);
		Objects.requireNonNull(autorPrincipal, "Alguem precisa ter escrito esse livro!!! ");
		Objects.requireNonNull(editora, "Alguem deve ter publicado esse livro!!!");
		this.autorPrincipal = autorPrincipal;
		this.editora = editora;
	}

	public String getAutor() {
		return this.autorPrincipal;
	}

	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String novaEditora) {
		Objects.requireNonNull(novaEditora, "Alguem deve ter publicado esse livro!!!");
		this.editora = novaEditora;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAutor Principal: " + this.autorPrincipal + "\nEditora: " + this.editora;
	}
}
