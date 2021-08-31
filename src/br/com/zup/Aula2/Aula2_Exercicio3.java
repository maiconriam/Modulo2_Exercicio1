package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exercicio3 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = obj_leitor.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = obj_leitor.nextDouble();

        double soma = nota1 + nota2;
        double media = soma /2;

        if (nota1 >=0 & nota1 <=10 & nota2 >=0 & nota2 <=10) {
            if (media >= 0 & media < 7) {
                System.out.println("Sua média foi de " + media + " e você foi reprovado.");
            } else if (media >= 7 & media < 10) {
                System.out.println("Sua média foi de " + media + " e você foi aprovado.");
            } else if (media == 10) {
                System.out.println("Sua média foi de " + media + " e você foi aprovado com distinção.");
            }
        }
        else {
            System.out.println("Valor invalido");
        }




//        System.out.println("Por favor digite a nota do aluno: ");
//        double notaDoAluno = obj_leitor.nextDouble();
//
//        if(notaDoAluno >= 0 & notaDoAluno < 6){
//            System.out.println("Você foi reprovado com a nota: " +notaDoAluno);
//        }
//        else if (notaDoAluno >=6 & notaDoAluno < 10){
//            System.out.println("Você foi aprovado com a nota: " +notaDoAluno);
//        }
//        else if (notaDoAluno ==10){
//            System.out.println("Você foi aprovado com distinção");
//        }
//        else{
//            System.out.println("Numero Invalido");
//        }
    }
}
