// TesteAnimais.java
package animais;

public class TesteAnimais {
    public static void main(String[] args) {
        // Testando a classe Cachorro
        Animal cachorro = new Cachorro("Rex");
        System.out.println("Cachorro: " + cachorro.getNome() + " - Som: " + cachorro.seComunica());

        // Testando a classe Gato
        Animal gato = new Gato("Mimi");
        System.out.println("Gato: " + gato.getNome() + " - Som: " + gato.seComunica());

        // Testando a classe Humano
        Animal humano = new Humano("Ana");
        System.out.println("Humano: " + humano.getNome() + " - Fala: " + humano.seComunica());

        // Testando a classe Pato
        Animal pato = new Pato("Donald");
        System.out.println("Pato: " + pato.getNome() + " - Som: " + pato.seComunica());

        // Testando validação de nome nulo
        System.out.println("\nTestando validações:");
        try {
            Animal animalInvalido = new Cachorro(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            Animal humanoInvalido = new Humano("");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
