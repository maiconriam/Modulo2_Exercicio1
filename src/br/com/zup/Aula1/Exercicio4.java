package br.com.zup.Aula1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Armazenou os dois dados necessarios para o processamento

        Scanner obj_leitor = new Scanner(System.in);

        double qtdDehoras;
        double salarioPorHoras;
        double salarioBruto;

        System.out.println("Quantas horas você trabalho no mês?");
        qtdDehoras = obj_leitor.nextDouble();
        System.out.println("Você ganha quanto por hora trabalhada?");
        salarioPorHoras = obj_leitor.nextDouble();
        salarioBruto = qtdDehoras * salarioPorHoras;
        System.out.println("Esse mês você ganhou R$" +salarioBruto);

        //float qtdDeHorasTrabalhadas = 40.6F;
        //float salarioPorHoras = 45.7F;

        //Calcular o salario bruto
        //float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHoras;

        //Mostrar resultado para o usuario

        //System.out.println("Você trabalhou " +qtdDeHorasTrabalhadas + "Hrs, e você recebe R$" + salarioPorHoras + "por horas");
        //System.out.println("Portanto, este mês voce receberá R$" +salarioBruto);
    }
}
