/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz06052023.model;

/**
 *
 * @author Bagas
 */
public class Karyawan extends People{
    private String nip;
    private String golongan;
    private String jabatan;
    private int jumlahAnak;
    
    public Karyawan(){}
    public Karyawan(String nama, String alamat, String statusNikah,String nip, String golongan, String jabatan, int anak){
        super(nama,alamat,statusNikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahAnak = anak;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setGolongan(String gol){
        this.golongan = gol;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public void setJumlahAnak(int anak){
        this.jumlahAnak = anak;
    }
    public String getNip(){
        return nip;
    }
    public String getGolongan(){
        return golongan;
    }
    public String getJabatan(){
        return jabatan;
    }
    public int getJumlahAnak(){
        return jumlahAnak;
    }
}
