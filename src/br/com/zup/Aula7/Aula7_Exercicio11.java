package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> numerosPar = new ArrayList<>();
        List<Integer> numerosImpar = new ArrayList<>();

        int valorDigitado = 0;
        int todosOsNumeros = 20;

        System.out.println("Olá, vou ler 20 números para você, e armazenar os números pares e impares em listas");

        for (int i = 1; i <= todosOsNumeros; i++) {
            System.out.println("Por favor digite o " + i + " :");
            valorDigitado = leitor.nextInt();
            if (valorDigitado > 0) {
                numeros.add(valorDigitado);
                if (valorDigitado % 2 == 0) {
                    numerosPar.add(valorDigitado);
                }
                if (valorDigitado % 2 != 0) {
                    numerosImpar.add(valorDigitado);
                }
            }else {
                System.out.println("Valor invalido");
            }
        }
        System.out.println("Os números das listas são : " + numeros);
        System.out.println("Os números das listas pares são : " +numerosPar);
        System.out.println("Os números das listas impares são : " +numerosImpar);
    }
}
