package br.com.zup.Aula4;

import java.util.Scanner;

public class Aula4_Exercicio1 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Por favor diga quantas horas você trabalho esse mês: ");
        double horasTrabalhadas = obj_leitor.nextDouble();

        System.out.println("Por favor diga quanto você recebe por hora trabalhada: ");
        double valorDaHoraTrabalhada = obj_leitor.nextDouble();

        double salarioBruto = horasTrabalhadas * valorDaHoraTrabalhada;
        double porcentagemDoFGTS = 0;
        double porcentagemDoINSS = 0;
        double porcentagemDoIr = 0;

        if (salarioBruto > 0) {
            if (salarioBruto <= 900) {
                porcentagemDoFGTS = 0.11;
                porcentagemDoINSS = 0.1;
                porcentagemDoIr = 0;
            } else if (salarioBruto > 900 & salarioBruto <= 1500) {
                porcentagemDoFGTS = 0.11;
                porcentagemDoINSS = 0.1;
                porcentagemDoIr = 0.05;
            } else if (salarioBruto > 1500 & salarioBruto <= 2500) {
                porcentagemDoFGTS = 0.11;
                porcentagemDoINSS = 0.1;
                porcentagemDoIr = 0.1;
            } else if (salarioBruto > 2500) {
                porcentagemDoFGTS = 0.11;
                porcentagemDoINSS = 0.1;
                porcentagemDoIr = 0.2;
            }

            double descontoIR = salarioBruto * porcentagemDoIr;
            double descontoFGTS = salarioBruto * porcentagemDoFGTS;
            double descontoINSS = salarioBruto * porcentagemDoINSS;
            double descontos = descontoINSS + descontoIR;
            double salarioLiquido = salarioBruto - descontos;

            System.out.printf("Salário Bruto:\t(" + horasTrabalhadas + " * " + valorDaHoraTrabalhada + ")\t\tR$:" + salarioBruto +"\t\n");
            System.out.printf("(-) IR (" + porcentagemDoIr * 100 + "%%)\t\t\t\t\t\tR$:"+ descontoIR + "\t\n");
            System.out.printf("(-) INSS (" + porcentagemDoINSS * 100 + "%%)\t\t\t\t\tR$:"+ descontoINSS + "\t\n");
            System.out.printf("FGTS (" + porcentagemDoFGTS * 100 + "%%)\t\t\t\t\t\tR$:"+ descontoFGTS + "\t\n");
            System.out.printf("Total de descontos\t\t\t\t\tR$:" + descontos + "\t\n");
            System.out.printf("Salário Liquido\t\t\t\t\t\tR$:" +salarioLiquido + "\t\n");
        }
        else{
            System.out.println("Por favor, digite um numero maior que 0");
        }
    }


}
