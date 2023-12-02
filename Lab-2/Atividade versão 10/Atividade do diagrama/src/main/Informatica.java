package main;

import java.util.*;

public class Informatica {
    private final ArrayList<Computador> listaDeComputadores = new ArrayList<>();
    private final ArrayList<Map<String, String>> solicitacoesComputador = new ArrayList<>();
    private final ArrayList<Map<String, String>> solicitacoesManutencao = new ArrayList<>();

    public Informatica(ArrayList<Computador> listaDeComputadores){
        this.listaDeComputadores.addAll(listaDeComputadores);
    }

    public void adicionarComputadorNaInformatica(Computador computador){
        this.listaDeComputadores.add(computador);
    }

    public void adicionarComputadorNaInformatica(ArrayList<Computador> computadores){
        this.listaDeComputadores.addAll(computadores);
    }

    public ArrayList<Computador> pegarComputadoresDaInformatica(){
        return this.listaDeComputadores;
    }

    public void solicitarNovoComputador(Map<String, String> computadorInfo){
        this.solicitacoesComputador.add(computadorInfo);
    }

    public void solicitarManutencao(Map<String, String> informacaoDaManutencao) {
        this.solicitacoesManutencao.add(informacaoDaManutencao);
    }

    public int contarComputadoresNaInformatica(){
        return this.listaDeComputadores.size();
    }

    public int contarSolicitacoesComputador(){
        return this.solicitacoesComputador.size();
    }

    public int contarSolicitacoesManutencao() {
        return this.solicitacoesManutencao.size();
    }
}
