/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;

/**
 *
 * @author Bagas
 */
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;
    
    public Anggota(){}
    
    public Anggota(String nobp, String nama, String almat){
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = almat;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNobp(){
        return nobp;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    
}
