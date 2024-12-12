package org.example;

import java.util.Scanner;

public class Main {

    private final static Banco db = new Banco();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


    }

    public static String exibirOpcoes(){
        return """
                1 - Cadastrar Pessoa
                2 - Cadastrar Pet
                """;
    }
    public static void escolha(int escolha){
        switch (escolha){
            case 1:
                System.out.printf("Digite o CPF:");
                long cpf = sc.nextLong();
                System.out.println("Digite o nome:");
                String nome = sc.next();
        }
    }
}