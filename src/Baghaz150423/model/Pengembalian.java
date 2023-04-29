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
    
    public Pengembalian(String tglKembali,String dikembalikan){
        this.dikembalikan = dikembalikan;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate deadline = LocalDate.parse(tglKembali, formatter);
        LocalDate tanggalKirim = LocalDate.parse(this.dikembalikan, formatter);
        
        //nyari terlambat
        terlambat = 0;
        if (tanggalKirim.isAfter(deadline)) {
            terlambat = tanggalKirim.compareTo(deadline);
        }
        
        //nyari denda
        denda = terlambat*500;
    }
    // nanti saya lanjutkan, pak :v
}
