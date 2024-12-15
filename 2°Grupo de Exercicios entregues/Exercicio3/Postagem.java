package Exercicio3;

import java.time.LocalDateTime;

public class Postagem {
	private String conteudo;
	private final LocalDateTime dataHora;

	public Postagem(String conteudo) {
		this.conteudo = conteudo;
		this.dataHora = LocalDateTime.now();
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	public LocalDateTime getDataHora() {
		return this.dataHora;
	}
	
	@Override
	public String toString() {
		return "Conteudo: " + this.conteudo + "\nData e Hora da postagem: " + this.dataHora;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		
		else if(o instanceof Postagem) {
			Postagem pos = (Postagem) o;
			return this.conteudo.equals(pos.conteudo) && this.dataHora.equals(pos.dataHora);
		} else return false;
	}
}
