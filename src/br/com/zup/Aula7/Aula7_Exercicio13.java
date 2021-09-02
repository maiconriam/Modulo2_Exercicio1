package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quilosPermitido = 50;
        float multa = 4.0f;
        float quilosExedido = 0;
        float valorDaMulta;


        System.out.println("Olá, sou do departamento de pesca e irei pesar seu peixe");
        System.out.println("Lembrando que o maximo de KG é " + quilosPermitido + " e se ultrapassar você vai ganhar uma multa de "+ multa + " reais por KG");
        System.out.println("Por favor quantos KG tem seu peixe?");
        float valorDigitado = leitor.nextFloat();

        if(valorDigitado > quilosPermitido){
            quilosExedido = valorDigitado - quilosPermitido;
            valorDaMulta = multa * quilosExedido;
            String resultado = String.format("%.2f", quilosExedido);
            String resultado1 = String.format("%.2f", valorDaMulta);
            System.out.println("Seu peixe tem " + valorDigitado + "KG e ultrapassou o limite de peso do estado");
            System.out.printf("Seu peixe tem " + resultado + "KG exedidos\n");
            System.out.printf("E você terá que pagar uma multa de " +resultado1 + " reais\n");
        }
        else{
            System.out.println("Seu peixe tem " +valorDigitado + "KG e não ultrapassou o limite de peso do estado");
        }
    }
}
