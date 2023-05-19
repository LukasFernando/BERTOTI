

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Teste {
    public static void main(String[] args){
        Computador comp = new Computador("1", "PC Gamer", "LG", "32", "512");

//        Map<String, String> mudanca = new HashMap<>();
//        mudanca.put("ssd", "256");
//        mudanca.put("marca", "Sansumg");
//        mudanca.put("ram", "16");
//        comp.editarComputador(mudanca);

        Map<Integer, String> teste = new HashMap<>();
        teste.put(1, "256");
        teste.put(2, "Sansumg");
        teste.put(5, "16");
        Set<Integer> todosId = teste.keySet();
        System.out.println(todosId.stream().max());
    }
}
