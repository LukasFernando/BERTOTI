package strategy.pattern;

public class Aluno {
    private String nome;
    private Status status;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void fecharNota(){
        status.fecharNota();
    }
}
