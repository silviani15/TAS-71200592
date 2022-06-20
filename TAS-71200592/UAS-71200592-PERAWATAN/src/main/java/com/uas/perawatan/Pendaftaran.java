package com.uas.perawatan;

import java.util.Scanner;

public class Pendaftaran {
    private int idPendaftaran;
    private String nama;

    public Pendaftaran(int idPendaftaran, String nama){
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar){
        daftar.setPengunjung(pengunjung);
        daftar.setPemeriksa(pemeriksa);
        daftar.setPerawat(perawat);
        daftar.setStatusDaftar(true);
        System.out.println("Data Berhasil Disimpan!");
        System.out.println("==========Proses Daftar Berhasil==========");
    }

    public Pengunjung registrasi(){
        Scanner rm = new Scanner(System.in);
        System.out.print("Masukkan rm baru : ");
        String rrm = rm.nextLine();
        int rmm = Integer.parseInt(rrm);

        Scanner nama = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String name = nama.nextLine();
        String namaa = new String(String.valueOf(name));

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        String age = usia.nextLine();
        int agee = Integer.parseInt(age);

        Scanner alamat = new Scanner(System.in);
        System.out.print("Masukkan alamat anda : ");
        String alamaT = alamat.nextLine();
        String Alamat = new String(String.valueOf(alamaT));

        Scanner penyakit = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String Penyakit = penyakit.nextLine();
        String penyakiT = new String(String.valueOf(Penyakit));
        System.out.println();

        return new Pengunjung(rmm,namaa,agee,Alamat, penyakiT);
    }
}
