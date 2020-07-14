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
public class petugas {
    public String id_petugas;
    public String nama_petugas;
    public String alamat_petugas;
    public String pasword;

    public petugas() {
    }

    public petugas(String id_petugas, String nama_petugas, String alamat_petugas, String pasword) {
        this.id_petugas = id_petugas;
        this.nama_petugas = nama_petugas;
        this.alamat_petugas = alamat_petugas;
        this.pasword = pasword;
    }

    public petugas(String nama_petugas, String alamat_petugas, String pasword) {
        this.nama_petugas = nama_petugas;
        this.alamat_petugas = alamat_petugas;
        this.pasword = pasword;
    }

    public String getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(String id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getAlamat_petugas() {
        return alamat_petugas;
    }

    public void setAlamat_petugas(String alamat_petugas) {
        this.alamat_petugas = alamat_petugas;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "petugas{" + "id_petugas=" + id_petugas + ", nama_petugas=" + nama_petugas + ", alamat_petugas=" + alamat_petugas + ", pasword=" + pasword + '}';
    }

   
    

   
    
}
