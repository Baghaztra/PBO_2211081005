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
public class GajiDaoImpl implements GajiDao{
    List<Gaji> data = new ArrayList<>();
    KaryawanDao karyawanDao;
    public GajiDaoImpl(){
        karyawanDao = new KaryawanDaoImpl();
        data.add(new Gaji(karyawanDao.getKaryawan(0),5,2023));
        data.add(new Gaji(karyawanDao.getKaryawan(0),4,2023));
        data.add(new Gaji(karyawanDao.getKaryawan(0),3,2023));
        data.add(new Gaji(karyawanDao.getKaryawan(1),5,2023));
        data.add(new Gaji(karyawanDao.getKaryawan(1),4,2023));
        data.add(new Gaji(karyawanDao.getKaryawan(1),3,2023));
    }
    public void save(Gaji gaji){
        data.add(gaji);
    }
    public void update(int index, Gaji gaji){
        data.set(index, gaji);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Gaji getGaji(int index){
        return data.get(index);
    }
    public List<Gaji> getAll(){
        return data;
    }
}
