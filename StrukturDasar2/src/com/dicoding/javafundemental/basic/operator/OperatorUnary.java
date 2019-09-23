package com.dicoding.javafundemental.basic.operator;

/**
 * Created by semihuman on 9/23/2019.
 */
public class OperatorUnary {
    public static void main(String[]args) {
        System.out.println("Opearator untuk nilai plus");
        int nilaiAwal = 5;
        nilaiAwal=+nilaiAwal;
                System.out.println("Nilai 5 "+nilaiAwal);

        System.out.println("OPerator untuk nilai minus");
        int nilaiAwal2 = 5;
                nilaiAwal2 = -nilaiAwal2;
                System.out.println("nilai -5 adalah"+nilaiAwal2);

        System.out.println("Operator untuk menambah satu point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Nilai plus 1 " +nilaiAwal3);

        System.out.println("operatir untuk mengurangi satu point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Nilai dikurang 1 point "+nilaiAwal4);

        System.out.println("Nilai untuk membalikkan pernyataan");
        int nilai5 = 5;
        boolean sukses = true;
        System.out.println("sukses seharusnya " +!sukses);

    }
}
