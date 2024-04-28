package observer.antiPattern;


public class Main {
    public static void main(String[] args) {
        Manutencao manutencao = new Manutencao();

        Aviao aviao = new Aviao("Airbus A340", "AIRBUS", "m10-98lr", 7.5);
        Barco barco = new Barco("m-12", "lancha", "sbt", 12.90);
        Carro carro = new Carro("bmw i4", "bmw", "bmw-12o09");

        manutencao.adicionarAviao(aviao);
        manutencao.adicionarBarco(barco);
        manutencao.adicionarCarro(carro);

        manutencao.notificar();
    }
}
