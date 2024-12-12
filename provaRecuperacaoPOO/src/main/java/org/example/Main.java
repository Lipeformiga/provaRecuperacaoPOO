package org.example;

import java.util.Scanner;

public class Main {

    private final static Banco db = new Banco();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println(exibirOpcoes2());
            int opcao = sc.nextInt();
            escolha(opcao);
        }


    }

    public static String exibirOpcoes2(){
        return """
                1 - Cadastrar Pessoa
                2 - Procurar Pessoa
                3 - Remover pessoa
                4 - Cadastrar Pet
                5 - Procurar Pet
                6 - remover PET
                7 - procurar brincadeira
                8 - procurar alimento
                0 - sair
                """;
    }
    public static void escolha(int escolha){
        switch (escolha){
            case 1:
                cadastroPessoa();
                break;
            case 2:
                procurarPessoa();
                break;
            case 3:

                break;
            case 4:
                cadastroPet();
                break;
            case 5:
                procurarPet();
                break;
            case 0:
                System.out.println("Até mais!");
                System.exit(0);
        }
    }

    public static void cadastroPessoa(){
        System.out.printf("Digite o CPF:");
        long cpf = sc.nextLong();
        System.out.println("Digite o nome:");
        String nome = sc.next();
        System.out.println("Digite a senha:");
        String senha = sc.next();

        db.cadastrarPessoa(new Pessoa(cpf, nome, senha));
    }

    public static void cadastroPet(){
        System.out.println("Nome do PET:");
        String nome = sc.next();

        db.cadastrarPet(new Pet(nome));
    }
    public static void procurarPessoa(){
        System.out.println("Digite o CPF da pessoa que deseja procurar:");
        long cpf = sc.nextLong();
        System.out.println(db.procurarPessoa(cpf));
    }
    public static void procurarPet(){
        System.out.println("Digite o código do PET:");
        int codigo = sc.nextInt();
        System.out.println(db.procurarPet(codigo));
    }
}