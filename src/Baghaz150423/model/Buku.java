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
    private int tahunterbit;
    
    public Buku(){}
    
    public Buku(String kd, String jdl, String peng, String pen, int th){
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
}
