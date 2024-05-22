package strategy.pattern;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Aluno");

        aluno.setStatus(new Aprovado());
        aluno.fecharNota();

        aluno.setStatus(new Reprovado());
        aluno.fecharNota();

    }
}
