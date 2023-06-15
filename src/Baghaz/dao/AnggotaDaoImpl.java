/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Anggota;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "UPDATE anggota SET kodeanggota = ?, namaanggota = ?, alamat = ?,"
                + " jeniskelamin = ? WHERE kodeanggota =?";
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
    
    public Anggota getAnggota(String kode) throws Exception{
        String sql = "SELECT * FROM anggota WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKodeAnggota(rs.getString(1));
            anggota.setNamaAnggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
        }
        return anggota;
    }
    
    public List<Anggota> getAll() throws Exception{
        String sql = "SELECT * FROM anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Anggota anggota;
        List<Anggota> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota();
            anggota.setKodeAnggota(rs.getString(1));
            anggota.setNamaAnggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}
