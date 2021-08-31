package br.com.zup.Aula1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Vou calcular a temperatura em fahrenheit para celsius, por favor diga a temperatura:");
        fahrenheit = obj_leitor.nextDouble();
        celsius = (fahrenheit -32) * 5/9;
        System.out.println("A temperatura em celsius é: ");
        System.out.println(celsius);

        //float fahrenheit = 110;
        //float celsius1 = (fahrenheit -32) * 5/9;

        //System.out.println("A temperatura em fahrenheit é "+ fahrenheit + "ºF convertida em celsius é " +celsius1 + "ºC");

    }
}
