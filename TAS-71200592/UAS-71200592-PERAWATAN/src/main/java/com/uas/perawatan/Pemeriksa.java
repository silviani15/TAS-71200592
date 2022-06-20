package com.uas.perawatan;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(int idPemeriksa, String nama, String spesialis, String ruangan){
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void cekStatus(Pengunjung pengunjung){
        if(!pengunjung.getStatus()){
            System.out.println("==========Pasien Masih Sakit==========");
        }
        else{
            System.out.println("==========Pasien Sudah Sembuh==========");
            System.out.println("Status Pengunjung Berhasil Diubah!");
        }
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar){
        if(daftar.getStatusScreening()){
            int lvl = pengunjung.getLevelPenyakit();
            if(pengunjung.getLevelPenyakit()>0){
                pengunjung.setLevelPenyakit(lvl-1);
            }
            else{
                pengunjung.setStatus(true);
                System.out.println("Status Pengunjung Berhasil Diubah!");
            }
        }
        else{
            System.out.println("==========Harus Melakukan Proses Pendaftaran Terlebih Dahulu Di Bagian Pelayanan==========");
        }

    }
}
