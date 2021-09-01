package br.com.zup.Aula7;

public class Aula7_Exercicio6 {
    public static void main(String[] args) {

        int contador = 1;
        int numeros = 50;
        int numerosImpares = 0;

        while (contador <= numeros){
            if (contador % 2 !=0){
                numerosImpares = contador;
                System.out.println(numerosImpares);
            }
            contador ++;
        }

    }
}
