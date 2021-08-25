package br.com.zup;

public class Aula1_Exemplo3 {
    public static void main(String[] args) {
        //Armazenou os dois dados necessarios para o processamento
        float qtdDeHorasTrabalhadas = 40.6F;
        float salarioPorHoras = 45.7F;

        //Calcular o salario bruto
        float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHoras;

        //Mostrar resultado para o usuario

        System.out.println("Você trabalhou " +qtdDeHorasTrabalhadas + "Hrs, e você recebe R$" + salarioPorHoras + "por horas");
        System.out.println("Portanto, este mês voce receberá R$" +salarioBruto);
    }
}
