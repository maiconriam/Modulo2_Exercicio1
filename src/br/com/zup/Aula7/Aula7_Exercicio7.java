package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, vou ler os números inteiros entre um intervalo que você digitar");
        System.out.println("Por favor, digite o primeiro intervalo");
        int numero1 = leitor.nextInt();

        System.out.println("Por favor, digite o segundo intervalo");
        int numero2 = leitor.nextInt();

        if (numero1 <= numero2) {
            while(numero1 <= numero2){
                System.out.println(numero1);
                numero1++;
            }
        }
        else if (numero1 >= numero2) {
            while(numero1 >= numero2) {
                System.out.println(numero2);
                numero2++;
            }
        }

    }
}
