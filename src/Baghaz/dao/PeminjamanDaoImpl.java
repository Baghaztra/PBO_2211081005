/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Peminjaman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
    private Connection connection;
    
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Peminjaman peminjaman) throws Exception{
        String sql = "INSERT INTO peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Peminjaman peminjaman) throws Exception {
        String sql = "UPDATE peminjaman SET TglKembali = ? "
                + "WHERE kodeBuku = ? && kodeAnggota = ? && tglPinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(3, peminjaman.getKodeAnggota());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(4, peminjaman.getTglPinjam());
        ps.setString(1, peminjaman.getTglKembali());
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Peminjaman peminjaman) throws Exception{
        String sql = "DELETE FROM peminjaman WHERE kodeBuku = ? && kodeAnggota = ? && tglPinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeBuku());
        ps.setString(2, peminjaman.getKodeAnggota());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.executeUpdate();
        ps.close();
    }
    
    public Peminjaman getPeminjaman(String kodeAnggota,String kodeBuku, String tglPinjam) throws Exception{
        String sql = "SELECT * FROM peminjaman WHERE kodeBuku = ? && kodeAnggota = ? && tglPinjam = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ps.setString(2, kodeAnggota);
        ps.setString(3, tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws Exception{
        String sql = "SELECT * FROM peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman;
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
