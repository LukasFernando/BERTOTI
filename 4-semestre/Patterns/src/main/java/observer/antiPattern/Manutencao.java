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
        for(Aviao aviao : avioes){
            aviao.update("aviao", aviao.modelo);
        }
        for(Barco barco : barcos){
            barco.update("barco", barco.modelo);
        }
        for(Carro carro : carros){
            carro.update("carro", carro.modelo);
        }
    }
}
