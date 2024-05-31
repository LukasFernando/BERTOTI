package facade.pattern;

class FacadeAssistenciaViagem {
    private ReservaHotel reservaHotel;
    private AluguelCarro aluguelCarro;
    private AgenciaViagens agenciaViagens;

    public FacadeAssistenciaViagem() {
        this.reservaHotel = new ReservaHotel();
        this.aluguelCarro = new AluguelCarro();
        this.agenciaViagens = new AgenciaViagens();
    }

    public void reservarViagem(String destino) {
        reservaHotel.fazerReservaHotel(destino);
        aluguelCarro.alugarCarro(destino);
        agenciaViagens.reservarPassagens(destino);
    }
}