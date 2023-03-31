
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teste {
    public static void main(String[] args){
        System.out.println("Criando os objetos Computaor...\n");
        Computador comp_1 = new Computador("1", "Notebook para escritorio", "LG", "32", "512");
//        Mudando as informações dp computador
        Map<String, String> mudanca = new HashMap<>();
        mudanca.put("id", "256");
        mudanca.put("marca", "Sansumg");
        mudanca.put("ssd", "256");
        comp_1.editarComputador(mudanca);

        Computador comp_2 = new Computador("10", "PC Gamer", "LG", "32", "512");
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

        System.out.println("Chamando a classe Estoque e passando os parametro de lista de computadores");
        Estoque estoque = new Estoque(listaComputadores);
        Computador comp = estoque.pegarComputador("1");
        comp.imprimirTodasInformcoes();
    }
    public void testarComputador(){}
}
