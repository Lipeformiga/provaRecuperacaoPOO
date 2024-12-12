package org.example;

public class Alimento {

    private String nome;
    private static int geradorCodigos = 0;
    private int nutricao;
    private int codigo;

    public Alimento(String nome, int nutricao) {
        this.nome = nome;
        this.nutricao = nutricao;

        this.codigo = geradorCodigos++;
    }

    public int getNutricao() {
        return nutricao;
    }

    public int getCodigo() {
        return codigo;
    }
}
