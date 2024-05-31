package facade.pattern;

public class Cliente {
    public static void main(String[] args) {
        FacadeAssistenciaViagem assistenciaViagemFacade = new FacadeAssistenciaViagem();
        assistenciaViagemFacade.reservarViagem("Paris");
    }
}