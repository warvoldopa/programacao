package com.unama;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double preco;
        double total;
        System.out.println("informe a quantidade ");
        quantidade = sc.nextInt();
        System.out.println("escreva o preço R$ ");
        preco = sc.nextDouble();
        total = preco * quantidade;
        System.out.println("o total a ser pago pelo cliente é R$ "+total);
    }
}
