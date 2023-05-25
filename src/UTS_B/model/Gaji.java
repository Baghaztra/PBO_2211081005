/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;

/**
 *
 * @author Bagas
 */
public class Gaji {
    private Pegawai pegawai;
    private String golongan;
    private String tanggal;
    private double gapok;
    private double tunj_anak;
    private double tunj_istri;
    private double gajiBersih;
    
    public Gaji(){}
    public Gaji(Pegawai pegawai,String golongan, String tanggal){
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
        setGapok(golongan);
        setTunj_anak();
        setTunj_istri();
        setGajiBersih();
    }
    
    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public void setGapok(String golongan) {
        if(golongan.equals("IIIA")){
            gapok = 1000000;
        }
        else if(golongan.equals("IIIB")){
            gapok = 2000000;
        }
        else if(golongan.equals("IIIC")){
            gapok = 3000000;
        }
        else{
            gapok =0;
            System.out.println("Error!!! Golongan tidak valid");
        }
    }
    public void setTunj_anak() {
        this.tunj_anak = 0.05 * gapok;
    }
    public void setTunj_istri() {
        this.tunj_istri = 0.05 * gapok;
    }   
    public void setGajiBersih(){
        this.gajiBersih = gapok + tunj_anak + tunj_istri;
    }
    
    public Pegawai getPegawai() {
        return pegawai;
    }
    public String getGolongan() {
        return golongan;
    }
    public String getTanggal() {
        return tanggal;
    }
    public double getGapok() {
        return gapok;
    }
    public double getTunj_anak() {
        return tunj_anak;
    }
    public double getTunj_istri() {
        return tunj_istri;
    }
    public double getGajiBersih() {
        return gajiBersih;
    }
    
}
