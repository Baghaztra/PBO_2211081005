/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class GajiDaoImpl implements GajiDao{
    List<Gaji> data = new ArrayList<>();
    public GajiDaoImpl(){
        PegawaiDao peg = new PegawaiDaoImpl();
        data.add(new Gaji(peg.getPegawai(0),"IIIA","25/05/2022"));
        data.add(new Gaji(peg.getPegawai(1),"IIIC","25/05/2022"));
        data.add(new Gaji(peg.getPegawai(2),"IIIB","25/05/2022"));
    }
    public void save(Gaji gaji){
        data.add(gaji);
    }
    public void update(int idx, Gaji gaji){
        data.set(idx, gaji);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Gaji getGaji(int idx){
        return data.get(idx);
    }
    public List<Gaji> getAll(){
        return data;
    }
}
