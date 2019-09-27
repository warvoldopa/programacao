package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestaoH{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0");
        System.out.println("Informe [1] para sexo Masculino e [2] para sexo Feminio");
        int sexo = sc.nextInt();
        System.out.println("Informe a sua altura: ");
        double altura = sc.nextDouble();
        double peso_ideal; 
        if (sexo==1){
           peso_ideal = (72.7 * altura -58);
           System.out.print("O seu peso ideal é igual a: "+peso_ideal);
        }
        if (sexo==2){
           peso_ideal = (62.1 * altura -44.7);
            System.out.println("O seu peso ideal é igual a: "+peso_ideal);    
        }
    }    
}