package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, vou ler o número que você digito e falar que dia da semana é");
        System.out.println("Por favor digite um número :");
        int diaDaSemana = leitor.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("1- Segunda-feira");
                break;
            case 2:
                System.out.println("2- Terça-feira");
                break;
            case 3:
                System.out.println("3- Quarta-feira");
                break;
            case 4:
                System.out.println("4- Quinta-feira");
                break;
            case 5:
                System.out.println("5- Sexta-feira");
                break;
            case 6:
                System.out.println("6- Sábado-feira");
                break;
            default:
                System.out.println("Número invalido");
                break;
        }
    }
}
