package br.com.zup.Aula1;

public class ExercicioComplementar2 {
    public static void main(String[] args) {
        double tamanhodaarea = 600;
        double litros = tamanhodaarea / 6;
        double lata = litros / 18;
        double galoes = litros /3.6;
        double folga = litros + (litros * 0.1);
        int totalLatas = (int) folga / 18;
        double litrosQueFaltam = folga - totalLatas * 18;
        int totalGaloes = (int) (litrosQueFaltam / 3.6);

        System.out.println("A quantidade de latas necessárias para pintar a área de " + tamanhodaarea + "m² será de " + lata + " latas");
        System.out.println("A quantidade de galôes necessárias para pintar a área de " +tamanhodaarea + "m² será de " +galoes + " galões");
        System.out.println("Você ira usar " +litros + " litros de tinta");
        System.out.println("Com a folga adicional você precisará " +folga + " litros de tinta.");
        System.out.println("Você tera que comprar " +totalLatas + " latas de tinta.");
        System.out.println("Como ainda faltam " +litrosQueFaltam + " litros, portanto você deverá comprar mais " +totalGaloes + " galões.");
    }
}
