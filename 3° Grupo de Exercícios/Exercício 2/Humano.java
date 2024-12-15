package animais;

public class Humano extends Animal {
	public Humano(String nome) {
		super(nome);
	}
	
	@Override 
	public String seComunica() {
		return "Ola, eu sou a(o)" + super.getNome() + "! Tudo bem?";
	}
}
