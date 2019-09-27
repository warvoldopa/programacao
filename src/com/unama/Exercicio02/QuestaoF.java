package app;

import java.util.Scanner;

public class QuestaoF{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Informe o primeiro número: ");
    int N1 = sc.nextInt();
    System.out.println("informe o segundo número: ");
    int N2 = sc.nextInt();
        if (N1>N2) {
            System.out.println("O número maior é: "+N1);
         }else{ 
            System.out.println("O número maior é: "+N2);
        }
    }
}
