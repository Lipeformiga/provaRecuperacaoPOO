package org.example;

public class Pet {
    private static int geradorCodigo = 0;
    private int sede = 100;
    private int fome = 100;
    private int codigo;
    private String nome;
    private int vontadeBanheiro = 100;
    private int higiene = 100;
    private boolean acordado = true;
    private int energia = 100;
    private boolean vivo = true;
    private int diversao = 100;

    public void validar(){
        if (this.sede > 100 ){
            this.sede = 100;
        }
        if (this.fome > 100 ){
            this.fome = 100;
        }
        if (this.higiene > 100 ){
            this.higiene = 100;
        }
        if (this.energia > 100 ){
            this.energia = 100;
        }
        if (this.diversao > 100 ){
            this.diversao = 100;
        }
        if(this.higiene < 0 ){
            this.higiene = 0;
        }
        if(this.diversao < 0){
            this.diversao = 0;
        }
        if(this.vontadeBanheiro < 0){
            this.vontadeBanheiro = 0;
        }
    }

    public Pet(String nome) {
        this.nome = nome;
        this.codigo = geradorCodigo++;
    }

    public void beberAgua(){
        this.sede += 50;
        this.vontadeBanheiro -= 25;
        if (vontadeBanheiro <= 0){
            this.higiene = 0;
            this.vontadeBanheiro = 100;
        }
        validar();
    }

    public int getCodigo() {
        return codigo;
    }

    public void limpar(){
        this.higiene += 50;
        validar();
    }
    public void fazerNecessidades(){
        this.vontadeBanheiro = 100;
        this.higiene -= 25;
        validar();
    }

    public void brincar(Brincadeira brincadeira){
        this.diversao += brincadeira.getDivertimento();
        this.energia -= brincadeira.getCansaco();
        this.fome -= brincadeira.getFome();
        this.sede -= brincadeira.getSede();
        this.higiene -= brincadeira.getSujeira();

        morrer();
        validar();
    }

    public void dormir(){
        this.energia += 25;
        this.acordado = false;
        validar();
    }

    public void morrer(){
        if(this.sede <= 0 || this.fome <= 0 || this.energia <= 0){
            this.vivo = false;
        }
    }
    public void acordar(){
        this.energia += 25;
        this.acordado = true;
        validar();
    }
    public void comer(Alimento alimento){
        this.fome += alimento.getNutricao();
        this.vontadeBanheiro -= alimento.getNutricao() / 2;
        if(vontadeBanheiro <= 0){
            this.higiene = 0;
            this.vontadeBanheiro = 100;
        }
        validar();
    }

    public String simounaoVivo(){
        if (this.vivo == true){
            return "Sim";
        } else{
            return "Não";
        }
    }
    public String simounaoAcordado(){
        if (this.acordado == true){
            return "Sim";
        } else{
            return "Não";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome  + '\n' +
                "Vivo: " + simounaoVivo() + '\n' +
                "Acordado: " + simounaoAcordado() + '\n' +
                "Sede: " + this.sede + '\n' +
                "Fome: " + this.fome + '\n' +
                "Energia: " + this.energia + '\n' +
                "Diversão: " + this.diversao + '\n' +
                "Higiene: " + this.higiene + '\n' +
                "Vontade de ir ao banheiro: " + this.vontadeBanheiro + '\n';
    }
}
