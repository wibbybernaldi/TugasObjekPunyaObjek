package com.company.Clubbola;

/**
 * Created by Wibby on 09/06/2015.
 */
public class TestClubbola {
    public static void main(String[] args) {
        Pemain pemainpertama = new Pemain("Steven Gerrard", "30 Mei 1980", "Inggris", "Whiston, Merseyside");


        Clubbola clubpertama = new Clubbola(pemainpertama, "Liver Pool", "Merah");
        System.out.println(clubpertama.toString());

        clubpertama.setWarnaJersie("Hitam");

        pemainpertama.setNamaPemain("Dirk Kuyt");
        pemainpertama.setTglLahir("22 Juli 1980");
        pemainpertama.setTmpLahir("Katwijk aan Zee");
        pemainpertama.setKewarganegaraan("Belanda");

        System.out.println(clubpertama.toString());
    }
}
