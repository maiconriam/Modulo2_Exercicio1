package br.com.zup.Aula5;

import java.util.Scanner;

public class Aula5_Exercicio6 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double quantidadeDeNumeros;
        int contador = 1;
        double soma = 0;
        double numerosimpar = 0;

        System.out.println("Por favor, digite a quantidade de números: ");
        quantidadeDeNumeros = obj_leitor.nextDouble();

        while (contador <= quantidadeDeNumeros) {
            System.out.println("Por favor, digite um numero " + contador + " :");
            double valorLidoPeloUsuario = obj_leitor.nextDouble();
            if (valorLidoPeloUsuario % 2 != 0) {
                numerosimpar = numerosimpar +1;
            }
            contador++;

        }

        System.out.println("Existem um total de  " + numerosimpar + " números impares nesses números que você digito");
    }
}
