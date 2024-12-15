import java.time.LocalDate;
import java.time.Period;

//Exercicio 2
public class Estudante {
	// atributos
	private final String nome;
	private final LocalDate dataNascimento;
	private double[] notas;
	private int tri = 0;

	// construtores

	public Estudante(LocalDate dataNasc, String nome) {
		this.notas = new double[3];

		do {

			this.notas[this.tri] = 0;
			this.tri++;

		} while (this.tri <= 2);
		tri = 0;

		this.dataNascimento = dataNasc;

		if (nome == null)
			throw new IllegalArgumentException("Eh prciso de um nome para o programa funcionar");

		else
			this.nome = nome;
	}

	// gettrs
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		Period idade = this.dataNascimento.until(LocalDate.now());
		return idade.getYears();
	}

	public int getTri() {
		return this.tri;
	}

	// metodos

	public void insereNota(double num) {
		if (this.tri >= 3){
			throw new IllegalArgumentException("Ja foi inserida notas em todos os 3 trimetres");
		}else {
			if(num >= 0 && num <= 10){
				this.notas[this.tri] = num;
				this.tri++;

			}else
				throw new IllegalArgumentException("As notas devem ser de 0 ha 10");
		}

}

	public double calculaMedia() {
		double total = this.notas[0] + this.notas[1] + this.notas[2];
		double media = total / 3;
		return media;
	}

	public boolean ehMaisVelho(Estudante e) {
		return this.dataNascimento.isAfter(e.dataNascimento);
	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof Estudante) {
			Estudante edu = (Estudante) o;
			return this.nome == edu.nome && this.dataNascimento == edu.dataNascimento
					&& this.calculaMedia() == edu.calculaMedia();
		} else if (o == null)
			return false;

		else
			return false;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nIdade: " + this.getIdade() + "\nNotas:\n 1 - tri) " + this.notas[0]
				+ "\n 2 - tri) " + this.notas[1] + "\n 3 - tri) " + this.notas[2];
	}
}
