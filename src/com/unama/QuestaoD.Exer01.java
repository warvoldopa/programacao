package com.company.QuestaoD;

import java.util.Scanner;

public class QuestaoDExer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double raio;
        Double area_perimetro;
        System.out.println("informe o valor do Raio ");
        raio = sc.nextDouble();
        area_perimetro = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do perímetro é " + area_perimetro);
    }






}


