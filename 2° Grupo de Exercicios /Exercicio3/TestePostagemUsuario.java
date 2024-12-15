package Exercicio3;

public class TestePostagemUsuario {
    public static void main(String[] args) {
        // Criando objetos Usuario
        Usuario usuario1 = new Usuario("Joao Silva", "joao123");
        Usuario usuario2 = new Usuario("Maria Oliveira", "maria456");

        // Testando getters e setters
        System.out.println("Nome do usuario1: " + usuario1.getNome());
        System.out.println("Login do usuario1: " + usuario1.getLogin());

        usuario1.setNome("Joao Santos");
        usuario1.setLogin("joaos");

        System.out.println("Novo nome do usuario1: " + usuario1.getNome());
        System.out.println("Novo login do usuario1: " + usuario1.getLogin());

        // Testando postagem de conteudo
        System.out.println("\nPostando conteudos para usuario1...");
        usuario1.posta("Primeira postagem");
        usuario1.posta("Segunda postagem");

        System.out.println("\nPostando conteudos para usuario2...");
        usuario2.posta("Postagem de Maria");

        // Testando getTotalPosts
        System.out.println("\nTotal de postagens do usuario1: " + usuario1.getTotalPosts());
        System.out.println("Total de postagens do usuario2: " + usuario2.getTotalPosts());

        // Testando buscaPost
        System.out.println("\nBuscando postagem no usuario1...");
        Postagem busca = usuario1.buscaPost("Primeira");
        System.out.println(busca != null ? "Postagem encontrada: " + busca : "Postagem nao encontrada");

        // Testando getPost
        System.out.println("\nObtendo postagem especifica do usuario1...");
        Postagem post = usuario1.getPost(1);
        System.out.println("Conteudo da postagem: " + post);

        // Testando apaga
        System.out.println("\nApagando uma postagem do usuario1...");
        boolean apagou = usuario1.apaga(post);
        System.out.println(apagou ? "Postagem apagada com sucesso" : "Erro ao apagar postagem");

        // Testando toString e equals
        System.out.println("\nInformacoes do usuario1:\n" + usuario1);
        System.out.println("\nUsuario1 e Usuario2 sao iguais? " + usuario1.equals(usuario2));

        // Testando excecoes ao postar conteudo nulo
        System.out.println("\nTestando postagem de conteudo nulo:");
        try {
            usuario1.posta(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}