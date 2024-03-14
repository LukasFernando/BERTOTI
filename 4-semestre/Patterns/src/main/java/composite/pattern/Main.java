package composite.pattern;


public class Main {
    public static void main(String[] args) {
        Mochila mochila = new Mochila();

        Categoria papelaria = new Categoria();
        Categoria tecnologia = new Categoria();

        Component caderno = new ItemCaderno("caderno", 12.90);
        Component lapis = new ItemCaderno("lapis", 2.50);
        Component notebook = new ItemCaderno("notebook", 4050.00);

        papelaria.adicionarItem(caderno);
        papelaria.adicionarItem(lapis);

        tecnologia.adicionarItem(notebook);

        mochila.adicionarCategoria(papelaria);
        mochila.adicionarCategoria(tecnologia);

        mochila.imprimirItems();
    }
}
