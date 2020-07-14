/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conve;

import java.util.ArrayList;
import java.util.List;
import execute.exepetugas;
import execute.exepasien;
import execute.exetrans;
import entity.petugas;
import entity.pasien;
import entity.transaksi;

/**
 *
 * @author ASUS
 */
public class convert {

public String[][] getpetugas(){
List<petugas> myptgs = new ArrayList<petugas>();
exepetugas ecmp = new exepetugas();
myptgs = ecmp.getPetugas();
String[][] dataptgs = new String[myptgs.size()][4];
int i=0;
for(petugas ptg : myptgs){
dataptgs[i][0] = ptg.getId_petugas();
dataptgs[i][1] = ptg.getNama_petugas();
dataptgs[i][2]= ptg.getAlamat_petugas();
dataptgs[i][3]= ptg.getPasword();
i++;
}
return dataptgs;
}
public String[][] getpasien(){
List<pasien> mypsn = new ArrayList<pasien>();
exepasien ecmp = new exepasien();
mypsn = ecmp.getpasien();
String[][] datapsn = new String[mypsn.size()][6];
int i=0;
for(pasien psn : mypsn){
datapsn[i][0] = ""+psn.getId_pasien();
datapsn[i][1] = psn.getNama_pasien();
datapsn[i][2]= psn.getGejala();
datapsn[i][3]= psn.getTanggal_lahir();
datapsn[i][4]= psn.getJenis_kelamin();
datapsn[i][5]= psn.getAlamat_pasien();
i++;
}
return datapsn;
}
/*public String[][] getdokter(){
List<dokter> mydkr = new ArrayList<dokter>();
exedokter ecmp = new exedokter();
mydkr = ecmp.getdokter();
String[][] datadkr = new String[mydkr.size()][6];
int i=0;
for(dokter dkr : mydkr){
datadkr[i][0] = ""+dkr.getId_dokter();
datadkr[i][1] = dkr.getNama_dokter();
datadkr[i][2]= dkr.getAlamat_dokter();
datadkr[i][3]= dkr.getTanggal_lahir();
datadkr[i][4]= dkr.getNo_telp();
datadkr[i][5]= dkr.getKeterangan();
i++;
}
return datadkr;
}*/
public String[][] gettransaksi(){
List<transaksi> mytrns = new ArrayList<transaksi>();
exetrans ecmp = new exetrans();
mytrns = ecmp.gettransaksi();
String[][] datatrns = new String[mytrns.size()][7];
int i=0;
for(transaksi trns : mytrns){
datatrns[i][0] = ""+trns.getId_transaksi();
datatrns[i][1] = trns.getId_pasien();
datatrns[i][2]= trns.getId_petugas();
datatrns[i][3]= trns.getBpjs();
datatrns[i][4]= trns.getTotal_bayar();
i++;
}
return datatrns;
}
}
