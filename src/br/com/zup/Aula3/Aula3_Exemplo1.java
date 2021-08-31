package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exemplo1 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Digite os seguintes valores para respectivos dias da semana :");
        System.out.println("1- Domingo");
        System.out.println("2- Segunda");
        System.out.println("3- Terça");
        System.out.println("4- Quarta");
        System.out.println("5- Quinta");
        System.out.println("6- Sexta");
        System.out.println("7- Sábado");

        System.out.println("Digite o dia você deseja");

        int  diaDesejado = obj_leitor.nextInt();

        switch (diaDesejado){
            case 1:
                System.out.println("É domingo");
                break;
            case 2:
                System.out.println("É Segunda");
                break;
            case 3:
                System.out.println("É terça");
                break;
            case 4:
                System.out.println("É quarta");
                break;
            case 5:
                System.out.println("É quinta");
                break;
            case 6:
                System.out.println("É sexta");
                break;
            case 7:
                System.out.println("É sábado");
                break;
        }
    }
}
