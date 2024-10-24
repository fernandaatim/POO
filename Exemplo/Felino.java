package Exemplo;

public class Felino implements Animal {
    String nome;
    int idade;
    String cor;

    public Felino(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public void Comer(){
        System.out.println("Comendo\n");
    }

    public void Dormir(){
        System.out.println("ZzZzZzZ\n");
    }

    public void fazerSom(){
        System.out.println("RonRon");
    }
}
