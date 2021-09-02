package br.com.zup.Aula7;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula7_LevelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map <String, String> alunos = new HashMap<String, String>();

        System.out.println("Digite o nome completo do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o telefone do usuario: ");
        String telefone = leitor.nextLine();
        System.out.println("Digite o email do usuario: ");
        String email = leitor.nextLine();

        alunos.put(email, "Nome: " + nome + " Telefone: " + telefone);
    }
}
