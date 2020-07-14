/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execute;

/**
 *
 * @author ASUS
 */
 import java.sql.Connection;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import koneksi.koneksi;
 import entity.pasien;

public class exepasien {
    public List<pasien> getpasien(){
    List<pasien> listpasien = new ArrayList<>();
    String query = "select * from pasien";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
 try {
    Statement stm = conn.createStatement();
    ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
    pasien org = new pasien();
        org.setId_pasien(rs.getString("id_pasien"));
        org.setNama_pasien(rs.getString("nama_pasien"));
        org.setGejala(rs.getString("gejala"));
        org.setTanggal_lahir(rs.getString("tanggal_lahir"));
        org.setAlamat_pasien(rs.getString("alamat_pasien"));
        org.setJenis_kelamin(rs.getString("jenis_kelamin"));
        
        listpasien.add(org);
    }
 } catch (SQLException ex) {
        Logger.getLogger(exepasien.class.getName()).log(Level.SEVERE, null, ex);
    }
 kns.logOff();
 
 return listpasien;
 }
 public int insertpasien(pasien psn){
    int hasil = 0;
    String query = "Insert into pasien(id_pasien,nama_pasien,gejala,tanggal_lahir,jenis_kelamin,alamat_pasien)"
    + "value('"+ psn.getId_pasien()+"','"+ psn.getNama_pasien()+"','"+psn.getGejala()+"','"+psn.getTanggal_lahir()
    +"','"+psn.getJenis_kelamin()+"','"+psn.getAlamat_pasien()+"')";
    
        koneksi kns = new koneksi();
        Connection conn = kns.logOn();
        
 try {  
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(exepasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();

 return hasil;
 }
    public int deletepasien(String delpsn){
    int hasil = 0;
    String query = "delete from pasien where id_pasien='"+ delpsn+"'";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
    
 try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(exepasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();
 
 return hasil;
 }
    public int updatepasien(pasien newpsn){
    int hasil = 0;
    String query = "update pasien set nama_pasien= '"+newpsn.getNama_pasien()+"',gejala= '"+newpsn.getGejala()+
    "',tanggal_lahir= '"+newpsn.getTanggal_lahir()+"',alamat_pasien= '"+newpsn.getAlamat_pasien()+"',jenis_kelamin= '"+newpsn.getJenis_kelamin()+
    "' where id_pasien = "+newpsn.getId_pasien()+ "";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
 try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(pasien.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();
 return hasil;
    }
}
