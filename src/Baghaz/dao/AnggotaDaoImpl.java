/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Anggota;
import java.sql.*;
/**
 *
 * @author Bagas
 */
public class AnggotaDaoImpl implements AnggotaDao{
    private Connection connection;
    
    public AnggotaDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Anggota anggota) throws Exception{
        String sql = "INSERT INTO anggota values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(String kode, Anggota anggota) throws Exception {
        String sql = "UPDATE anggota SET kodeanggota = ?, namaanggota = ?, alamat = ?, jeniskelamin = ? WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.setString(5, kode);
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(String kode) throws Exception{
        String sql = "DELETE FROM anggota WHERE kodeanggota = "+kode;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
    }
}
