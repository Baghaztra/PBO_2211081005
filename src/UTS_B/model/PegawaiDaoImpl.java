/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Bagas
 */
public class PegawaiDaoImpl implements PegawaiDao{
    List<Pegawai> data = new ArrayList<>();
    public PegawaiDaoImpl(){
        data.add(new Pegawai("001","Asep","Padang"));
        data.add(new Pegawai("002","Ujang","Payakumbuh"));
        data.add(new Pegawai("003","Sukri","Bukittinggi"));
    }
    public void save(Pegawai pegawai){
        data.add(pegawai);
    }
    public void update(int idx, Pegawai pegawai){
        data.set(idx, pegawai);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Pegawai getPegawai(int idx){
        return data.get(idx);
    }
    public List<Pegawai> getAll(){
        return data;
    }
}
