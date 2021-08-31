package br.com.zup.Aula1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double soma;
        double media;

        System.out.println("Vou somar a media aritmetica para você");
        System.out.println("Por favor digite a nota 1: ");
        nota1 = obj_leitor.nextDouble();
        System.out.println("Por favor digite a nota 2: ");
        nota2 = obj_leitor.nextDouble();
        System.out.println("Por favor digite a nota 3: ");
        nota3 = obj_leitor.nextDouble();
        System.out.println("Por favor digite a nota 4: ");
        nota4 = obj_leitor.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;
        media = soma/4;

        System.out.println("Sua média aritmética de todas as notas é:");
        System.out.println(media);
    }
}
