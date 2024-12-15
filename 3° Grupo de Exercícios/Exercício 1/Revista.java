package livraria;

import java.util.Objects;

public class Revista extends Produto{
	private String genero;

	public Revista(String nome, double preco, String genero) {
		super(nome, preco);
		Objects.requireNonNull(genero, "O jornal deve ter um genero");
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String novoGenero) {
		Objects.requireNonNull(genero, "O jornal deve ter um genero");
		this.genero = novoGenero;
	}
	
	@Override
	public String toString() {
	 	return super.toString() + "Genero: " + this.genero;
	}
}
