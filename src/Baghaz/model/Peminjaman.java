/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.model;

/**
 *
 * @author Bagas
 */
public class Peminjaman {
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman() {}

    public Peminjaman(String kodeAnggota, String kodeBuku, String tglPinjam, String tglKembali) {
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }
    
}
