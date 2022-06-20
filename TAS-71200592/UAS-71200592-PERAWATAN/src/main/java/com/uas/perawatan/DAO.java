package com.uas.perawatan;

import java.sql.*;
public class DAO {
    public Perawat getPerawatByID(int idPerawat) {
        return null;
    }

    public Pemeriksa getPemeriksaByID(int idPemeriksa) {
        return null;
    }

    public Pendaftaran getPendaftaranByID(int idPendaftaran) {
        return null;
    }


    public static void getPengunjungSembuh(){
        String url="jdbc:sqlite:database.db";
        String q="SELECT * from Pengunjung where Status='sembuh'";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
