package br.com.zup.Aula6;

import java.util.ArrayList;
import java.util.List;

public class Aula6_Exemplo1 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        //List<Integer> notas = new ArrayList<>();

        alunos.add("Maicon");
        alunos.add("André");
        alunos.add("Yan");
        System.out.println(alunos.get(0));
    }
}
