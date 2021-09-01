package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int produtos = 3;
        double valorDigitado;
        double menorPreco = 0;

        while (contador <= produtos) {
            System.out.println("Por favor digite o valor do " + contador + " produto :");
            valorDigitado = leitor.nextDouble();

            if (contador == 1) {
                menorPreco = valorDigitado;
            }
            if (valorDigitado < menorPreco){
                menorPreco = valorDigitado;
            }
            contador ++;
        }
        System.out.println("O produto mais barato é : " +menorPreco);
    }
}
