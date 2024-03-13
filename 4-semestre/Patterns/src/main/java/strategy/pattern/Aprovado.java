package strategy.pattern;

public class Aprovado implements Status{
    private double nota;

    Aprovado(){
        double a = Math.round(Math.random()*10);
        nota = a >= 6 ? a : Math.min(10, Math.max(6, a+a));
    }

    @Override
    public void fecharNota() {
        System.out.println("Aluno Aprovado \nNota: " + nota);
    }
}
