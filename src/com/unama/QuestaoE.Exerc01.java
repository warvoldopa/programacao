package com.company.Exer01Programação;

import java.util.Scanner;

public class QuestaoEExerc01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double total_vendas;
        System.out.println("Informe o valor das vendas: ");
        total_vendas = sc.nextDouble();
        total_vendas = total_vendas * 10/100+total_vendas;
        System.out.println("Total de vendas é R$: "+ total_vendas);
    }


}