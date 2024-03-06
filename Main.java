import observer.*;

public class Main {
    public static void main(String[] args) {
        Veiculos veiculos = new Veiculos();


        Observer carro = new Carro("bmw i4", "bmw", "bmw-12o09");
        Observer barco = new Barco("m-12", "lancha", "sbt", 12.90);
        Observer aviao = new Aviao("Airbus A340", "AIRBUS", "m10-98lr", 7.5);

        veiculos.adicionarVeiculo(carro);
        veiculos.adicionarVeiculo(barco);
        veiculos.adicionarVeiculo(aviao);

        veiculos.ligarTodosVeiculos();
        veiculos.andarComTodosVeiculos();
    }
}
