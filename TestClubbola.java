package com.company.Clubbola;

/**
 * Created by Wibby on 09/06/2015.
 */
public class TestClubbola {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Steven Gerrard", "30 Mei 1980", "Inggris", "Whiston, Merseyside");


        Clubbola club1 = new Clubbola(pemain1, "Liver Pool", "Merah");
        System.out.println(club1.toString());

        club1.setWarnaJersie("Hitam");

        pemain1.setNamaPemain("Dirk Kuyt");
        pemain1.setTglLahir("22 Juli 1980");
        pemain1.setTmpLahir("Katwijk aan Zee");
        pemain1.setKewarganegaraan("Belanda");

        System.out.println(club1.toString());
    }
}
