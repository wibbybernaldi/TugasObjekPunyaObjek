package com.company.Clubbola;

/**
 * Created by Wibby on 09/06/2015.
 */
public class Pemain {
    private String namaPemain;
    private String tglLahir;
    private String kewarganegaraan;
    private String tmpLahir;

    public Pemain() {
    }

    public Pemain(String namaPemain, String tglLahir, String kewarganegaraan, String tmpLahir) {
        this.namaPemain = namaPemain;
        this.tglLahir = tglLahir;
        this.kewarganegaraan = kewarganegaraan;
        this.tmpLahir = tmpLahir;
    }

    public String getNamaPemain() {
        return namaPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getTmpLahir() {
        return tmpLahir;
    }

    public void setTmpLahir(String tmpLahir) {
        this.tmpLahir = tmpLahir;
    }

    @Override
    public String toString() {
        return  namaPemain + "\n\t-" + namaPemain +
                "-\n\t Tanggal Lahir   = " + tglLahir +
                "\n\t Tempat Lahir    = " + tmpLahir +
                "\n\t Kewarganegaraan = " + kewarganegaraan;
    }
}
