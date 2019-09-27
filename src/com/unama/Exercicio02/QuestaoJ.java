package app;

import java.util.Scanner;

public class QuestaoJ{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("================");
    System.out.println("MENU DE OPÇÕES");
    System.out.println("================");
    System.out.println("[1] Somar dois Números");
    System.out.println("[2] Raiz Quadrada de um número");
    int X = sc.nextInt();
        switch (X){
            case (1): {
                System.out.println("Informe o primeiro número: ");
                double N1 = sc.nextDouble();
                System.out.println("Informe o segundo número: ");
                double N2 = sc.nextDouble();
                double Soma = N1+N2;
                System.out.println("O total é: "+Soma);
             break;   
            }case (2): {
                System.out.println("Escolha um número para calcular a raiz: ");
                int numero = sc.nextInt();
                System.out.println("A raiz quadrada é: " + Math.sqrt(numero));
             break;  
             }  
        }
}   }