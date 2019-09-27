package Exercicio2;

import java.util.Scanner;

public class QuestaoA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F;
        double V;
        System.out.println("informe a quantidade de folhas: ");
        F = sc.nextInt();
        if (F <=100) {
            V = F * 0.25;
        }else{
            V = F * 0.20;
        }   System.out.println("O valor total é "+ V);
    }
}