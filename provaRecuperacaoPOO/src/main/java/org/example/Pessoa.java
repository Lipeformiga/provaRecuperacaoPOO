package org.example;

public class Pessoa {

    private long cpf;
    private String nome;
    private String senha;
    private Pet pet;

    // falta avaliar se a pessoa tem um pet

    public Pessoa(long cpf, String nome, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
    }


    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void botaPetParaDormir(){
        if(this.pet != null){
            pet.dormir();
        }
    }

    public void acordarPet(){
        if (this.pet != null){
            pet.acordar();
        }
    }

    public void adotarPet(Pet pet){
        this.pet = pet;
    }

    public void darAguaParaPet(){
        pet.beberAgua();
    }

    public void brincarComPet(Brincadeira brincadeira){
        pet.brincar(brincadeira);
    }

    public void alimentarPet(Alimento alimento){
        pet.comer(alimento);
    }

    public void levarPetParaFazerNecessidades(){
        pet.fazerNecessidades();
    }

    public void limparPet(){
        pet.limpar();
    }

    public String avaliarPet(){
        return pet.toString();
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", pet=" + pet +
                '}';
    }
}
