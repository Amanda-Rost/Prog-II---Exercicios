// TesteLivro.java
public class TesteLivro {
    public static void main(String[] args) {
        // Criando objetos Livro
        Livro livro1 = new Livro(300, "Aprendendo Java");
        Livro livro2 = new Livro(250, "Programacao Avancada");
        Livro livro3 = new Livro(300, "Aprendendo Java");

        // Testando os getters
        System.out.println("Titulo do livro1: " + livro1.getTitulo());
        System.out.println("Total de paginas do livro1: " + livro1.getPag());

        // Testando o metodo ler
        System.out.println("\nTestando metodo ler");
        System.out.println("Leu 100 paginas do livro1: " + livro1.ler(100)); // Deve retornar false
        System.out.println("Leu mais 200 paginas do livro1: " + livro1.ler(200)); // Deve retornar true
        System.out.println("Tentativa de leitura adicional do livro1: " + livro1.ler(10)); // Deve retornar false

        // Testando o metodo recomeca
        System.out.println("\nTestando metodo recomeca");
        livro1.recomeca();
        System.out.println("Livro1 apos recomeco: \n" + livro1);

        // Testando o metodo equals
        System.out.println("\nTestando metodo equals");
        System.out.println("Livro1 e Livro2 sao iguais? " + livro1.equals(livro2)); // Deve retornar false
        System.out.println("Livro1 e Livro3 sao iguais? " + livro1.equals(livro3)); // Deve retornar true

        // Testando o metodo toString
        System.out.println("\nTestando metodo toString");
        System.out.println("Informacoes do livro1:\n" + livro1);
        System.out.println("Informacoes do livro2:\n" + livro2);
    }
}
