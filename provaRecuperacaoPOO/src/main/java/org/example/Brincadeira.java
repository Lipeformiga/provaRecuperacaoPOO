package org.example;

public class Brincadeira {

    private static int geradorCodigo = 1;
    private int codigo;
    private String nome;
    private int cansaco;
    private int fome;
    private int sede;
    private int sujeira;
    private int divertimento;

    public Brincadeira(String nome, int divertimento, int cansaco, int fome, int sede, int sujeira) {
        this.nome = nome;
        this.cansaco = cansaco;
        this.fome = fome;
        this.sede = sede;
        this.sujeira = sujeira;
        this.divertimento = divertimento;
        this.codigo = geradorCodigo++;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCansaco() {
        return this.cansaco;
    }

    public int getFome() {
        return this.fome;
    }

    public int getSede() {
        return this.sede;
    }

    public int getSujeira() {
        return this.sujeira;
    }

    public int getDivertimento() {
        return this.divertimento;
    }
}
