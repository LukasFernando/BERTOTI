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
        assertEquals("Erro: Quantidade de computadores não estão iguais", listaComputadores.size(), informatica.contarComputadoresNaInformatica());

        // Adicionando computadores um a um
        informatica.adicionarComputadorNaInformatica(compParaUsar.comp_6);
        informatica.adicionarComputadorNaInformatica(compParaUsar.comp_7);
        informatica.adicionarComputadorNaInformatica(compParaUsar.comp_8);

        // Contando a quantidade de computadores
        assertEquals("Erro: Quantidade de computadores não estão iguais", listaComputadores.size()+3, informatica.contarComputadoresNaInformatica());

        // Adicionando computadores com uma lista
        ArrayList<Computador> lista2 = new ArrayList<>();
        lista2.add(compParaUsar.comp_9);
        lista2.add(compParaUsar.comp_10);
        informatica.adicionarComputadorNaInformatica(lista2);

        // Contando a quantidade de computadores de novo porque adicionamos mais computadores
        assertEquals("Erro: Quantidade de computadores não estão iguais", listaComputadores.size()+lista2.size()+3, informatica.contarComputadoresNaInformatica());

        // Fazedo Solicitações de manutenção
        Map<String, String> manutencao = new HashMap<>();
        manutencao.put("id do computador", "1");
        manutencao.put("Manutenção", "O computador não esta ligando");
        manutencao.put("Sala da informatica", "Sala 10");
        manutencao.put("Endereção da informatica", "SJC");
        informatica.solicitarManutencao(manutencao);

        // Fazedo Solicitações de novo computador
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

        // Fazedo Solicitações de manutenção
        Map<String, String> manutencao2 = new HashMap<>();
        manutencao.put("id do computador", "1");
        manutencao.put("Manutenção", "O computador esta com tela azul");
        manutencao.put("Endereção", "SJC");
        informatica.solicitarManutencao(manutencao2);

        // Fazedo Solicitações de novo computador
        Map<String, String> novoComputador2 = new HashMap<>();
        manutencao.put("id", "1");
        novoComputador.put("nome", "PC para escritorio");
        novoComputador.put("marca", "Acer");
        novoComputador.put("ram", "8");
        novoComputador.put("ssd", "512");
        novoComputador.put("Motivo", "A sala da informatica esta precisando de um computador para o professor");
        informatica.solicitarNovoComputador(novoComputador2);

        // Validando a quantidade de solicitações que tem
        assertEquals("Erro: A quantidade de solicitações para manutenção esta incorreta", 2, informatica.contarSolicitacoesManutencao());
        assertEquals("Erro: A quantidade de solicitações para pedir novo computador esta incorreta", 2, informatica.contarSolicitacoesComputador());
    }
}