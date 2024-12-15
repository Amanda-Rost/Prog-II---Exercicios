package livraria;

import java.time.Duration;

public class BlueRay extends Produto {
	private Duration duracao; 
	
	public BlueRay(String nome, double preco, Duration duracao) {
		super(nome,preco);
		if(duracao.isZero() || duracao.isNegative()) 
			throw new IllegalArgumentException("A duracao deve ser maior e diferente de ZERO !!!");
			 else this.duracao = duracao;
	}
	
	public String getDuracao() {
		int hor = this.duracao.toHoursPart();
		int mim = this.duracao.toMinutesPart();
		int seg = this.duracao.toSecondsPart();
		return  String.format("%02dh%02dmim%02ds",hor,
				 mim, seg);
	}
	
	public void setDuracao(Duration novaDuracao) {
		if(duracao.isZero() || duracao.isNegative()) 
			throw new IllegalArgumentException("A duracao deve ser maior e diferente de ZERO !!!");
			 else this.duracao = novaDuracao;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\nDuracao: " + this.getDuracao();
	}
}
