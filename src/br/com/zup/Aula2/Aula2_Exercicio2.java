package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exercicio2 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);


        System.out.println("Por favor, digite o valor do produto 1: ");
        double produto1 = obj_leitor.nextDouble();
        System.out.println("Por favor, digite o valor do produto 2: ");
        double produto2 = obj_leitor.nextDouble();
        System.out.println("Por favor, digite o valor do produto 3: ");
        double produto3 = obj_leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("O produto1 é o mais barato");
        }
        else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("O produto2 é o mais barato");
        }
        else{
            System.out.println("O produto3 é o mais barato");
        }
    }
}
