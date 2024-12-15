package livraria;
import java.time.Duration;
import java.time.LocalDateTime;

public class TesteLivraria {
    public static void main(String[] args) {
        // Testando Produto
        Produto produto = new Produto("Produto Genérico", 25.90);
        System.out.println(produto);
        produto.setPreco(30.00);
        System.out.println("Preco atualizado: " + produto.getPreco());

        // Testando Livro
        Livro livro = new Livro("Java Avançado", 45.50, "João Silva", "Editora ABC");
        System.out.println("\nLivro:");
        System.out.println(livro);
        livro.setEditora("Editora XYZ");
        System.out.println("Editora atualizada: " + livro.getEditora());

        // Testando Revista
        Revista revista = new Revista("Ciência Hoje", 12.00, "Ciência");
        System.out.println("\nRevista:");
        System.out.println(revista);
        revista.setGenero("Educação");
        System.out.println("Gênero atualizado: " + revista.getGenero());

        // Testando Jornal
        Jornal jornal = new Jornal("Jornal Diário", 5.00, LocalDateTime.of(2024, 12, 14, 8, 30));
        System.out.println("\nJornal:");
        System.out.println(jornal);
        jornal.setGenero(LocalDateTime.of(2024, 12, 15, 9, 0));
        System.out.println("Data atualizada: " + jornal.getGenero());

        // Testando BlueRay
        BlueRay blueRay = new BlueRay("Filme Épico", 50.00, Duration.ofHours(2).plusMinutes(30).plusSeconds(15));
        System.out.println("\nBlueRay:");
        System.out.println(blueRay);
        blueRay.setDuracao(Duration.ofHours(3).plusMinutes(45));
        System.out.println("Duração atualizada: " + blueRay.getDuracao());

        // Testando validações e exceções
        System.out.println("\nTestando validações:");
        try {
            Produto produtoInvalido = new Produto(null, -10);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Livro livroInvalido = new Livro(null, 20.00, null, "Editora");
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            BlueRay blueRayInvalido = new BlueRay("Filme Inválido", 40.00, Duration.ZERO);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

