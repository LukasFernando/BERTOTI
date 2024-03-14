package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Mochila implements Component {
    List<Categoria> categorias = new ArrayList<>();

    public Mochila() {
    }

    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);
    }

    public void imprimirItems(){
        for(Categoria categoria : categorias){
            categoria.imprimirTodosItems();
        }
    }
}
