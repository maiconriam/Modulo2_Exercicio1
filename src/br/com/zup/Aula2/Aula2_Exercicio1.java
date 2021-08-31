package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exercicio1 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro numero: ");
        double primeiroNumero = obj_leitor.nextDouble();

        System.out.println("Por Favor digite o segundo numero: ");
        double segundoNumero = obj_leitor.nextDouble();

        if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro numero é o maior");
        }
        else if(primeiroNumero == segundoNumero){
            System.out.println("Os numeros são iguais");
        }
        else{
            System.out.println("O segundo numero é o maior");
        }


    }
}
