package composite.pattern;

public class Arquivo implements Component{
    private String nome;
    private String tipo;

    public Arquivo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Arquivo{ nome = '" + nome + "', tipo = '" + tipo + "' }");
    }

    @Override
    public String toString() {
        return "Arquivo{ nome = '" + nome + "', tipo = '" + tipo + "' }";
    }
}
