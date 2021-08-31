package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite quantos números você quer ler");
        double numeroDigitados = leitor.nextDouble();

        double soma = 0;
        double media = 0;

        int contador =1;
        while(contador <= numeroDigitados){
            System.out.println("Digite o numero " +contador + " :");
            double numeroDigitadoPeloUsuario = leitor.nextDouble();

            soma = soma + numeroDigitadoPeloUsuario;
            contador ++;

        }
        media = soma / numeroDigitados;

        System.out.println(media);
    }
}
