package br.com.zup.Aula7;

import java.util.HashMap;
import java.util.Map;

public class Aula7_Exemplo2 {
    public static void main(String[] args) {
        Map<String, String> contatos = new HashMap<String, String>();

        contatos.put("andre@andre", "André");
        contatos.put("maicon@maicon", "Maicon");

        for (String referencia : contatos.keySet()){
            System.out.println("Chaves :" + referencia + " valor " + contatos.get(referencia));
        }
    }
}
