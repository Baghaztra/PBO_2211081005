/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Buku;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class BukuDaoImpl implements BukuDao{
    private Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Buku Buku) throws Exception{
        String sql = "INSERT INTO buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, Buku.getKodeBuku());
        ps.setString(2, Buku.getJudulBuku());
        ps.setString(3, Buku.getPengarang());
        ps.setString(4, Buku.getPenerbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Buku buku) throws Exception {
        String sql = "UPDATE Buku SET judulBuku = ?, pengarang = ?,"
                + " penerbit = ? WHERE kodeBuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(4, buku.getKodeBuku());
        ps.setString(1, buku.getJudulBuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Buku buku) throws Exception{
        String sql = "DELETE FROM Buku WHERE kodeBuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.executeUpdate();
        ps.close();
    }
    
    public Buku getBuku(String kode) throws Exception{
        String sql = "SELECT * FROM Buku WHERE kodeBuku = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Buku Buku = null;
        if(rs.next()){
            Buku = new Buku();
            Buku.setKodeBuku(rs.getString(1));
            Buku.setJudulBuku(rs.getString(2));
            Buku.setPengarang(rs.getString(3));
            Buku.setPenerbit(rs.getString(4));
        }
        return Buku;
    }
    
    public List<Buku> getAll() throws Exception{
        String sql = "SELECT * FROM Buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku Buku;
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            Buku = new Buku();
            Buku.setKodeBuku(rs.getString(1));
            Buku.setJudulBuku(rs.getString(2));
            Buku.setPengarang(rs.getString(3));
            Buku.setPenerbit(rs.getString(4));
            list.add(Buku);
        }
        return list;
    }
}
