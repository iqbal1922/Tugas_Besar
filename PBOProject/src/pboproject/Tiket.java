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
public class Tiket {

    private int idtiket;
    private String jenistiket;
    private String penumpang;
    private int hargatiket;
    private int totalharga;
    private int jumlahtiket;
    private String pilihbank;
    private String kodebank;
    private int bayar;

    public Tiket() {

    }

    public Tiket(String jenistiket, String penumpang, int hargatiket, int totalharga, int jumlahtiket, String pilihbank, String kodebank, int bayar) {
        this.jenistiket = jenistiket;
        this.penumpang = penumpang;
        this.hargatiket = hargatiket;
        this.totalharga = totalharga;
        this.jumlahtiket = jumlahtiket;
        this.pilihbank = pilihbank;
        this.kodebank = kodebank;
        this.bayar = bayar;
    }

    public int getIdtiket(){
        return idtiket;
    }
    
     public void setIdtiket(int idtiket){
        this.idtiket = idtiket;
    }
    
    public String getJenisTiket() {
        return jenistiket;
    }

    public void setJenisTiket(String jenistiket) {
        this.jenistiket = jenistiket;
    }

    public String getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(String penumpang) {
        this.penumpang = penumpang;
    }

    public int getHargaTiket() {
        return hargatiket;
    }

    public void setHargaTiket(int hargatiket) {
        this.hargatiket = hargatiket;
    }

    public int getJumlahTiket() {
        return jumlahtiket;
    }

    public void setJumlahTiket(int jumlahtiket) {
        this.jumlahtiket = jumlahtiket;
    }

    public int getTotalHarga() {
        return totalharga;
    }

    public void setTotalHarga(int totalharga) {
        this.totalharga = totalharga;
    }
    
    public String getPilihBank() {
        return pilihbank;
    }

    public void setPilihBank(String pilihbank) {
        this.pilihbank = pilihbank;
    }

    public String getKodeBank() {
        return kodebank;
    }

    public void setKodeBank(String kodebank) {
        this.kodebank = kodebank;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }
    
    public Tiket getById(int id) {
        Tiket kat = new Tiket();
        ResultSet rs = DBHelper.selectQuery("Select * from tiket where jenis_tiket  = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Tiket();
                kat.setJenisTiket(rs.getString("jenis_tiket"));
                kat.setPenumpang(rs.getString("penumpang"));
                kat.setHargaTiket(rs.getInt("harga_tiket"));
                kat.setTotalHarga(rs.getInt("total_harga"));
                kat.setPilihBank(rs.getString("pilih_bank"));
                kat.setKodeBank(rs.getString("kode_bank"));
                kat.setBayar(rs.getInt("bayar"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
    
     public ArrayList<Tiket> getAll() {
        ArrayList<Tiket> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select id_tiket, "
                + "b.jenis_tiket as jenistiket"
                + "b.penumpang as penumpang, "
                + "b.harga_tiket as hargatiket, "
                + "b.total_harga as totalharga, "
                + "b.pilih_bank as pilihbank, "
                + "b.kode_bank as kodebank, "
                + "b.bayar as bayar, "
                + "from tiket b ");
        try {
            while (rs.next()) {
                Tiket kat = new Tiket();
                kat.setJenisTiket(rs.getString("jenis_tiket"));
                kat.setPenumpang(rs.getString("penumpang"));
                kat.setHargaTiket(rs.getInt("harga_tiket"));
                kat.setTotalHarga(rs.getInt("total_harga"));
                kat.setPilihBank(rs.getString("pilih_bank"));
                kat.setKodeBank(rs.getString("kode_bank"));
                kat.setBayar(rs.getInt("bayar"));
                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Tiket> search(String keyword) {
        ArrayList<Tiket> ListBuku = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("Select b.id_tiket,"
                + "b.jenis_tiket as jenistiket "
                + "b.penumpang as penumpang, "
                + "b.harga_tiket as hargatiket, "
                + "b.total_harga as totalharga, "
                + "b.pilih_bank as pilihbank, "
                + "b.kode_bank as kodebank, "
                + "b.bayar as bayar, "
                + "from tiket b "
                + "where b.jenis_tiket like '%" + keyword + "%'");
        try {
            while (rs.next()) {
                Tiket kat = new Tiket();
                kat.setJenisTiket(rs.getString("jenis_tiket"));
                kat.setPenumpang(rs.getString("penumpang"));
                kat.setHargaTiket(rs.getInt("harga_tiket"));
                kat.setTotalHarga(rs.getInt("total_harga"));
                kat.setPilihBank(rs.getString("pilih_bank"));
                kat.setKodeBank(rs.getString("kode_bank"));
                kat.setBayar(rs.getInt("bayar"));
                ListBuku.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void save() {
        if (getById(idtiket).getIdtiket() == 0) {
            String sql = "Insert into tiket (jenis_tiket, penumpang, harga_tiket, total_harga,"
                    + "jumlah_tiket, pilih_bank, kode_bank, bayar) "
                    + "values ("
                    + "'" + this.jenistiket + "', "
                    + "'" + this.penumpang + "', "
                    + "'" + this.hargatiket + "', "
                    + "'" + this.totalharga + "', "
                    + "'" + this.jumlahtiket + "', "
                    + "'" + this.pilihbank + "', "
                    + "'" + this.kodebank + "', "
                    + "'" + this.bayar + "' "
                    + ")";
            this.idtiket = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "Update tiket set "
                    + "jenistiket = '" + this.jenistiket + "', "
                    + "penumpang = '" + this.penumpang + "', "
                    + "hargatiket = '" + this.hargatiket + "', "
                    + "totalharga = '" + this.totalharga + "', "
                    + "jumlah_tiket = '" + this.jumlahtiket + "', "
                    + "pilih_bank = '" + this.pilihbank + "', "
                    + "kode_bank = '" + this.kodebank + "', "
                    + "bayar = '" + this.bayar + "' "
                    + "where id_tiket = '" + this.idtiket + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "Delete from tiket where id_tiket = '" + this.idtiket + "'";
        DBHelper.executeQuery(sql);
    }
}

