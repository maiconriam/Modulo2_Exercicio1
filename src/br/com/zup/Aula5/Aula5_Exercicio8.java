package br.com.zup.Aula5;

import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Aula5_Exercicio8 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double quantidadeDeNumeros;
        double numeroMaior = 0;
        double numeroMenor = 0;
        double soma = 0;

        System.out.println("Por favor, digite a quantidade de números: ");
        quantidadeDeNumeros = obj_leitor.nextDouble();

        int contador = 1;
        while (contador <= quantidadeDeNumeros) {
            System.out.println("Por favor, digite um numero " + contador + " :");
            double valorLidoPeloUsuario = obj_leitor.nextDouble();

            if(contador == 1){
                numeroMaior = valorLidoPeloUsuario;
                numeroMenor = valorLidoPeloUsuario;
            }
            if (numeroMaior < valorLidoPeloUsuario){
                numeroMaior = valorLidoPeloUsuario;
            }
            if (numeroMenor > valorLidoPeloUsuario){
                numeroMenor = valorLidoPeloUsuario;
            }
            soma = soma + valorLidoPeloUsuario;
            contador++;
        }
        System.out.println("O maior número é : " + numeroMaior);
        System.out.println("O menor número é : " + numeroMenor);
        System.out.println("A soma de todos os números é: " + soma);

    }
}
