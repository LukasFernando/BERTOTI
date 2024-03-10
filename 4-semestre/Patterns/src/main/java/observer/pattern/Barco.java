package observer.pattern;

public class Barco implements Observer {
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
    public void update() {
        System.out.println("BARCO - O barco passou na manutenção.");
    }

}
