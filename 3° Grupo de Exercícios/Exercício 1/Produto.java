package livraria; 
import java.util.Objects;

public class Produto {
	private final String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		Objects.requireNonNull(nome,"O nome nao pode ser nulo!!!");
		this.nome = nome;
		if(preco > 0)
		this.preco = preco;
		
		else throw new IllegalArgumentException("O preco nao pode ser negativo e nem zero !!! ");
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nPreco: " + this.preco;
	}
}
