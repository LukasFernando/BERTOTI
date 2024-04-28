package observer.antiPattern;

public class Aviao extends Update{
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
}
