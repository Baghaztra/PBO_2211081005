/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz06052023.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class KaryawanDaoImpl implements KaryawanDao{
    List<Karyawan> data = new ArrayList<>();
    public KaryawanDaoImpl(){
        data.add(new Karyawan("Sudin","Padang","y","001","1","Emp",2));
        data.add(new Karyawan("SamSudin","Padang","t","002","2","OB",1));
    }
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    public void update(int index, Karyawan karyawan){
        data.set(index, karyawan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Karyawan getKaryawan(int index){
        return data.get(index);
    }
    public List<Karyawan> getAll(){
        return data;
    }
}
