package main;

import java.util.ArrayList;

public class Estoque {
    private final ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    public void adicionarComputadoresNoEstoque(ArrayList<Computador> lista){
        listaDeComputadores.addAll(lista);
    }

    public void adicionarComputadoresNoEstoque(Informatica informatica){
        listaDeComputadores.addAll(informatica.pegarComputadoresDaInformatica());
    }

    public Computador procurarComputadorNoEstoque(String id){
        for (Computador comp : listaDeComputadores){
            if (comp.getId().equals(id)){
                return comp;
            }
        }
        return null;
    }

    public int contarComputadoresNoEstoque(){
        return listaDeComputadores.size();
    }
}
