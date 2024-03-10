import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Estoque estoque = new Estoque();

        Produto chocolate = new Produto("Chocolate");

        Produto pizza = new Produto("Pizza");

        estoque.adicionarProduto(chocolate, pizza);
        estoque.imprimirProdutos();

        System.out.println("Procurar produto Pizza...");
        try{System.out.println("Reusultado: "+estoque.buscaProduto("Pizza").nome);}
        catch (NullPointerException n){
            System.out.println("Não existe esse prduto!!");
        }

        System.out.println();
        System.out.println("Procurar produto Casa (não existe esse produto)...");
        try{System.out.println("Reusultado: "+estoque.buscaProduto("Casa").nome);}
        catch (NullPointerException n){
            System.out.println("Não existe esse prduto!!");
        }
    }
}
