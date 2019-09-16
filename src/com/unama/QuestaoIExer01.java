package com.company.Exer01Programação;

import java.util.Scanner;

public class QuestaoIExer01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double valor, desconto, valor_total;
        System.out.println("Informe o valor: ");
        valor = sc.nextDouble();
        System.out.println("Informe a percentual de desconto: ");
        desconto = sc.nextDouble();
        desconto = valor*desconto/100;
        valor_total = valor-desconto;
        System.out.println("O valor total do produto com desconto é de R$: "+valor_total);
    }
}
