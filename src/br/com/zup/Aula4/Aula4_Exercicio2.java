package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exercicio2 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        double A = 1.9;
        double G = 2.5;

        System.out.println("Por favor escolha sua tipo de combustível");
        System.out.println("Por favor use A para álcool e G para gasolina");
        String tipoDeCombustivel = obj_leitor.nextLine();
        System.out.println("Quantos litros de combustível você quer?");
        double litrosDeCombustivel = obj_leitor.nextDouble();

        double descontoA = 0;
        double descontoAA = 0;
        double valorASerPago = 0;

        if (tipoDeCombustivel.equals("A") & litrosDeCombustivel > 0) {

            if (litrosDeCombustivel <= 20) {
                valorASerPago = litrosDeCombustivel * A;
                descontoA = litrosDeCombustivel * 0.03;
                descontoAA = descontoA + A;
                System.out.println("Você pagará R$ : " + valorASerPago + " reais");
                System.out.println("Você escolheu a opção " + tipoDeCombustivel + " de Álcool");
                System.out.println("Você colocou um total de " + litrosDeCombustivel + " litros");
                System.out.println("Você recebara um desconto de R$ :" + descontoAA + " reais");
                System.out.println("Você pagará R$ : " + (valorASerPago - descontoAA) + " já com descontos.");
            } else if (litrosDeCombustivel > 20) {
                valorASerPago = litrosDeCombustivel * A;
                descontoA = litrosDeCombustivel * 0.05;
                descontoAA = descontoA + A;
                System.out.println("Você pagará R$ : " + valorASerPago + " reais");
                System.out.println("Você escolheu a opção " + tipoDeCombustivel + " de Álcool");
                System.out.println("Você colocou um total de " + litrosDeCombustivel + " litros");
                System.out.println("Você recebara um desconto de R$ :" + descontoAA + " reais");
                System.out.println("Você pagará R$ : " + (valorASerPago - descontoAA) + " já com descontos.");
            }
        } else if (tipoDeCombustivel.equals("G") & litrosDeCombustivel > 0) {

            if (litrosDeCombustivel <= 20) {
                valorASerPago = litrosDeCombustivel * G;
                descontoA = litrosDeCombustivel * 0.04;
                descontoAA = descontoA + G;
                System.out.println("Você pagará R$ : " + valorASerPago + " reais");
                System.out.println("Você escolheu a opção " + tipoDeCombustivel + " de Gasolina");
                System.out.println("Você colocou um total de " + litrosDeCombustivel + " litros");
                System.out.println("Você recebara um desconto de R$ :" + descontoAA + " reais");
                System.out.println("Você pagará R$ : " + (valorASerPago - descontoAA) + " já com descontos.");
            } else if (litrosDeCombustivel > 20) {
                valorASerPago = litrosDeCombustivel * G;
                descontoA = litrosDeCombustivel * 0.06;
                descontoAA = descontoA + G;
                System.out.println("Você pagará R$ : " + valorASerPago + " reais");
                System.out.println("Você escolheu a opção " + tipoDeCombustivel + " de Gasolina");
                System.out.println("Você colocou um total de " + litrosDeCombustivel + " litros");
                System.out.println("Você recebara um desconto de R$ :" + descontoAA + " reais");
                System.out.println("Você pagará R$ : " + (valorASerPago - descontoAA) + " já com descontos.");
            }
        } else {
            System.out.println("Por favor informe o tipo de combustivel correto ou não use numero a baixo de 0");
        }
    }
}

