package testes;

import main.Computador;
import main.Estoque;
import main.Informatica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TesteManual {
    public static void main(String[] args){
        System.out.println("Criando os objetos Computaor...\n");
//        Criando os computadores (como é para testar a classe Computador, não vou usar a classe ComputadoresSalvos)
        Computador comp_2 = new Computador("10", "PC Gamer", "LG", "32", "512");
        Computador comp_1 = new Computador("1", "Notebook para escritorio", "LG", "32", "512");
        Computador comp_3 = new Computador("1", "PC simples", "LG", "8", "512");
        Computador comp_4 = new Computador("15", "Notebook", "Sansumg", "16", "256");
        Computador comp_5 = new Computador("150", "PC Gamer", "Dell", "32", "512");

        System.out.println("Total de 5 computadores foram criados!\n");

        System.out.println("Adicionando os objetos Computadores em uma lista...\n");
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        listaComputadores.add(comp_1);
        listaComputadores.add(comp_2);
        listaComputadores.add(comp_3);
        listaComputadores.add(comp_4);
        listaComputadores.add(comp_5);

//        Testar a classe main.Informatica
        System.out.println("Iniciando o teste da classe main.Informatica...");
        Informatica informatica_1 = new Informatica(listaComputadores);
        System.out.println("Classe instanciada!");
        System.out.println("Criando um Map com as infornações de um computador para pode fazer uma solicitação...");
        Map<String, String> novoComputador = new HashMap<>();
        novoComputador.put("preço", "2.560,90");
        novoComputador.put("marca", "Sansumg");
        novoComputador.put("ssd", "256");
        System.out.println("Fazendo uma solicitação de um novo computador");
        informatica_1.solicitarNovoComputador(novoComputador);

//        Testar a classe main.Estoque
        System.out.println("Chamando a classe main.Estoque e passando os parametro de lista de computadores");
        Estoque estoque = new Estoque();
        System.out.println("Adicionando uma lista de computadores no estoque");
        estoque.adicionarComputadoresNoEstoque(listaComputadores);
        String id = "1";
        System.out.println("Pegando o Objeto computador do estoque que tem o id = "+id);
        Computador comp = estoque.procurarComputadorNoEstoque(id);
        System.out.println("Imprimindo o nome e a marca do computador que foi buscado pelo id = "+id);
        System.out.println("nome:  "+comp.getNome()+"\nmarca:  "+comp.getMarca());

//        Testar a classe main.Informatica metodo solicitarNovoManutencao e imprimirSolicitacoesManutencao
        System.out.println("\nUsando a instancia informatica_1 para solicitar Manutenção");
        Map<String, String> manutencao = new HashMap<>();
        manutencao.put("Motivo", "O computador não esta ligando");
        manutencao.put("Id do computador", informatica_1.pegarComputadoresDaInformatica().get(0).getId());
        informatica_1.solicitarManutencao(manutencao);
        System.out.println("Manutenção solicitada!");
        System.out.println("Imprimindo todas as manutenções...");

    }
}
