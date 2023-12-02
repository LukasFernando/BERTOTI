
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Informatica {
    ArrayList<Computador> listaDeComputadores;
//    Map<String, String> solicitacoesComputador;
//    Map<String, String> solicitacoesManutencao;
    ArrayList<Map<String, String>> solicitacoesComputador;
    ArrayList<Computador> solicitacoesManutencao;


    public Informatica(ArrayList<Computador> listaDeComputadores){
        this.listaDeComputadores = listaDeComputadores;
    }

    public void solicitarNovoComputador(Map<String, String> computadorInfo){
        solicitacoesComputador.add(computadorInfo);
    }

    public void solicitarNovoManutencao(Computador computador){
        solicitacoesManutencao.add(computador);
    }

    public void imprimirSolicitacoesManutencao(){
        for (Map<String, String> mapInfo : this.solicitacoesComputador){
            Set<String> keys = mapInfo.keySet();
            for (String key : keys) {
                System.out.println(key + " : " + mapInfo.get(key));
            }
        }
    }

    public void imprimirSolicitacoesComputador(){

    }

    private String pegarProximoId(Set<String> listaId){
        int maiorId = -1;
        for (String id : listaId){
            int idNumero = new Integer(id);
            if (idNumero > maiorId){
                maiorId = idNumero;
            }
        }
        return Integer.toString(maiorId);
    }
}