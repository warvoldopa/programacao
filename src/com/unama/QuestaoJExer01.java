package com.company.Exer01Programação;

import java.util.Scanner;

public class QuestaoJExer01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double VR, CD;
            System.out.println("Informe o valor em Reais: ");
            VR = sc.nextDouble();
            System.out.println("O valor em Reais digitado corrensponde a U$ "+VR/4.13);
    }
}
