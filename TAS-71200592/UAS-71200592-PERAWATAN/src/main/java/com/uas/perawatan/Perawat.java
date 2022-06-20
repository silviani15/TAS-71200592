package com.uas.perawatan;

public class Perawat {
    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat, String nama){
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar){
        if(pengunjung.getPenyakit()==null){
            System.out.println("==========Harus Melakukan Proses Pendaftaran Terlebih Dahulu Di Bagian Pelayanan==========");
        }
        else{
            daftar.setStatusScreening(true);

        }
    }
}
