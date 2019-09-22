package com.dicoding.javafundamental.basic;

import Kendaraan.Kereta;
import Kendaraan.Mobil;
import Kendaraan.Motor;
import com.dicoding.javafundemental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = "+ today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok adalah = "+tomorrow);

    }
}