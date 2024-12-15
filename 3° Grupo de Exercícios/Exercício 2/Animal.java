package animais;

import java.util.Objects;

public abstract class Animal {
	private final String nome;

	public Animal(String nome) {
		Objects.requireNonNull(nome, "Ele deve ter um nome!!!");
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public abstract String seComunica();
}
