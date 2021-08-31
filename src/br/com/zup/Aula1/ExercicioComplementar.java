package br.com.zup.Aula1;

import java.util.Scanner;

public class ExercicioComplementar {
    public static void main(String[] args) {

        Scanner obj_leitor = new Scanner(System.in);

        double pesoDosPeixes = obj_leitor.nextDouble();
        double kg_MaximoPermitido = 50;
        double kg_excedente;
        double valorDaMulta = 4.0;
        double valorASerPago;

        kg_excedente = pesoDosPeixes - kg_MaximoPermitido;
        valorASerPago = kg_excedente * valorDaMulta;

        System.out.println("Por favor digite o valor lido na balança");
        System.out.println("KG lido na balança: " +pesoDosPeixes + "KG");
        System.out.println("O Permetido pelo estado era: " +kg_MaximoPermitido + "KG");
        System.out.println("O valor atual da multa é: R$" +valorDaMulta);
        System.out.println("O valor excendente lido na balança foi " +kg_excedente + "KG");
        System.out.println("Você terá que pagar: R$" +valorASerPago);
    }
}
