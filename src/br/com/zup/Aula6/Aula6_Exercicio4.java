package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite quantos numeros inteiros você quer somar");
        double numerosDigitados = leitor.nextDouble();

        double numeroInteiro = 0;
        double soma = 0;

        int contador = 1;
        while(contador <= numerosDigitados){
            System.out.println("Por favor digite o numero " + contador + " :");
            double numero = leitor.nextDouble();

            if (numero > 0){
                numeroInteiro = numeroInteiro + numero;
            }
            contador++;

        }

        System.out.println("A soma dos números inteiros positivos são: " +numeroInteiro);
    }
}
