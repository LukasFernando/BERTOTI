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
        Computador comp_1 = compParaUsar.comp_1;
        Computador comp_2 = compParaUsar.comp_2;
        Computador comp_3 = compParaUsar.comp_3;
        Computador comp_4 = compParaUsar.comp_4;
        Computador comp_5 = compParaUsar.comp_5;

        // Criando o objeto Informatica
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        listaComputadores.add(comp_1);
        listaComputadores.add(comp_2);
        listaComputadores.add(comp_3);
        listaComputadores.add(comp_4);
        listaComputadores.add(comp_5);
        Informatica informatica = new Informatica(listaComputadores);

        // Contando a quantidade de computadores
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