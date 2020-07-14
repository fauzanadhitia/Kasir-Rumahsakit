
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ASUS
 */
public class transaksi {
    private int id_transaksi;
    private String id_pasien;
    private String id_petugas;
    private String bpjs;
    private String total_bayar;

    public transaksi() {
    }

    public transaksi(int id_transaksi, String id_pasien, String id_petugas, String bpjs, String total_bayar) {
        this.id_transaksi = id_transaksi;
        this.id_pasien = id_pasien;
        this.id_petugas = id_petugas;
        this.bpjs = bpjs;
        this.total_bayar = total_bayar;
    }

    public transaksi(String id_pasien, String id_petugas, String bpjs, String total_bayar) {
        this.id_pasien = id_pasien;
        this.id_petugas = id_petugas;
        this.bpjs = bpjs;
        this.total_bayar = total_bayar;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(String id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getBpjs() {
        return bpjs;
    }

    public void setBpjs(String bpjs) {
        this.bpjs = bpjs;
    }

    public String getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(String total_bayar) {
        this.total_bayar = total_bayar;
    }

    
   

  
}
