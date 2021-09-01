package br.com.zup.Aula7;

import java.util.Scanner;

public class Aula7_Exercicio4 {
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

        int divisor = 0;
        int contador = 1;
        while (contador <= numeroValido){
            if (numeroValido % contador == 0){
                divisor ++;
            }
            contador++;
        }
        if (divisor == 2){
            System.out.println("O Número é primo");
        }else{
            System.out.println("O número não é primo");
        }
    }
}
