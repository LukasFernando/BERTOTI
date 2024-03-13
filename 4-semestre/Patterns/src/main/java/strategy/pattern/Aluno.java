package strategy.pattern;

public class Aluno {
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public void fecharNota(){
        status.fecharNota();
    }
}
