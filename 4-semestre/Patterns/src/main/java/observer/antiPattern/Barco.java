package observer.antiPattern;

public class Barco {
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

    public void update(){
        System.out.println("BARCO " + modelo + " - O barco passou na manutenção.");
    }
}
