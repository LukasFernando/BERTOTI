import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Estoque {
    private ArrayList<Produto> lista_produtos = new ArrayList<Produto>();
    public void adicionarProduto(Produto ... produtos){
//        this.lista_produtos.addAll(Arrays.asList(produtos));
        Collections.addAll(this.lista_produtos, produtos);
    }
    public void imprimirProdutos(){
        for (Produto produto: lista_produtos) {
            System.out.println(produto.nome);
        }
    }

    public Produto buscaProduto(String nome){
        for (Produto produto: this.lista_produtos){
            if (produto.nome.equals(nome)){
                return produto;
            }
        }
        return null;
    }
}
