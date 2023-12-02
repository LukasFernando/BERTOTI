package testes;

import main.Computador;
import main.Estoque;
import main.Informatica;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EstoqueTest {

    @Test
    public void main() {
        // Pegando os computadores
        ComputadoresSalvos compParaUsar = new ComputadoresSalvos();
        Computador comp_1 = compParaUsar.comp_1;
        Computador comp_2 = compParaUsar.comp_2;
        Computador comp_3 = compParaUsar.comp_3;
        Computador comp_4 = compParaUsar.comp_4;
        Computador comp_5 = compParaUsar.comp_5;
        Computador comp_6 = compParaUsar.comp_1;
        Computador comp_7 = compParaUsar.comp_2;
        Computador comp_8 = compParaUsar.comp_3;
        Computador comp_9 = compParaUsar.comp_4;
        Computador comp_10 = compParaUsar.comp_5;

        // Guardando os Objetos em Informatica e em Lista
        ArrayList<Computador> lista1 = new ArrayList<>();
        lista1.add(comp_1);
        lista1.add(comp_2);
        lista1.add(comp_3);
        lista1.add(comp_4);
        lista1.add(comp_5);
        ArrayList<Computador> lista2 = new ArrayList<>();
        lista2.add(comp_6);
        lista2.add(comp_7);
        lista2.add(comp_8);
        lista2.add(comp_9);
        lista2.add(comp_10);
        Informatica informatica = new Informatica(lista1);

        // Salvando no Estoque
        Estoque estoque = new Estoque();
        estoque.adicionarComputadores(informatica);
        estoque.adicionarComputadores(lista2);

    }
}