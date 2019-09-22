package com.dicoding.javafundemental.inputoutput;

import java.util.Scanner;

/**
 * Created by semihuman on 9/21/2019.
 */

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Penghitungan Sederhana");
        System.out.println("Masukkan angka pertama");
        int value1 = scanner.nextInt();
        System.out.println("Masukkan angka kedua");
        int value2 = scanner.nextInt();
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah "+hasil);


    }
}
