package composite.antiPattern;

import java.util.ArrayList;
import java.util.List;

public class Diretorio {
    private String nome;
    private List<Arquivo> listaDeArquivos;
    private List<Diretorio> listaDeDiretorio;

    public Diretorio(String nome) {
        this.nome = nome;
        this.listaDeArquivos = new ArrayList<>();
        this.listaDeDiretorio = new ArrayList<>();
    }

    public void adicionarArquivo(Arquivo arquivo){
        listaDeArquivos.add(arquivo);
    }

    public void adicionarDiretorio(Diretorio diretorio){
        listaDeDiretorio.add(diretorio);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do diretorio: " + this.nome);
        if(!listaDeArquivos.isEmpty()){
            System.out.println("Todos os aquivos:");
            for(Arquivo arquivo : listaDeArquivos){
                System.out.println("    "+arquivo);
            }
        }
        if(!listaDeDiretorio.isEmpty()){
            System.out.println("Todos os diretorios:");
            for(Diretorio diretorio : listaDeDiretorio){
                System.out.println("    "+diretorio);
            }
        }
        System.out.println("Fim do diretorio.\n");
    }

    @Override
    public String toString() {
        return "Diretorio{ nome = '" + nome + "', listaDeComponentes = Impossivel de ver a lista de items dentro desse diretorio acessando de fora desse diretorio }";
    }
}
