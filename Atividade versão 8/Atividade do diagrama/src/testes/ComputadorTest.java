package testes;

import main.Computador;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ComputadorTest {
    @Test
    public void main(){
        // Criando os Objetos de Computador
        ComputadoresSalvos compParaUsar = new ComputadoresSalvos();
        Computador comp_1 = compParaUsar.comp_1;
        Computador comp_2 = compParaUsar.comp_2;
        Computador comp_3 = compParaUsar.comp_3;

        // Comferindo se o id é o mesmo
        assertEquals("Erro: O 'id' esta diferente do esperado", "1", comp_1.pegarId());
        assertEquals("Erro: O 'id' esta diferente do esperado", "2", comp_2.pegarId());
        assertEquals("Erro: O 'id' esta diferente do esperado", "3", comp_3.pegarId());

        // Mudando algumas informações
        String novoId = "2";
        String novoSsd = "256";
        String novaMarca = "Sansumg";
        Map<String, String> mudanca = new HashMap<>();
        mudanca.put("id", novoId);
        mudanca.put("ssd", novoSsd);
        mudanca.put("marca", novaMarca);
        comp_1.editarComputador(mudanca);

        // Validando as informações que foram mudadas
        Map<String, String> c = comp_1.pegarTodasInformcoes();
        assertEquals("Erro: O id esta incorreto. Após a mudança o 'id' deve ser "+novoId, novoId, c.get("id"));
        assertEquals("Erro: O 'ssd' incorreto. Após a mudança o 'ssd' deve ser " + novoSsd, novoSsd, c.get("ssd"));
        assertEquals("Erro: O 'marca' esta incorreto. Após a mudança o 'marca' deve ser "+novaMarca, novaMarca, c.get("marca"));
    }
}