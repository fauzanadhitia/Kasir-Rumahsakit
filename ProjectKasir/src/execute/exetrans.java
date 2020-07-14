/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execute;

import entity.transaksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.koneksi;

/**
 *
 * @author ASUS
 */
public class exetrans {
    public List<transaksi> gettransaksi(){
    List<transaksi> listtransaksi = new ArrayList<>();
    String query = "select * from transaksi";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
 try {
    Statement stm = conn.createStatement();
    ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
    transaksi org = new transaksi();
        org.setId_transaksi(rs.getInt("id_transaksi"));
        org.setId_pasien(rs.getString("id_pasien"));
        org.setId_petugas(rs.getString("id_petugas"));
        org.setBpjs(rs.getString("bpjs"));
        org.setTotal_bayar(rs.getString("total_bayar"));
        
        listtransaksi.add(org);
    }
 } catch (SQLException ex) {
        Logger.getLogger(exetrans.class.getName()).log(Level.SEVERE, null, ex);
    }
 kns.logOff();
 
 return listtransaksi;
 }
    public int inserttransaksi(transaksi trns){
    int hasil = 0;
    String query = "Insert into transaksi(id_transaksi,id_pasien,id_petugas,bpjs,total_bayar)"
    + "value("+ trns.getId_transaksi()+",'"+ trns.getId_pasien()+"','"+trns.getId_petugas()+"','"
    +trns.getBpjs()+"','"+trns.getTotal_bayar()+"')";
    
        koneksi kns = new koneksi();
        Connection conn = kns.logOn();
        
 try {  
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(exetrans.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();

 return hasil;
 }
    public int deletetransaksi(String deltrns){
    int hasil = 0;
    String query = "delete from transaksi where id_transaksi='"+ deltrns+"'";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
    
 try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(exetrans.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();
 
 return hasil;
 }
}
