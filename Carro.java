package observer;

public class Carro implements Observer{

    String modelo;
    String fabricante;
    String motor;

    public Carro(String modelo, String fabricante, String motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro...");
    }

    @Override
    public void andar() {
        System.out.println("O carro esta andando e parou no semáforo!");
    }
}
