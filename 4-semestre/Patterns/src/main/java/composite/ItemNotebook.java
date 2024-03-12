package composite.pattern;

public class ItemNotebook implements Component{
    String nome;
    Double preco;

    public ItemNotebook(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" + "Preço: " + preco;
    }
}
