import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Estoque {
    ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    public Estoque(ArrayList<Computador> lista){
        listaDeComputadores.addAll(lista);
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
