package br.com.zup.Aula1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double qtdDehoras;
        double salarioPorHoras;
        double salarioBruto;
        double INSS;
        double sindicato;
        double IR;
        double liquido;

        System.out.println("Quantas horas você trabalho no mês?");
        qtdDehoras = obj_leitor.nextDouble();
        System.out.println("Você ganha quanto por hora trabalhada?");
        salarioPorHoras = obj_leitor.nextDouble();
        salarioBruto = qtdDehoras * salarioPorHoras;
        System.out.println("Esse mês você ganhou R$" +salarioBruto);

        INSS = salarioBruto * 0.08;
        System.out.println("O valor do INSS desse mês é: R$" +INSS);
        sindicato = salarioBruto * 0.05;
        System.out.println("O Valor do sindicato desse mês é: R$" +sindicato);
        IR = salarioBruto * 0.11;
        System.out.println("O Valor do sindicato desse mê é: R$" +IR);
        liquido = salarioBruto - IR - sindicato - INSS;
        System.out.println("Por tanto você recebera o valor liquido de: R$" +liquido);


        //float qtdDeHorasTrabalhadas = 40.6F;
        //float salarioPorHoras = 45.7F;

        //float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHoras;

        //float INSS= salarioBruto * 0.08f;
        //float sindicato = salarioBruto * 0.05f;
        //float IR = salarioBruto * 0.11f;
        //float Liquido = salarioBruto - IR - sindicato - INSS;



        //System.out.println("Você trabalhou " +qtdDeHorasTrabalhadas + "Hrs, e você recebeu R$" + salarioPorHoras + " por horas");
        //System.out.println("Portanto, este mês voce receberá bruto R$" +salarioBruto + ", voce pagará para o Imposto de Renda R$" + IR);
        //System.out.println("Você tambem pagara para o INSS R$" +INSS + " e também pagara para o sindicato R$" +sindicato);
        //System.out.println("No final do mes voce recebera liquido R$" +Liquido);











    }
}
