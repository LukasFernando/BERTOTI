package observer.pattern;

public class Main {
    public static void main(String[] args) {
        Manutencao Manutencao = new Manutencao();

        Observer aviao = new Aviao("Airbus A340", "AIRBUS", "m10-98lr", 7.5);
        Observer barco = new Barco("m-12", "lancha", "sbt", 12.90);
        Observer carro = new Carro("bmw i4", "bmw", "bmw-12o09");

        Manutencao.adicionarVeiculo(carro);
        Manutencao.adicionarVeiculo(barco);
        Manutencao.adicionarVeiculo(aviao);

        Manutencao.notificar();
    }
}
