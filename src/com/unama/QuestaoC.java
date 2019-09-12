package Exercicio2;

import java.util.Scanner;

public class QuestaoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("informe a sua idade ");
        idade = sc.nextInt();
        if (idade <= 10) {
            System.out.println("Infantil");
        }
        if (idade > 10 && idade <=17){
            System.out.println("juvenil");
        }
        if (idade > 17){
            System.out.println("Senior");
        }




    }
}
