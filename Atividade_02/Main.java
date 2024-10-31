package Atividade_02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LojaShopping> lojas = new ArrayList<>();

        LojaShopping loja1 = new LojaShopping("12.345.678/0001-90", "Loja A", "Rua do Acre", "Fernando Oliveira");
        LojaShopping loja2 = new LojaShopping("98.765.432/0001-01", "Loja B", "Rua do Aventureiro", "Ziglas");
        LojaShopping loja3 = new LojaShopping("11.223.344/0001-02", "Loja C", "Rua do Morro do Meio", "Erous Adones");

        lojas.add(loja1);
        lojas.add(loja2);
        lojas.add(loja3);

        for (LojaShopping loja : lojas) {
            loja.registra_abertura_dia();
            loja.mostrarDados();
            System.out.println();
        }
    }
}
