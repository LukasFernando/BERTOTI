package observer.antiPattern;

import java.util.List;

public class Manutencao {
    List<Aviao> avioes;
    List<Barco> barcos;
    List<Carro> carros;

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
    }
}
