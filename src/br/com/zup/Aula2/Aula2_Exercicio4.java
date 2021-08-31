package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exercicio4 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);


        System.out.println("Por favor informe seu sálario: ");
        double salario = obj_leitor.nextDouble();

        double aumento1 = salario * 0.2;
        double aumento2 = salario * 0.15;
        double aumento3 = salario * 0.1;
        double aumento4 = salario * 0.05;

        double soma1 = salario + aumento1;
        double soma2 = salario + aumento2;
        double soma3 = salario + aumento3;
        double soma4 = salario + aumento4;


        if (salario >0 & salario <=280){
            System.out.println("Voce recebeu : R$" +salario + " e você ganhou 20% de aumento.");
            System.out.println("Seu aumento foi de R$ " + aumento1);
            System.out.println("Com o aumento seu sálario será de R$ " + soma1);
        }
        else if (salario >280 & salario <=700){
            System.out.println("Voce recebeu : R$" +salario + " e você ganhou 15% de aumento.");
            System.out.println("Seu aumento foi de R$ " + aumento2);
            System.out.println("Com o aumento seu sálario será de R$ " + soma2);
        }
        else if (salario >700 & salario <=1500){
            System.out.println("Voce recebeu : R$" +salario + " e você ganhou 10% de aumento.");
            System.out.println("Seu aumento foi de R$ " + aumento3);
            System.out.println("Com o aumento seu sálario será de R$ " + soma3);
        }
        else if (salario >1500){
            System.out.println("Voce recebeu : R$" +salario + " e você ganhou 5% de aumento.");
            System.out.println("Seu aumento foi de R$ " + aumento4);
            System.out.println("Com o aumento seu sálario será de R$ " + soma4);
        }
        else{
            System.out.println("Valor invalido!");
        }

        }
    }

