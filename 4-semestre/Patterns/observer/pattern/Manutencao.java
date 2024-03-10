package observer;

import java.util.ArrayList;
import java.util.List;

public class Manutencao {
    List<Observer> listaVeiculos = new ArrayList<>();

    public void adicionarVeiculo(Observer veiculo){
        listaVeiculos.add(veiculo);
    }

    public void notificar(){
        for (Observer veiculo : listaVeiculos){
            veiculo.update();
        }
    }
}
