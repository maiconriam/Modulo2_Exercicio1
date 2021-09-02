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
            System.out.println("Digite 2: Para exibir a lista");
            System.out.println("Digite 3: Para remover um aluno da lista usando o email");
            System.out.println("Digite 4: Para sair do programa");
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

            }
            else if (opcao == 2) {
                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + " Email: " + chaveAluno);
                }

            }
            else if (opcao == 3) {
                System.out.println("Por favor, digite o email a ser deletado: ");
                String emailDeletado = "";
                String emailASerDeletado = leitor.nextLine();
                for (String emailAluno : alunos.keySet()){
                    if(emailAluno.equals(emailASerDeletado)){
                        System.out.println("Email a ser deletado com sucesso.");
                        emailDeletado = emailASerDeletado;

                    }
                }
                alunos.remove(emailDeletado);
            }
            else if (opcao == 4) {
                chave = false;
            }
            else {
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
