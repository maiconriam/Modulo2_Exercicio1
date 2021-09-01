package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int numeros = 5;
        double valorDigitado;
        double maiorNumero = 0;

        while (contador <= numeros){
            System.out.println("Por favor digite o numero " + contador + " :");
            valorDigitado = leitor.nextDouble();

            if (contador == 1){
                maiorNumero = valorDigitado;
            }
            if (valorDigitado >= maiorNumero){
                maiorNumero = valorDigitado;
            }
            contador ++;
        }
        System.out.println("O número maior é : " + maiorNumero);
    }
}
