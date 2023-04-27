/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;

/**
 *
 * @author Bagas
 */
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;
    
    public Buku(){}
    
    public Buku(String kd, String jdl, String peng, String pen, String th){
        this.kodebuku = kd;
        this.judulbuku = jdl;
        this.pengarang = peng;
        this.penerbit = pen;
        this.tahunterbit = th;
    }
    
    public void setKode(String kd){
        this.kodebuku = kd;
    }
    public String getKode(){
        return kodebuku;
    }
    public void setJudul(String jd){
        this.judulbuku = jd;
    }
    public String getJudul(){
        return judulbuku;
    }
    public void setPengarang(String pg){
        this.pengarang = pg;
    }
    public String getPengarang(){
        return pengarang;
    }
    public void setPenerbit(String pn){
        this.penerbit = pn;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public void setTahun(String th){
        this.tahunterbit = th;
    }
    public String getTahun(){
        return tahunterbit;
    }
}
