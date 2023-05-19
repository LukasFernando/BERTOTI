package main;

import java.util.*;

public class Informatica {
    private ArrayList<Computador> listaDeComputadores = new ArrayList<>();
    private final ArrayList<Map<String, String>> solicitacoesComputador = new ArrayList<>();
    private final ArrayList<Map<String, String>> solicitacoesManutencao = new ArrayList<>();
    private final Map<String, String> alugelDeComputadores = new HashMap<>();

    public Informatica(ArrayList<Computador> listaDeComputadores){
        this.listaDeComputadores = listaDeComputadores;
    }

    public void adicionarComputador(Computador computador){
        this.listaDeComputadores.add(computador);
    }

    public void adicionarComputador(ArrayList<Computador> computadores){
        this.listaDeComputadores.addAll(computadores);
    }

    private Computador pegarComputador(String id){
//        try{
        for (Computador comp : this.listaDeComputadores) {
            if (comp.getId().equals(id)) {
                return comp;
            }
        }
//        }
//        catch (Exception ignored){}
        return null;
    }

    public ArrayList<Computador> pegarTodosComputadores(){
        return this.listaDeComputadores;
    }

    public boolean alugarComputador(String diaParaAlugar, String computadorId){
        if (!this.alugelDeComputadores.containsKey(diaParaAlugar) && pegarComputador(computadorId) != null){
            this.alugelDeComputadores.put(diaParaAlugar, "Teste 22");
            return true;
        }
        return false;
    }

    public void solicitarNovoComputador(Map<String, String> computadorInfo){
        this.solicitacoesComputador.add(computadorInfo);
    }

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

    public int contarComputadores(){
        return this.listaDeComputadores.size();
    }

    public int contarSolicitacoesComputador(){
        return this.solicitacoesComputador.size();
    }

    public int contarSolicitacoesManutencao() {
        return this.solicitacoesManutencao.size();
    }
}
