/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Bagas
 */
public class PeminjamanDaoImpl{
    List<Peminjaman> data = new ArrayList<>();
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImp1();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27/04/2023","02/05/2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(1),"15/04/2023","01/05/2023"));
    }
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int idx, Peminjaman peminjaman){
        data.set(idx, peminjaman);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Peminjaman getPeminjaman(int idx){
        return data.get(idx);
    }
    public List<Peminjaman> getAll(){
        return data;
    } 
}