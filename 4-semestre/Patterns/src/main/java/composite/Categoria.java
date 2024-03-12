package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements Component {
    List<Component> items = new ArrayList<>();

    public void adicionarItem(Component item){
        items.add(item);
    }

    public void imprimirTodosItems(){
        items.forEach(System.out::println);
    }
}
