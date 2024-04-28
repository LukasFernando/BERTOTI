package composite.pattern;

public class Main {
    public static void main(String[] args) {
        Diretorio diretorio1 = new Diretorio("d1");
        Diretorio diretorio2 = new Diretorio("d2");

        Arquivo arquivo1 = new Arquivo("a", "txt");
        Arquivo arquivo2 = new Arquivo("b", "csv");
        Arquivo arquivo3 = new Arquivo("c", "xlsx");

        diretorio1.adicionarItem(arquivo1);
        diretorio1.adicionarItem(diretorio2);

        diretorio2.adicionarItem(arquivo2);
        diretorio2.adicionarItem(arquivo3);

        diretorio1.mostrarInformacoes();
        diretorio2.mostrarInformacoes();

    }
}
