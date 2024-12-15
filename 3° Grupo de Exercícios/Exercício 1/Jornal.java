package livraria;

import java.time.LocalDateTime;
import java.util.Objects;

public class Jornal extends Produto {
	private LocalDateTime data;

	public Jornal(String nome, double preco, LocalDateTime data) {
		super(nome, preco);
		Objects.requireNonNull(data, "O jornal deve ter uma data");
		this.data = data;
	}

	public LocalDateTime getGenero() {
		return this.data;
	}

	public void setGenero(LocalDateTime novaData) {
		Objects.requireNonNull(novaData, "O jornal deve ter um genero");
		this.data = novaData;
	}
	
	@Override
	public String toString() {
	 	return super.toString() + "Genero: " + this.data;
	}
}
