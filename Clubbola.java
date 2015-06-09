package com.company.Clubbola;

/**
 * Created by Wibby on 09/06/2015.
 */
public class Clubbola {
    private String namaClub;
    private String warnaJersie;
    private Pemain namaPemain;

    public Clubbola(Pemain namaPemain, String namaClub, String warnaJersie) {
        this.namaPemain = namaPemain;
        this.namaClub = namaClub;
        this.warnaJersie = warnaJersie;
    }

    public String getNamaClub() {
        return namaClub;
    }

    public void setNamaClub(String namaClub) {
        this.namaClub = namaClub;
    }

    public String getWarnaJersie() {
        return warnaJersie;
    }

    public void setWarnaJersie(String warnaJersie) {
        this.warnaJersie = warnaJersie;
    }

    public Pemain getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(Pemain namaPemain) {
        this.namaPemain = namaPemain;
    }

    @Override
    public String toString() {
        return "Klub bola" +
                "\n Nama Klub Bola\t= " + namaClub  +
                "\n Warna Jersie\t= " + warnaJersie+
                "\n Nama Pemain\t= " + namaPemain;
    }
}
