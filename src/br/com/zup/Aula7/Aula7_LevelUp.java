package br.com.zup.Aula7;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula7_LevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();
        boolean chave = true;
        int opcao = 0;

        while (chave == true) {
            System.out.println("Digite 1: Para cadastrar um aluno");
            System.out.println("Digite 2: Para sair do programa");
            opcao = leitor.nextInt();
            leitor.nextLine();
            if (opcao == 1) {
                System.out.println("Digite o nome completo do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o telefone do usuario: ");
                String telefone = leitor.nextLine();
                System.out.println("Digite o email do usuario: ");
                String email = leitor.nextLine();

                alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);

            } else if (opcao == 2) {
                chave = false;

            } else {
                System.out.println("Por favor, digite um valor valido.");
            }
        }
    }
}

//        Entrega minima
//        System.out.println("Digite o nome completo do aluno: ");
//        String nome = leitor.nextLine();
//        System.out.println("Digite o telefone do usuario: ");
//        String telefone = leitor.nextLine();
//        System.out.println("Digite o email do usuario: ");
//        String email = leitor.nextLine();
//
//        alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);