/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;

/**
 *
 * @author Bagas
 */
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){}
    public Peminjaman(String nobp,String kodebuku,String tglpinjam,String tglkembali){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    public void setKodebuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    
    public String getNobp(){
        return nobp;
    }
    public String getKodebuku(){
        return kodebuku;
    }
    public String getTglpinjam(){
        return tglpinjam;
    }
    public String getTglkembali(){
        return tglkembali;
    }
    
}
