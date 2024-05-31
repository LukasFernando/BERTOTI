package facade.antiPattern;

public class Cliente {
    public static void main(String[] args) {
        ReservaHotel reservaHotel = new ReservaHotel();
        AluguelCarro aluguelCarro = new AluguelCarro();
        AgenciaViagens agenciaViagens = new AgenciaViagens();

        String destino = "Paris";

        reservaHotel.fazerReservaHotel(destino);
        aluguelCarro.alugarCarro(destino);
        agenciaViagens.reservarPassagens(destino);
    }
}
