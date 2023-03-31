
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Informatica {
    ArrayList<Computador> listaDeComputadores = new ArrayList<>();
    ArrayList<Map<String, String>> solicitacoesComputador = new ArrayList<>();
    ArrayList<Map<String, String>> solicitacoesManutencao = new ArrayList<>();

    public Informatica(ArrayList<Computador> listaDeComputadores){
        this.listaDeComputadores = listaDeComputadores;
    }

    public void solicitarNovoComputador(Map<String, String> computadorInfo){
        solicitacoesComputador.add(computadorInfo);
    }

    public void solicitarNovoManutencao(Map<String, String> computador){
        solicitacoesManutencao.add(computador);
    }

    public void imprimirSolicitacoesComputador(){
        for (Map<String, String> mapInfo : this.solicitacoesComputador){
            Set<String> keys = mapInfo.keySet();
            for (String key : keys) {
                System.out.println(key + " : " + mapInfo.get(key));
            }
            System.out.println();
        }
    }

    public void imprimirSolicitacoesManutencao(){
        for (Map<String, String> mapInfo : this.solicitacoesManutencao){
            Set<String> keys = mapInfo.keySet();
            for (String key : keys) {
                System.out.println(key + " : " + mapInfo.get(key));
            }
            System.out.println();
        }
    }

    public ArrayList<Computador> pegarTodosComputadores(){
        return listaDeComputadores;
    }
}