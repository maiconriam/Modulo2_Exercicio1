package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula7_Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int lista = 10;
        int valorDigitado;
        int valorInverso = 9;
        int listaInversa = 0;

        while (contador <= lista){
            System.out.println("Por favor digite o número " + contador + " :");
            valorDigitado = leitor.nextInt();
            numeros.add(valorDigitado);
            contador++;
        }
        while (valorInverso >= listaInversa){
            System.out.println(numeros.get(valorInverso));
            valorInverso--;
        }
    }
}
