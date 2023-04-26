package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Informatica {
    ArrayList<Computador> listaDeComputadores;
    ArrayList<Map<String, String>> solicitacoesComputador = new ArrayList<>();
    ArrayList<Map<String, String>> solicitacoesManutencao = new ArrayList<>();

    public Informatica(ArrayList<Computador> listaDeComputadores){
        this.listaDeComputadores = listaDeComputadores;
    }

    public void solicitarNovoComputador(Map<String, String> computadorInfo){
        solicitacoesComputador.add(computadorInfo);
    }

//    public void solicitarManutencao(String idComputador, String informacaoDaManutencao) {
//        try{
//            Map<String, String> comp = Objects.requireNonNull(pegarComputador(idComputador)).pegarTodasInformcoes();
//            comp.put("Manutenção", informacaoDaManutencao);
//            this.solicitacoesManutencao.add(comp);
//        }
//        catch (NullPointerException erro){
//            System.out.println("O main.Computador com o id = "+ idComputador +" não existe nessa informatica... \n** Erro: " + erro + " **");
//        }
//    }
    public void solicitarManutencao(Map<String, String> informacaoDaManutencao) {
        this.solicitacoesManutencao.add(informacaoDaManutencao);
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

    private Computador pegarComputador(String id){
        for (Computador comp : listaDeComputadores) {
            if (comp.pegarId().equals(id)) {
                return comp;
            }
        }
        return null;
    }

    public ArrayList<Computador> pegarTodosComputadores(){
        return listaDeComputadores;
    }
}
