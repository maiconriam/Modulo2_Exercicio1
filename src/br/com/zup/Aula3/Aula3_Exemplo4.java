package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeDoUsuario = leitor.nextLine();

        if (nomeDoUsuario.equals("André")){
            System.out.println("Professor mais lindo da zup");
        }
        else if (nomeDoUsuario.equals("Vinicius")){
            System.out.println("Professor mais feio da zup");
        }
        else if (nomeDoUsuario.equals("Maga")){
            System.out.println("Gestora mais legal da zup");
        }
        else{
            System.out.println("Digite o nome de alguém dos programas de formação");
        }
    }
    }
