package br.com.zup.Aula2;

import java.util.Scanner;

public class Aula2_Exemplo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite seu nome de usuário");
        String nomeDoUsuario = leitor.nextLine();
        System.out.println("Por favor digite sua idade");
        int idadeDoUsuario = leitor.nextInt();

        System.out.println("O seu nome é: " +nomeDoUsuario);
        System.out.println("Sua idade é: "+ idadeDoUsuario);
    }
}
