package main;

import java.util.ArrayList;

public class Estoque {
    public ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    public void adicionarComputadores(ArrayList<Computador> lista){
        listaDeComputadores.addAll(lista);
    }

    public void adicionarComputadores(Informatica informatica){
        listaDeComputadores.addAll(informatica.pegarTodosComputadores());
    }

    public Computador pegarComputador(String id){
        for (Computador comp : listaDeComputadores){
            if (comp.getId().equals(id)){
                return comp;
            }
        }
        return null;
    }
}
