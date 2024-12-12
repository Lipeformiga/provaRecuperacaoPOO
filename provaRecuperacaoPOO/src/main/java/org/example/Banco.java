package org.example;

import java.util.ArrayList;

public class Banco {

    private static ArrayList<Alimento> alimentos = new ArrayList<>();
    private static ArrayList<Brincadeira> brincadeiras = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPet(Pet pet){
        pets.add(pet);
    }
    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void removerPet(Pet pet){
        pets.remove(pet);
    }
    public void removerPessoa(Pessoa pessoa){
        pessoas.remove(pessoa);
    }

    public Alimento procurarAlimento(int codigo){
        for(Alimento alimento : alimentos){
            if(alimento.getCodigo() == codigo){
                return alimento;
            }
        }
        return null;
    }

    public Brincadeira procurarBincadeira(int codigo){
        for(Brincadeira brincadeira : brincadeiras){
            if (brincadeira.getCodigo() == codigo){
                return brincadeira;
            }
        }
        return null;
    }

    public Pet procurarPet(int codigo){
        for (Pet pet : pets){
            if(pet.getCodigo() == codigo){
                return pet;
            }
        }
        return null;
    }

    public Pessoa procurarPessoa(long cpf){
        for (Pessoa pessoa : pessoas){
            if (pessoa.getCpf() == cpf){
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa login(long cpf, String senha){
        for (Pessoa pessoa : pessoas){
            if(pessoa.getCpf() == cpf && pessoa.getSenha().equals(senha)){
                return pessoa;
            }
        }
        return null;
    }

    public static ArrayList<Alimento> getAlimentos() {
        return alimentos;
    }

    public static ArrayList<Brincadeira> getBrincadeiras() {
        return brincadeiras;
    }

    public static ArrayList<Pet> getPets() {
        return pets;
    }

    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
