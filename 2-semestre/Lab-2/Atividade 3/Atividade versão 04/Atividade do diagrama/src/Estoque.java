import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Estoque {
    ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    public void adicionarComputadores(ArrayList<Computador> lista){
        listaDeComputadores.addAll(lista);
    }

    public void adicionarComputadores(Informatica informatica){
        listaDeComputadores.addAll(informatica.pegarTodosComputadores());
    }

    public Computador pegarComputador(String id){
        for (Computador comp : listaDeComputadores){
            if (comp.pegarId().equals(id)){
                return comp;
            }
        }
        return null;
    }
}

