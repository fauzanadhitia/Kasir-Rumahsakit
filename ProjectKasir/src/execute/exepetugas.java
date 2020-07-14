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
 import entity.petugas;

public class exepetugas {
  public List<petugas> getPetugas(){
    List<petugas> listpetugas = new ArrayList<>();
    String query = "select * from petugas";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
 try {
    Statement stm = conn.createStatement();
    ResultSet rs = stm.executeQuery(query);
 while(rs.next()){
    petugas org = new petugas();
        org.setId_petugas(rs.getString("id_petugas"));
        org.setNama_petugas(rs.getString("nama_petugas"));
        org.setAlamat_petugas(rs.getString("alamat_petugas"));
        org.setPasword(rs.getString("password"));
        
        listpetugas.add(org);
    }
 } catch (SQLException ex) {
        Logger.getLogger(exepetugas.class.getName()).log(Level.SEVERE, null, ex);
    }
 kns.logOff();
 
 return listpetugas;
 }  
 public int insertpetugas(petugas ptgs){
    int hasil = 0;
    String query = "Insert into petugas(id_petugas,nama_petugas,alamat_petugas,password)"
    + "value('"+ ptgs.getId_petugas()+"','"+ ptgs.getNama_petugas()+"','"+ptgs.getAlamat_petugas()+"','"+ptgs.getPasword()+"')";
    
    String query2="Insert into login(username,password,type)"
    + "value('"+ ptgs.getId_petugas()+"','"+ ptgs.getPasword()+"','petugas')";
    
        koneksi kns = new koneksi();
        Connection conn = kns.logOn();
        
 try {  
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    hasil = stm.executeUpdate(query2);
    
 } catch (SQLException ex) {
    Logger.getLogger(exepetugas.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();

 return hasil;
 }
 public int deletepetugas(String delptgs){
    int hasil = 0;
    String query = "delete from petugas where id_petugas='"+ delptgs+"'";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
    
 try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(exepetugas.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();
 
 return hasil;
 }
 public int updatepetugas(petugas newptgs){
    int hasil = 0;
    String query = "update petugas set nama_petugas= '"+newptgs.getNama_petugas()+
    "',alamat_petugas= '"+newptgs.getAlamat_petugas()+"',password= '"+newptgs.getPasword()+"' where id_petugas = '"+
    newptgs.getId_petugas()+ "'";
    koneksi kns = new koneksi();
    Connection conn = kns.logOn();
 try {
    Statement stm = conn.createStatement();
    hasil = stm.executeUpdate(query);
    
 } catch (SQLException ex) {
    Logger.getLogger(petugas.class.getName()).log(Level.SEVERE, null, ex);
 }
 kns.logOff();
 return hasil;
    }
}
