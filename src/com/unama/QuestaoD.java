package Exercicio2;

import java.util.Scanner;

public class QuestaoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L1, L2, L3;
        System.out.println("informe o tamanho do lado A: ");
        L1 = sc.nextDouble();
        System.out.println("informe o tamanho do lado B: ");
        L2 = sc.nextDouble();
        System.out.println("informe o tamanho do lado C: ");
        L3 = sc.nextDouble();
        if (L1 == L2 && L1==L3 && L2 == L3) {
            System.out.println("Triangulo Equilátero");
        }
        if (L1==L2 && L1!=L3) {
            System.out.println("Triangulo Isoceles");
        }
        if (L2==L3 && L2!=L1) {
            System.out.println("Triangulo Isoceles");
        }
        if (L3==L1 && L3!=L2) {
            System.out.println("Triangulo Isoceles");
        }
        if (L1!=L2 && L1!=L3 && L2!=L3){
            System.out.println("Triangulo Escaleno");
        }

    }
}




