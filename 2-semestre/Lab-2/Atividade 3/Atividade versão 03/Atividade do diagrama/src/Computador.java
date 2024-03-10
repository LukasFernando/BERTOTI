import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Computador {
//    String id;
//    String nome;
//    String marca;
//    String ram;
//    String ssd;
    private Map<String, String> computador = new HashMap<>();

    public Computador(String id, String nome, String marca, String ram, String ssd){
//        this.id = id;
//        this.nome = nome;
//        this.marca = marca;
//        this.ram = ram;
//        this.ssd = ssd;
        this.computador.put("id", id);
        this.computador.put("nome", nome);
        this.computador.put("marca", marca);
        this.computador.put("ram", ram);
        this.computador.put("ssd", ssd);

    }

    public void editarComputador(Map<String, String> mudancas){
        /*
        * Descrição
        Esse metodo vai editar as informações do computador.
        * Argumentos
        Map : mudancas - Um HashMap com as mudanças que você que aplicar
        */

        Set<String> keys = this.computador.keySet();
//        System.out.println(keys.);
        for (String key : keys){
            String novoItem = mudancas.get(key);
            if (novoItem != null){
                this.computador.replace(key, novoItem);
            }
        }
    }

    public String pegarId(){
        return computador.get("id");
    }

    public void imprimirTodasInformcoes(){
        for (String key : computador.keySet()){
            System.out.println(key + " : " + computador.get(key));
        }
    }
}
