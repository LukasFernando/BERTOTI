package observer.antiPattern;

public class Carro extends Update{
    String modelo;
    String fabricante;
    String motor;

    public Carro(String modelo, String fabricante, String motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
    }
}
