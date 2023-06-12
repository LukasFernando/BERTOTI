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

        // Guardando os Objetos em Informatica e em Lista
        ArrayList<Computador> lista1 = new ArrayList<>();
        lista1.add(compParaUsar.comp_1);
        lista1.add(compParaUsar.comp_2);
        lista1.add(compParaUsar.comp_3);
        lista1.add(compParaUsar.comp_4);
        lista1.add(compParaUsar.comp_5);
        ArrayList<Computador> lista2 = new ArrayList<>();
        lista2.add(compParaUsar.comp_6);
        lista2.add(compParaUsar.comp_7);
        lista2.add(compParaUsar.comp_8);
        lista2.add(compParaUsar.comp_9);
        lista2.add(compParaUsar.comp_10);
        Informatica informatica = new Informatica(lista1);

        // Salvando no Estoque
        Estoque estoque = new Estoque();
        estoque.adicionarComputadores(informatica);
        assertEquals("Erro: A quantidade de Computadores esta diferente", informatica.contarComputadores(), estoque.listaDeComputadores.size());
        estoque.adicionarComputadores(lista2);
        assertEquals("Erro: A quantidade de Computadores esta diferente", lista2.size() + informatica.contarComputadores(), estoque.listaDeComputadores.size());

        // Pegando um Computador do Estoque
        String id = "2";
        String nome = "Notebook de teste";
        String marca = "Teste";
        String ram = "32";
        String ssd = "512";
        Computador comp = new Computador(id, nome, marca, ram, ssd);
        assertEquals("Erro: O Computador não é o mesmo", comp.getId(), id);
        assertEquals("Erro: O Computador não é o mesmo", comp.getNome(), nome);
        assertEquals("Erro: O Computador não é o mesmo", comp.getMarca(), marca);
        assertEquals("Erro: O Computador não é o mesmo", comp.getRam(), ram);
        assertEquals("Erro: O Computador não é o mesmo", comp.getSsd(), ssd);
    }
}