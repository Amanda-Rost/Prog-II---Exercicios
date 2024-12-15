//Exercicio 1
public class Livro {
	// atributos
	private final String titulo;
	private final int pag;
	private int pagLidas;

	// construtores

	public Livro(int num, String tex) {
		this.pagLidas = 0;

		if (num > 0)
			this.pag = num;
		else
			this.pag = 0;

		this.titulo = tex;
	}

	public int getPag() {
		return this.pag;
	}

	public String getTitulo() {
		return this.titulo;
	}

	// Metodos
	public boolean ler(int num) {
		boolean verd;
		this.pagLidas = this.pagLidas + num;

		if (this.pag == this.pagLidas)
			verd = true;

		else
			verd = false;

		return verd;
	}

	public void recomeca() {
		this.pagLidas = 0;
	}

	@Override
	public boolean equals(Object o) {
		// if(o == this) return true;
		if (o == null)
			return false;
		if (o instanceof Livro) {
			Livro liv = (Livro) o;
			return this.titulo.equals(liv.titulo) && this.pag == liv.pag && this.pagLidas == liv.pagLidas;
			// return this.titulo.equals(liv.titulo);
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Titulo: " + this.titulo + "\nPaginas do livros: " + this.pag + "\nPaginas lidas: " + this.pagLidas;
	}
}
