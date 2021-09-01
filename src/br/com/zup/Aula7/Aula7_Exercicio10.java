package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        int contador = 1;
        int lista = 4;
        double valorDigitado;
        double soma = 0;
        double media = 0;

        while (contador <= lista) {
            System.out.println("Por favor digite a nota do " + contador + " Bimestre :");
            valorDigitado = leitor.nextDouble();
            if (valorDigitado >= 0 & valorDigitado <= 10){
                notas.add(valorDigitado);
                soma = soma + valorDigitado;
                media = soma / lista;
                contador++;
            }else{
                System.out.println("Por favor digite um número de 0 a 10");
            }
        }
        System.out.println("As suas notas são : " + notas);
        System.out.println("E você teve uma média de " + media);
    }
}
