package br.com.zup.Aula7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> numero = new ArrayList<>();

        int contador = 1;
        int lista = 5;
        double valorDigitado;

        while (contador <= lista){
            System.out.println("Por favor digite o número " + contador + " :");
            valorDigitado = leitor.nextDouble();
            numero.add(valorDigitado);
            contador++;
        }
        System.out.println("A sequência de números que você digitou é : " +numero);
    }
}
