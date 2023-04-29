/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class PengembalianDaoImpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();
    public PengembalianDaoImpl(){
        data.add(new Pengembalian("27/04/2023","29/04/2023"));
    }
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int idx, Pengembalian pengembalian){
        data.set(idx, pengembalian);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Pengembalian getPengembalian(int idx){
        return data.get(idx);
    }
    public List<Pengembalian> getAll(){
        return data;
    }
}
