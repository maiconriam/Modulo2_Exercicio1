package br.com.zup.Aula5;

import java.util.Scanner;

public class Aula5_Exercicio4 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double quantidadeDeNumeros;
        double soma = 0;
        double media = 0;
        int contator = 0;

        System.out.println("Por favor, digite a quantidade de números: ");
        quantidadeDeNumeros = obj_leitor.nextDouble();

        while (contator < quantidadeDeNumeros){
            System.out.println("Por favor, digite um numero: ");
            double valorLidoPeloUsuario = obj_leitor.nextDouble();
            soma = soma + valorLidoPeloUsuario;
            contator ++;
        }
        media = soma / quantidadeDeNumeros;
        System.out.println("A média de todos os numeros é: " +media);
    }
}
