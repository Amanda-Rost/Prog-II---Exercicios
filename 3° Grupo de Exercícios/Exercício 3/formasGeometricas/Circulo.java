package formasGeometricas;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo extends Forma2d implements Desenhavel {
	private final int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public String toString() {
		return "Circulo raio:" + this.raio + " Diametro:" + this.getLargura();
	}

	@Override
	public void desenha(Graphics g, int x, int y) {
		g.setColor(Color.GREEN);
		int incY = 50;
		g.drawOval(x, y, this.getLargura(), this.getLargura());
		for (String texto : this.toString().split(" ")) {
			g.drawString(texto, x + 50, y + incY);
			incY += 17;
		}
	}

	@Override
	public int getLargura() {
		return 2 * this.raio;
	}
}
