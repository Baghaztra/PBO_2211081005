/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_B.model;
import java.util.List;
/**
 *
 * @author Bagas
 */
public interface PegawaiDao {
    void save(Pegawai pegawai);
    void update(int idx, Pegawai pegawai);
    void delete(int idx);
    Pegawai getPegawai(int idx);
    List<Pegawai> getAll();
}
