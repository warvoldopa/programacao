package app;

import java.util.Scanner;

public class QuestaoG{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe um numero: ");
        float Numero = sc.nextFloat();
        if (Numero % 2 > 0){
            System.out.println("O numero é IMPAR");
        } else {
            System.out.println("O numero é PAR");
        }
    }
}