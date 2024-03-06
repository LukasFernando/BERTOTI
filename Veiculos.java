package observer;

import java.util.ArrayList;
import java.util.List;

public class Veiculos {
    List<Observer> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Observer veiculo){
        listaVeiculos.add(veiculo);
    }

    public void ligarTodosVeiculos(){
        for (Observer veiculo : listaVeiculos){
            veiculo.ligar();
        }
    }

    public void andarComTodosVeiculos(){
        for (Observer veiculo : listaVeiculos){
            veiculo.andar();
        }
    }
}
