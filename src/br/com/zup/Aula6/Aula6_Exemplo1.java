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
        alunos.add("Marcío");

        for (String referencia : alunos){
            if (referencia.contains("Maicon")){
                System.out.println("Aluno cadastrado");
            }else{
                System.out.println("Aluno não cadastrado no sistema");
            }
        }
    }
}
