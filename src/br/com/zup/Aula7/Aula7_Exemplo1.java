package br.com.zup.Aula7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aula7_Exemplo1 {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();


        alunos.add("Maicon");
        alunos.add("Ju");

        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("0458978778", alunos.get(0));
        contatos.put("1029013289", alunos.get(1));

        for (String referencia : contatos.values()){
            System.out.println(referencia);
    }
}
}
