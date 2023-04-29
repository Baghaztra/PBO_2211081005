/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Bagas
 */
public class Pengembalian {
    private String dikembalikan;
    private int terlambat;
    private double denda;
    
    public Pengembalian(){}
    
    public Pengembalian(String tglKembali,String dikembalikan){
        this.dikembalikan = dikembalikan;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(tglKembali, formatter);
        LocalDate tanggalKmbl = LocalDate.parse(this.dikembalikan, formatter);
        
        //nyari terlambat
        terlambat = 0;
        if (tanggalKmbl.isAfter(deadline)) {
            terlambat = tanggalKmbl.compareTo(deadline);
        }
        
        //nyari denda
        denda = (double)terlambat*500;
    }
    
    public String getDikembalikan(){
        return dikembalikan;
    }
    public int getTerlambat(){
        return terlambat;
    }
    public double getDenda(){
        return denda;
    }
    public void setDikembalikan(String dikembalikan){
        this.dikembalikan=dikembalikan;
    }
    public void setTerlambat(String tglKembali){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(tglKembali, formatter);
        LocalDate tanggalKmbl = LocalDate.parse(this.dikembalikan, formatter);
        
        terlambat = 0;
        if (tanggalKmbl.isAfter(deadline)) {
            terlambat = tanggalKmbl.compareTo(deadline);
        }
    }
    public void setDenda(){
        denda = (double)terlambat*500;
    }
}
