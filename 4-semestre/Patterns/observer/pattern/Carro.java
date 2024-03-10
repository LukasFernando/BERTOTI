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
    public void update() {
        System.out.println("CARRO - O carro passou na manutenção.");
    }

}
