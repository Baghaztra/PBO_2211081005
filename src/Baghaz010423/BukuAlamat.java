/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz010423;

/**
 *
 * @author Bagas
 */
//Modul 10, membuat class yang menyipan data
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String telp;
    private String email;
    private static int count;

    //constructor
    public BukuAlamat(){
        count++;
    }
    
    //mutator method
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setTelpon(String telp){
        this.telp = telp;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    //accessor method
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTelpon(){
        return telp;
    }
    public String getEmail(){
        return email;
    }
}