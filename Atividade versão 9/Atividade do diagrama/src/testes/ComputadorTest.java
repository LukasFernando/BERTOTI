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
        assertEquals("Erro: O 'id' esta diferente do esperado", "1", comp_1.getId());
        assertEquals("Erro: O 'id' esta diferente do esperado", "2", comp_2.getId());
        assertEquals("Erro: O 'id' esta diferente do esperado", "3", comp_3.getId());

        // Mudando algumas informações
        String novoSsd = "ssd de teste";
        String novaRam = "ram de test4e";
        String novoNome = "nome de teste";
        String novaMarca = "marca de teste";
        comp_1.setSsd(novoSsd);
        comp_1.setRam(novaRam);
        comp_1.setNome(novoNome);
        comp_1.setMarca(novaMarca);

        // Validando as informações que foram mudadas
        assertEquals("Erro: O 'ssd' incorreto.", novoSsd, comp_1.getSsd());
        assertEquals("Erro: O 'ssd' incorreto.", novaRam, comp_1.getRam());
        assertEquals("Erro: O 'ssd' incorreto.", novoNome, comp_1.getNome());
        assertEquals("Erro: O 'marca' esta incorreto.", novaMarca, comp_1.getMarca());
    }
}