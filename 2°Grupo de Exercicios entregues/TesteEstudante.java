import java.time.LocalDate;

public class TesteEstudante {
    public static void main(String[] args) {
        // Criando objetos Estudante
        Estudante estudante1 = new Estudante(LocalDate.of(2000, 5, 15), "Joao Silva");
        Estudante estudante2 = new Estudante(LocalDate.of(2002, 3, 10), "Maria Oliveira");

        // Testando os getters
        System.out.println("Nome do estudante1: " + estudante1.getNome());
        System.out.println("Idade do estudante1: " + estudante1.getIdade());

        // Testando o metodo insereNota
        System.out.println("\nInserindo notas para estudante1");
        estudante1.insereNota(7.5);
        estudante1.insereNota(8.0);
        estudante1.insereNota(9.0);

        System.out.println("Notas inseridas com sucesso para estudante1.");

        // Testando calculaMedia
        System.out.println("\nMedia do estudante1: " + estudante1.calculaMedia());

        // Testando o metodo ehMaisVelho
        System.out.println("\nEstudante1 eh mais velho que Estudante2? " + estudante1.ehMaisVelho(estudante2));

        // Testando o metodo equals
        System.out.println("\nEstudante1 e Estudante2 sao iguais? " + estudante1.equals(estudante2));

        // Testando toString
        System.out.println("\nInformacoes do estudante1:\n" + estudante1);

        // Testando excecoes ao inserir nota
        System.out.println("\nTestando insercao de nota invalida:");
        try {
            estudante1.insereNota(11.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTestando insercao de nota apos o limite de trimestres:");
        try {
           estudante1.insereNota(6.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testando construtor com nome nulo
        System.out.println("\nTestando criacao de Estudante com nome nulo:");
        try {
            Estudante estudante3 = new Estudante(LocalDate.of(2005, 8, 20), null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
