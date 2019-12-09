/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author IQBAL
 */
public class Maskapai {

    private int idmaskapai;
    private String namamaskapai;
    private String kodemaskapai;
    private String waktu;
    private String tanggal;
    private String terbangdari;
    private String terbangke;

    public Maskapai() {

    }

    public Maskapai(String namamaskapai, String kodemaskapai, String tanggal, String terbangdari, String terbangke) {
        this.namamaskapai = namamaskapai;
        this.kodemaskapai = kodemaskapai;
        this.tanggal = tanggal;
        this.terbangdari = terbangdari;
        this.terbangke = terbangke;
    }
    
    public int getIdmaskapai(){
        return idmaskapai;
    }
    
    public void setIdmaskapai(int idmaskapai){
        this.idmaskapai = idmaskapai;
    }

    public String getNamaMaskapai() {
        return namamaskapai;
    }

    public void setNamaMaskapai(String namamaskapai) {
        this.namamaskapai = namamaskapai;
    }

    public String getKodeMaskapai() {
        return kodemaskapai;
    }

    public void setKodeMaskapai(String kodemaskapai) {
        this.kodemaskapai = kodemaskapai;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTerbangdari() {
        return terbangdari;
    }

    public void setTerbangdari(String terbangdari) {
        this.terbangdari = terbangdari;
    }

    public String getTerbangke() {
        return terbangke;
    }

    public void setTerbangke(String terbangke) {
        this.terbangke = terbangke;
    }

    public Maskapai getById(int id) {
        Maskapai kat = new Maskapai();
        ResultSet rs = DBHelper.selectQuery("Select * from maskapai where id_maskapai  = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Maskapai();          
                kat.setNamaMaskapai(rs.getString("nama_maskapai"));
                kat.setKodeMaskapai(rs.getString("kode_maskapai"));
                kat.setTanggal(rs.getString("tanggal"));
                kat.setTerbangdari(rs.getString("terbang_dari"));
                kat.setTerbangke(rs.getString("terbang_ke"));
                kat.setIdmaskapai(rs.getInt("id_maskapai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Maskapai> getAll() {
        ArrayList<Maskapai> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select id_maskapai, "
                + "b.nama_maskapai as namamaskapai"
                + "b.kode_maskapai as kodemaskapai, "
                + "b.tanggal as tanggal, "
                + "b.terbang_dari as terbangdari, "
                + "b.terbang_ke as terbangke, "
                + "b.id_maskapai "
                + "from maskapai b ");
        try {
            while (rs.next()) {
                Maskapai kat = new Maskapai();         
                kat.setNamaMaskapai(rs.getString("nama_maskapai"));
                kat.setKodeMaskapai(rs.getString("kode_maskapai"));
                kat.setTanggal(rs.getString("tanggal"));
                kat.setTerbangdari(rs.getString("terbang_dari"));
                kat.setTerbangke(rs.getString("terbang_ke"));
                kat.setIdmaskapai(rs.getInt("id_maskpai"));
                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Maskapai> search(String keyword) {
        ArrayList<Maskapai> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select b.id_maskapai, "
                + "b.nama_maskapai as namamaskapai"
                + "b.kode_maskapai as kodemaskapai, "
                + "b.tanggal as tanggal, "
                + "b.terbang_dari as terbangdari, "
                + "b.terbang_ke as terbangke, "
                + "from maskapai b "
                + "where b.nama_maskapai like '%" + keyword + "%'");
        try {
            while (rs.next()) {
                Maskapai kat = new Maskapai();
                
                kat.setNamaMaskapai(rs.getString("nama_maskapai"));
                kat.setKodeMaskapai(rs.getString("kode_maskapai"));
                kat.setTanggal(rs.getString("tanggal"));
                kat.setTerbangdari(rs.getString("terbang_dari"));
                kat.setTerbangke(rs.getString("terbang_ke"));
                kat.setIdmaskapai(rs.getInt("id_maskapai"));

                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idmaskapai).getIdmaskapai() == 0) {
            String sql = "Insert into maskapai (nama_maskapai, kode_maskapai, tanggal,"
                    + "terbang_dari, terbang_ke) "
                    + "values ("
                    + "'" + this.namamaskapai + "', "
                    + "'" + this.kodemaskapai + "', "
                    + "'" + this.tanggal + "', "
                    + "'" + this.terbangdari + "', "
                    + "'" + this.terbangke + "'"
                    + ")";
            this.idmaskapai = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "Update maskapai set "
                    + "namamaskapai = '" + this.namamaskapai + "', "
                    + "kodemaskapai = '" + this.kodemaskapai + "', "
                    + "tanggal = '" + this.tanggal + "', "
                    + "terbang_dari = '" + this.terbangdari + "', "
                    + "terbang_ke = '" + this.terbangke + "', "
                    + "where id_maskapai = '" + this.idmaskapai + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "Delete from maskapai where id_maskapai = '" + this.idmaskapai + "'";
        DBHelper.executeQuery(sql);
    }
}
