package observer.antiPattern;

public class Aviao {
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

    public void update(){
        System.out.println("AVIÃO " + modelo + " - O avião passou na manutenção.");
    }
}
