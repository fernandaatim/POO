package Exemplo;

public class Main {
    public static void main(String[] args) {
        Gato dory = new Gato(null, "Dorothy", 2, "tricolor");

        System.out.printf("Oi meu nome é:",dory.getNome());
        dory.fazerSom();
    }
}
