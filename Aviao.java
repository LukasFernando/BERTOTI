package observer;

public class Aviao implements Observer{
    String modelo;
    String fabricante;
    String motor;
    Double tamanhoAsas;

    public Aviao(String modeloAviao, String fabricante, String motor, Double tamanhoAsas) {
        this.modelo = modeloAviao;
        this.fabricante = fabricante;
        this.motor = motor;
        this.tamanhoAsas = tamanhoAsas;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o avião...");
    }

    @Override
    public void andar() {
        System.out.println("O avião esta voando!");
    }
}
