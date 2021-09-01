package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o número de Intervalos");
        int primeiroIntervalo = leitor.nextInt();

        System.out.println("Por favor digite o número do segundo intervalo");
        int segundoIntervalo = leitor.nextInt();

        int soma = 0;

        if (primeiroIntervalo < segundoIntervalo) {
            while (primeiroIntervalo <= segundoIntervalo) {
                if (primeiroIntervalo % 2 != 0) {
                    soma = soma + primeiroIntervalo;
                }

                primeiroIntervalo ++;
            }
            System.out.println("A soma dos números impares no intervalo é " +soma);
        } else {
            System.out.println("Intervalo de valores inválido");
        }
    }
}
