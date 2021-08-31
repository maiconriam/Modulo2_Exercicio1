package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

public class Aula6_Exemplo2 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(10);

        for (Integer referencia : todosOsNumeros){
            if (referencia % 2 ==0){
                numerosPares.add(referencia);
            }else{
                numerosImpares.add(referencia);
            }
        }

        System.out.println("Lista completa de todos os numeros: ");
        System.out.println(todosOsNumeros);
        System.out.println("Todos os numeros impares: ");
        System.out.println(numerosImpares);
        System.out.println("Todos os numeros pares: ");
        System.out.println(numerosPares);
    }
}
