package composite.antiPattern;

public class Main {
    public static void main(String[] args) {
        Diretorio diretorio1 = new Diretorio("d1");
        Diretorio diretorio2 = new Diretorio("d2");

        Arquivo arquivo1 = new Arquivo("a", "txt");
        Arquivo arquivo2 = new Arquivo("b", "csv");
        Arquivo arquivo3 = new Arquivo("c", "xlsx");

        diretorio1.adicionarArquivo(arquivo1);
        diretorio1.adicionarDiretorio(diretorio2);

        diretorio2.adicionarArquivo(arquivo2);
        diretorio2.adicionarArquivo(arquivo3);

        diretorio1.mostrarInformacoes();
        diretorio2.mostrarInformacoes();

    }
}
