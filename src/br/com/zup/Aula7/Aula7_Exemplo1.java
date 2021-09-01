package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();

        alunos.add("Maicon");
        alunos.add("André");

        for (String lista : alunos){
            System.out.println(lista);
        }
        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("0458978778", "André");
        contatos.put("1029013289", "André");

        for (String referencia : contatos.keySet()){
            System.out.println(referencia);
    }
}
}
