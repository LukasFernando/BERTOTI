package composite.pattern;

public class ItemCaderno  implements Component{
    String nome;
    Double preco;

    public ItemCaderno(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" + "Preço: " + preco;
    }
}
