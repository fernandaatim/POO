package Exemplo;

public abstract class Felino implements Animal {
    private String nome;
    private int idade;
    private String cor;

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade<0){
            this.idade = 0;
        }else{
            this.idade = idade;
        }
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Felino(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public void comer(){
        System.out.println("Comendo\n");
    }

    @Override
    public void dormir(){
        System.out.println("ZzZzZzZ\n");
    }

    public abstract void fazerSom();
    public abstract void brincar();

}
