package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int numero = 10;
        double maiorNumero = 0;
        double menorNumero = 0;

        while(contador <= numero){
            System.out.println("Escreva o numero " +contador + " :");
            double numeroDigitado = leitor.nextDouble();

            if(contador == 1){
                maiorNumero = numeroDigitado;
                menorNumero = numeroDigitado;
            }
            if(maiorNumero < numeroDigitado){
                maiorNumero = numeroDigitado;
            }
            if (menorNumero > numeroDigitado){
                menorNumero = numeroDigitado;
            }
            contador ++;
        }

        System.out.println("O maior numero é " +maiorNumero);
        System.out.println("O menor numero é " +menorNumero);

    }
}
