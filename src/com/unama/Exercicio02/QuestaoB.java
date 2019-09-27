package Exercicio2;

import java.util.Scanner;

public class QuestaoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecas_def;
        int pecas_prod;
        System.out.println("informe a quantidade de pecas produzidas: ");
        pecas_prod = sc.nextInt();
        System.out.println("informe a quantidade de pecas defeituosas: ");
        pecas_def = sc.nextInt();
        if (pecas_def > (pecas_prod * 10 / 100)) {
            System.out.println("A maquina precisa de Manutenção!!");
        } else {
            System.out.println("A maquina não precisa de Manutenção");
        }
    }
}









