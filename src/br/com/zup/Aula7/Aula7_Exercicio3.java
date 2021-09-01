package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int tabela = 10;
        int valorDigitado;
        int tabuada1 = 0;
        int tabuada2 = 0;
        int tabuada10 = 0;
        int x = 0;
        int x1 = 0;
        int x2 = 0;

        System.out.println("Por favor digite a tabuada que você quer ver");
        valorDigitado = leitor.nextInt();

        if (valorDigitado > 0 & valorDigitado <=10) {
            while (contador <= tabela) {
                if (contador == 1) {
                    tabuada1 = valorDigitado * contador;
                    x = contador;
                    contador++;
                }
                if (contador == 2) {
                    tabuada2 = valorDigitado * contador;
                    x1 = contador;
                    contador++;
                }
                if (contador == 10) {
                    tabuada10 = valorDigitado * contador;
                    x2 = contador;
                    contador++;
                }
                contador++;
            }
            System.out.println("Tabuada de " + valorDigitado + " :");
            System.out.println();
            System.out.println(valorDigitado + " x " + x + " = " +tabuada1);
            System.out.println();
            System.out.println(valorDigitado + " x " + x1 + " = " +tabuada2);
            System.out.println();
            System.out.println("[...]");
            System.out.println();
            System.out.println(valorDigitado + " x " + x2 + " = " +tabuada10);
        }else{
            System.out.println("Número invalido");
        }
    }
}
