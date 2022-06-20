package com.uas.perawatan;

public class Daftar {
    private static int idPemeriksaan = 0;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;

    public static int getIdPemeriksaan() {
        return idPemeriksaan;
    }

    public static void setIdPemeriksaan(int idPemeriksaan) {
        Daftar.idPemeriksaan = idPemeriksaan;
    }

    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }

    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public void setPendaftaran(Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public boolean getStatusScreening() {
        return statusScreening;
    }
}
