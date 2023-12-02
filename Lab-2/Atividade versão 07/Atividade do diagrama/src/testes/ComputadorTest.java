package testes;

import main.Computador;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ComputadorTest {
    @Test
    public void main(){
        Computador comp_1 = new Computador("1", "Notebook para escritorio", "LG", "32", "512");
        Computador comp_2 = new Computador("10", "PC Gamer", "LG", "32", "512");
        Computador comp_3 = new Computador("100", "Notebook", "Samsung", "8", "512");
        // Comferindo se o id é o mesmo
        assertEquals("1", comp_1.pegarId());
    }

}