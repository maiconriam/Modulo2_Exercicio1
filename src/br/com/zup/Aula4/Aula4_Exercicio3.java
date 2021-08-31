package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exercicio3 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        int contadorDeRespostas = 0;

        System.out.println("Ola, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas");
        System.out.println("Por favor responda S para sim e N para não");
        System.out.println("Telefonou para a vítima?");

        String resposta = obj_leitor.nextLine();

        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas +1;
        }
        System.out.println("Esteve no local do crime?");

        resposta = obj_leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Mora perto da vítima?");

        resposta = obj_leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Devia para a vítima?");

        resposta = obj_leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Já trabalhou com a vítima?");

        resposta = obj_leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        switch (contadorDeRespostas){
            case 2:
                System.out.println("Você é um Suspeito do crime.");
                break;
            case 3:
                System.out.println("Você é cúmplice do crime");
                break;
            case 4:
                System.out.println("Você é cúmplice do crime");
                break;
            case 5:
                System.out.println("Você é o assassino! Você está preso.");
                break;
            default:
                System.out.println("Você é inocente. Me perdoe o incômodo");
                break;
        }
    }
}
