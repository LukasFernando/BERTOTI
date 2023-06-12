package main;

public class Computador {
    String id;
    String nome;
    String marca;
    String ram;
    String ssd;

    public Computador(String id, String nome, String marca, String ram, String ssd){
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.ram = ram;
        this.ssd = ssd;
    }

    public void imprimirTodasInformcoes(){
        System.out.println("id: " + this.id);
        System.out.println("nome: " + this.nome);
        System.out.println("marca: " + this.marca);
        System.out.println("ram: " + this.ram);
        System.out.println("ssd: " + this.ssd);
    }

    public String getId(){
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }
}