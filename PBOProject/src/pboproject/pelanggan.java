/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author IQBAL
 */
public class pelanggan {

    private int idpelanggan;
    private String nama;
    private String alamat;
    private String telepon;

    public pelanggan() {

    }
    
    public pelanggan (String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdPelanggan() {
        return idpelanggan;
    }

    public void setIdPelanggan(int idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public pelanggan getById(int id) {
        pelanggan kat = new pelanggan();
        ResultSet rs = DBHelper.selectQuery("Select * from pelanggan where id_pelangan = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new pelanggan();
                kat.setIdPelanggan(rs.getInt("id_pelangan"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
   public ArrayList<pelanggan> getAll() {
        ArrayList<pelanggan> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select b.id_pelanggan as idpelanggan, "
                + "b.nama as nama, "
                + "b.alamat as alamat, "
                + "b.telepon as telepon, "
                + "from pelanggan b "
                + "left join kategori k on b.idkategori = k.idkategori");
        try {
            while (rs.next()) {
                pelanggan kat = new pelanggan();
                kat.setIdPelanggan(rs.getInt("id_pelangan"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));
                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<pelanggan> search(String keyword) {
        ArrayList<pelanggan> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select b.id_pelanggan, "
                + "b.nama as nama, "
                + "b.alamat as alamat, "
                + "b.telepon as telepon, "
                + "from pelanggan b "
                + "where b.nama like '%" + keyword + "%' or b.alamat like '%" + keyword + "%'"
                + " or b.telepon like '%" + keyword + "%'");
        try {
            while (rs.next()) {
                pelanggan kat = new pelanggan();
                kat.setIdPelanggan(rs.getInt("id_pelangan"));
                kat.setNama(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelepon(rs.getString("telepon"));

                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idpelanggan).getIdPelanggan() == 0) {
            String sql = "Insert into pelanggan (id_pelangan, nama, alamat, telepon) "
                    + "values ("
                    + "'" + this.idpelanggan + "', "
                    + "'" + this.nama + "',"
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "' "
                    + ")";
            this.idpelanggan = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "Update pelanggan set "
                    + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "', "
                    + "tanggal = '" + this.telepon + "' "
                    + "where idpelanggan = '" + this.idpelanggan + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "Delete from pelanggan where idbuku = '" + this.idpelanggan + "'";
        DBHelper.executeQuery(sql);
    }
}

