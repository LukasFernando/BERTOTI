package testes;

import main.Computador;
import main.Informatica;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InformaticaTest {

    @Test
    public void main() {
        // Criando os Objetos de Computador
        ComputadoresSalvos compParaUsar = new ComputadoresSalvos();
        // Criando o objeto Informatica
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        listaComputadores.add(compParaUsar.comp_1);
        listaComputadores.add(compParaUsar.comp_2);
        listaComputadores.add(compParaUsar.comp_3);
        listaComputadores.add(compParaUsar.comp_4);
        listaComputadores.add(compParaUsar.comp_5);
        Informatica informatica = new Informatica(listaComputadores);

        // Contando a quantidade de computadores
        assertEquals("Erro: Quantidade de computadores não estão iguais", listaComputadores.size(), informatica.contarComputadores());

        // Adicionando computadores um a um
        informatica.adicionarComputador(compParaUsar.comp_6);
        informatica.adicionarComputador(compParaUsar.comp_7);
        informatica.adicionarComputador(compParaUsar.comp_8);

        // Adicionando computadores com uma lista
        ArrayList<Computador> lista2 = new ArrayList<>();
        lista2.add(compParaUsar.comp_9);
        lista2.add(compParaUsar.comp_10);
        informatica.adicionarComputador(lista2);

        // Contando a quantidade de computadores de novo porque adicionamos mais computadores
        assertEquals("Erro: Quantidade de computadores não estão iguais", listaComputadores.size(), informatica.contarComputadores());

        // Fazedo Solicitações
        Map<String, String> manutencao = new HashMap<>();
        manutencao.put("id", "1");
        manutencao.put("Manutenção", "O computador não esta ligando");
        manutencao.put("Informatica", "Sala 10");
        manutencao.put("Endereção", "SJC");
        informatica.solicitarManutencao(manutencao);

        Map<String, String> novoComputador = new HashMap<>();
        manutencao.put("id", "1");
        novoComputador.put("nome", "PC Gamer");
        novoComputador.put("marca", "Sansumg");
        novoComputador.put("ram", "16");
        novoComputador.put("ssd", "256");
        novoComputador.put("Motivo", "Esta faltando computador na sala");
        informatica.solicitarNovoComputador(novoComputador);

        // Validando a quantidade de solicitações que tem
        assertEquals("Erro: A quantidade de solicitações para manutenção esta incorreta", 1, informatica.contarSolicitacoesManutencao());
        assertEquals("Erro: A quantidade de solicitações para pedir novo computador esta incorreta", 1, informatica.contarSolicitacoesComputador());
    }
}