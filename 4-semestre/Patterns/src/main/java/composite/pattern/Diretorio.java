package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Component{
    private String nome;
    private List<Component> listaDeComponentes;

    public Diretorio(String nome) {
        this.nome = nome;
        this.listaDeComponentes = new ArrayList<>();
    }

    public void adicionarItem(Component item){
        listaDeComponentes.add(item);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do diretorio: " + this.nome);
        System.out.println("Itens dentro desse diretorio:");
        for(Component component : listaDeComponentes){
            System.out.println("    "+component);
        }
        System.out.println("Fim do dicionario.\n");
    }

    @Override
    public String toString() {
        return "Diretorio{ nome = '" + nome + "', listaDeComponentes = Impossivel de ver a lista de items dentro desse diretorio acessando de fora desse diretorio }";
    }
}
