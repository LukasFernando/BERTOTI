package observer.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Manutencao {
    List<Aviao> avioes = new ArrayList<>();
    List<Barco> barcos = new ArrayList<>();
    List<Carro> carros = new ArrayList<>();

    public void adicionarAviao(Aviao aviao){
        avioes.add(aviao);
    }

    public void adicionarBarco(Barco barco){
        barcos.add(barco);
    }

    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

    public void notificar(){
        avioes.forEach(Aviao::update);
        barcos.forEach(Barco::update);
        carros.forEach(Carro::update);
    }
}
