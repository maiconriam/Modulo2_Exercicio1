package br.com.zup.Aula3;

import java.util.Scanner;

public class Aula3_Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeDoUsuario = leitor.nextLine();

        switch (nomeDoUsuario){
            case "André":
                System.out.println("Professor mais lindo da zup");
                break;
            case "Vinicius":
                System.out.println("Professor mais feio da zup");
                break;
            case "Maga":
                System.out.println("Gestora mais legal da zup");
                break;
            default:
                System.out.println("Digite o nome de alguém dos programas de formação");
                break;
        }
    }
}

