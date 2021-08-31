package br.com.zup.Aula6;

import java.util.Scanner;

public class Aula6_Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroValido;
        do {
            System.out.println("Por favor digite um número positivo:");
            while(!leitor.hasNextInt()){
                System.out.println("Número invalido, digite novamente");
                leitor.next();
            }
            numeroValido = leitor.nextInt();
        } while (numeroValido <=0);

        int contador = 0;
        while(contador <= 100){
            System.out.println(numeroValido);
            numeroValido = numeroValido +1000;
            contador ++;
       }
    }
}
