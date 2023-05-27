/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.model;

/**
 *
 * @author Bagas
 */
public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;

    //constuctor
    public Anggota() {}
    public Anggota(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin) {
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    //mutator
    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }
    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    //accessor
    public String getKodeAnggota() {
        return kodeAnggota;
    }
    public String getNamaAnggota() {
        return namaAnggota;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }    
}
