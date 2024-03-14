package composite.pattern;

public class ItemLapis  implements Component{
    String nome;
    Double preco;

    public ItemLapis(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" + "Preço: " + preco;
    }
}
