package observer.antiPattern;

public class Barco extends Update{
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
}
