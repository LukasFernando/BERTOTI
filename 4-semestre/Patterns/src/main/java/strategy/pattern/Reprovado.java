package strategy.pattern;

import java.text.DecimalFormat;

public class Reprovado implements Status{
    private double nota;

    Reprovado(){
        double a = Math.round(Math.random()*10);
        nota = a < 6 ? a : a-6;
    }

    @Override
    public void fecharNota() {
        System.out.println("Aluno Reprovado \nNota: " + nota);
    }
}
