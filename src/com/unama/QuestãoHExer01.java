package com.company.Exer01Programação;

import java.util.Scanner;

public class QuestãoHExer01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double salario, pr_au, novo_salario;
        System.out.println("informe o valor so salário atual ");
        salario = sc.nextDouble();
        System.out.println("Informe o valor do percentual de aumento: ");
        pr_au = sc.nextDouble();
        pr_au = salario*pr_au/100;
        novo_salario = salario+pr_au;
        System.out.println("O valor do novo salário é de R$: "+novo_salario);



    }
}
