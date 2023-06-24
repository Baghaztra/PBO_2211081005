/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Peminjaman;
import java.util.List;
/**
 *
 * @author Bagas
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws Exception;
    void update(Peminjaman peminjaman) throws Exception;
    void delete(Peminjaman peminjaman) throws Exception;
    Peminjaman getPeminjaman(String kodeAnggota,String kodeBuku, String tglPinjam) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
