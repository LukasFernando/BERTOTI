package strategy.antiPattern;

public class Aluno {
    private double nota;
    private boolean aprovado;

    public void calcularMedia() {
        double a = Math.round(Math.random()*10);
        nota = Math.round(Math.random()*10);
        aprovado = nota >= 6 ? true : false;
    }

    public void mostrarStatus() {
        if (aprovado) {
            System.out.println("Aluno Aprovado \nNota: " + nota);
        } else {
            System.out.println("Aluno Reprovado \nNota: " + nota);
        }
    }
}
