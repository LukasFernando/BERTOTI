package observer.antiPattern;

public class Update {
    public void update(String tipoVeiculo, String modelo){
        switch (tipoVeiculo.toLowerCase()){
            case "aviao" -> System.out.println("AVIÃO " + modelo + " - O avião passou na manutenção.");
            case "barco" -> System.out.println("BARCO " + modelo + " - O barco passou na manutenção.");
            case "carro" -> System.out.println("CARRO " + modelo + " - O carro passou na manutenção.");
            default -> System.out.println("Manutençao para esse veiculo esta indisponivel");
        }
    }
}
