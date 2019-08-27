package com.unama;

import java.util.Scanner;

public class LetraG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento;
        double largura;
        double area;
        System.out.println("digite o comprimento ");
        comprimento = sc.nextDouble();
        System.out.println("digite a largura");
        largura = sc.nextDouble();
        area = comprimento * largura;
        System.out.println("a area é" + area);


    }
}
