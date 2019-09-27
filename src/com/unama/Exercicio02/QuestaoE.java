package Exercicio2;

import java.util.Scanner;

public class QuestaoE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int F;
            double N;
            System.out.println("informe a nota: ");
            N = sc.nextDouble();
            System.out.println("informe a quantidade de faltas: ");
            F = sc.nextInt();
            if (F <= 40 && N >= 6) {
                System.out.println("APROVADO!!!");
            } else {
                System.out.println("REPROVADO!!!");
            }
        }
    }
}