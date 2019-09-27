package app;

import java.util.Scanner;

public class QuestaoL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salario;
        int codigo;
        System.out.println("Digite o valor do seu salário: ");
        salario = sc.nextFloat();
        System.out.println("______________________");
         System.out.println("______________________");
         System.out.println("[1] Escrituário");
         System.out.println("[2] Secretário");
         System.out.println("[3] Caixa");
         System.out.println("[4] Gerente");
         System.out.println("Diretor");
         codigo = sc.nextInt();
        switch(codigo){
            case 1:
                System.out.println("________________________");
                System.out.println("ESCRITUÁRIO");
                System.out.println("Valor de aumento: 50%");
                salario =  salario*50/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 2:
                System.out.println("_________________________");
                System.out.println("SECRETÁRIO");
                System.out.println("Valor de aumento: 35%");
                salario =  salario*35/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 3:
                System.out.println("_________________________");
                System.out.println("CAIXA");
                System.out.println("Valor de aumento: 20%");
                salario =  salario*20/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 4:
                System.out.println("_________________________");
                System.out.println("GERENTE");
                System.out.println("Valor de aumento: 10%");
                salario =  salario*10/100 + salario;
                System.out.println("Novo Salário: R$"+salario);
                break;
            case 5:
                System.out.println("_________________________");
                System.out.println("GERENTE");
                System.out.println("Você não tem aumento!");
                break;
            default:
                System.out.println("Este não é um valor válido!");
        }
        sc.close();
    }
}