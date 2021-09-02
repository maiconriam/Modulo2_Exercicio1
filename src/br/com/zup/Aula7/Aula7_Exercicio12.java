package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();

        int valorDigitado;
        int soma = 0;
        int multiplicacao = 0;
        int contador = 1;

        System.out.println("Olá, por favor digite 5 números, vou soma e multiplicar os números digitados");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Por favor digite o " + i + " número :");
            valorDigitado = leitor.nextInt();
            if (valorDigitado >= 0){
                numero.add(valorDigitado);
                soma = soma + valorDigitado;
                multiplicacao = soma * contador;
                contador ++;
            }
            else{
                System.out.println("Valor inválido");
            }
        }
        System.out.println("A soma dos números validos que você digito é : " +soma);
        System.out.println("A multiplicação dos números validos são : " + multiplicacao);
        System.out.println("Todos os números validos são : " + numero);
    }
}
