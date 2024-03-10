package observer.pattern;

public class Carro implements Observer {

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
        System.out.println("CARRO " + modelo + " - O carro passou na manutenção.");
    }

}
