/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Baghaz.dao;

import java.util.List;
import Baghaz.model.Anggota;
/**
 *
 * @author Bagas
 */
public interface AnggotaDao {
    void insert(Anggota anggota) throws Exception;
    void update(String index, Anggota anggota) throws Exception;
    void delete(String index) throws Exception;
//    Anggota getAnggota(int index);
//    List<Anggota> getAll();
}
