/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz06052023.model;

/**
 *
 * @author Bagas
 */
public class People {
    protected String nama;
    protected String alamat;
    protected String statusNikah;
    
    public People(){}
    public People(String nama, String alamat, String statusNikah){
        this.nama = nama;
        this.alamat = alamat;
        this.statusNikah = statusNikah;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setStatusNikah(String statusNikah){
        this.statusNikah = statusNikah;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getStatusNikah(){
        return statusNikah;
    }
}
