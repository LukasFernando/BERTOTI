package observer;

public class Barco implements Observer{
    String modelo;
    String tipo;
    String fabricante;
    Double pes;

    public Barco(String modelo, String tipo, String fabricante, Double pes) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.pes = pes;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o barco...");
    }

    @Override
    public void andar() {
        System.out.println("O barco esta andando no meio do oceano!");
    }
}
