package app;

import java.util.Scanner;

public class QuestaoI{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Informe a primeira nota: ");
    Float N1 = sc.nextFloat();
    System.out.println ("Informe a segunda nota: ");
    Float N2 = sc.nextFloat();
    System.out.println ("Informe a terceira nota: ");
    Float N3 = sc.nextFloat();
    Float Media = (N1+N2+N3) /3;
    System.out.println("A média do aluno é: "+Media);
    if (Media <=3){
            System.out.println("REPROVADO");
        }
        if (Media >3 && Media <=7){
            System.out.println("EXAME");
            Float Media_exame = 6 - Media;
            System.out.println("O aluno precima tirar: "+ Media_exame);
        }
        if (Media>7){
            System.out.println("APROVADO");
        }
    } 
}

