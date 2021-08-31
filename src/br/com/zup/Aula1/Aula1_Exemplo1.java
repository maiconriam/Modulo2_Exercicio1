package br.com.zup.Aula1;

public class Aula1_Exemplo1 {
    public static void main(String[] args) {

        int idadeDoUsuario = 18;
        String nomeDoUsuario = "Leticia";

        // Printando as variaveis declaradas
        System.out.print("Ola meu nome é ");
        System.out.print(nomeDoUsuario);
        System.out.print(" e minha idade é ");
        System.out.print(idadeDoUsuario);
        System.out.println(" anos");

        // Printando de forma concatenada as variaveis declaradas
        System.out.print("Olá, meu nome é " + nomeDoUsuario + " a minha idade é " + idadeDoUsuario + " anos");

    }
}
