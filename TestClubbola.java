package com.company.Clubbola;

/**
 * Created by Wibby on 09/06/2015.
 */
public class TestClubbola {
    public static void main(String[] args) {
        Pemain pemainpertama = new Pemain("Steven Gerrard", "30 Mei 1980", "Inggris", "Whiston, Merseyside");
        Pemain pemainkedua = new Pemain();

        Clubbola clubpertama = new Clubbola(pemainpertama, "Liver Pool", "Merah");

        System.out.println(clubpertama.toString());

        clubpertama.setWarnaJersie("Hitam");

        pemainpertama.setNamaPemain("Dirk Kuyt");
        pemainpertama.setTglLahir("22 Juli 1980");
        pemainpertama.setTmpLahir("Katwijk aan Zee");
        pemainpertama.setKewarganegaraan("Belanda");

        System.out.println(clubpertama.toString());

        clubpertama.setNamaPemain(pemainkedua);
        pemainkedua.setNamaPemain("Fernando Torres");
        pemainkedua.setTglLahir("20 Maret 1984");
        pemainkedua.setTmpLahir("Fuenlabrada");
        pemainkedua.setKewarganegaraan("Spanyol");

        System.out.println(clubpertama.toString());

        clubpertama.setNamaClub("Atlético de Madrid");
        clubpertama.setWarnaJersie("Merah Putih");

        System.out.println(clubpertama.toString());
    }
}
