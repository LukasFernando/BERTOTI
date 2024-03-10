package testes;

import main.Computador;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputadorTest {
    @Test
    public void main(){
        // Criando os Objetos de Computador
        String id = "2";
        String nome = "Notebook de teste";
        String marca = "Teste";
        String ram = "32";
        String ssd = "512";
        Computador comp_1 = new Computador(id, nome, marca, ram, ssd);

        String id2 = "2";
        String nome2 = "Notebook de teste";
        String marca2 = "Teste";
        String ram2 = "32";
        String ssd2 = "512";
        Computador comp_2 = new Computador(id2, nome2, marca2, ram2, ssd2);


        // Conferindo se as informações estão corretas
        assertEquals("Erro: O Computador não é o mesmo", comp_1.getId(), id);
        assertEquals("Erro: O Computador não é o mesmo", comp_1.getNome(), nome);
        assertEquals("Erro: O Computador não é o mesmo", comp_1.getMarca(), marca);
        assertEquals("Erro: O Computador não é o mesmo", comp_1.getRam(), ram);
        assertEquals("Erro: O Computador não é o mesmo", comp_1.getSsd(), ssd);

        assertEquals("Erro: O Computador não é o mesmo", comp_2.getId(), id2);
        assertEquals("Erro: O Computador não é o mesmo", comp_2.getNome(), nome2);
        assertEquals("Erro: O Computador não é o mesmo", comp_2.getMarca(), marca2);
        assertEquals("Erro: O Computador não é o mesmo", comp_2.getRam(), ram2);
        assertEquals("Erro: O Computador não é o mesmo", comp_2.getSsd(), ssd2);


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