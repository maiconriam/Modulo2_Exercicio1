package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exercicio5 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Digite os seguintes valores para respectivos dias da semana :");
        System.out.println("1- Domingo");
        System.out.println("2- Segunda");
        System.out.println("3- Terça");
        System.out.println("4- Quarta");
        System.out.println("5- Quinta");
        System.out.println("6- Sexta");
        System.out.println("7- Sábado");

        System.out.println("Digite o dia você deseja");

        double  diaDesejado = obj_leitor.nextDouble();

        if (diaDesejado == 1){
            System.out.println("O dia selecionado foi o domingo");
        }
        else if (diaDesejado == 2){
            System.out.println("O dia selecionado foi o segunda");
        }
        else if (diaDesejado == 3){
            System.out.println("O dia selecionado foi o terça");
        }
        else if (diaDesejado == 4){
            System.out.println("O dia selecionado foi o quarta");
        }
        else if (diaDesejado == 5){
            System.out.println("O dia selecionado foi o quinta");
        }
        else if (diaDesejado == 6){
            System.out.println("O dia selecionado foi o sexta");
        }
        else if (diaDesejado == 7){
            System.out.println("O dia selecionado foi o sabado");
        }
        else{
            System.out.println("Valor invalido");
        }
    }
}
