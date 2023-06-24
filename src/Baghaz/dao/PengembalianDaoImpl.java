/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.dao;

import Baghaz.model.Pengembalian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bagas
 */
public class PengembalianDaoImpl implements PengembalianDao{
    private Connection connection;
    
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;
    }
    
    public void insert(Pengembalian pengembalian) throws Exception{
        String sql = "INSERT INTO pengembalian values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeAnggota());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.setString(4, pengembalian.getTglDikembalikan());
        ps.setString(5,""+ pengembalian.getTerlambat());
        ps.setString(6,""+ pengembalian.getDenda());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Pengembalian pengembalian) throws Exception {
        String sql = "UPDATE pengembalian SET terlambat = ?, denda = ?"
                + "WHERE kodeAnggota = ? && kodeBuku = ? && tglPinjam = ? && tglDikembalikan";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, ""+pengembalian.getTerlambat());
        ps.setString(2, ""+pengembalian.getDenda());
        ps.setString(3, pengembalian.getKodeAnggota());
        ps.setString(4, pengembalian.getKodeBuku());
        ps.setString(5, pengembalian.getTglPinjam());
        ps.setString(6, pengembalian.getTglDikembalikan());
        ps.executeUpdate();
        ps.close();
    }
    
    public void delete(Pengembalian pengembalian) throws Exception{
        String sql = "DELETE FROM pengembalian WHERE kodeAnggota = ? && kodeBuku = ? "
                + "&& tglPinjam = ? && tglDikembalikan";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeAnggota());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.setString(4, pengembalian.getTglDikembalikan());
        ps.executeUpdate();
        ps.close();
    }
    
    public Pengembalian getPengembalian(String kodeAnggota,String kodeBuku, String tglPinjam, String tglDikembalikan) throws Exception{
        String sql = "SELECT * FROM pengembalian WHERE kodeAnggota = ? && kodeBuku = ? && tglPinjam = ? && tglDikembalikan";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeAnggota);
        ps.setString(2, kodeBuku);
        ps.setString(3, tglPinjam);
        ps.setString(4, tglDikembalikan);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
            pengembalian.setTglDikembalikan(rs.getString(4));
        }
        return pengembalian;
    }
    
    public List<Pengembalian> getAll() throws Exception{
        String sql = "SELECT * FROM pengembalian";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian;
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
            pengembalian.setTglDikembalikan(rs.getString(4));
            list.add(pengembalian);
        }
        return list;
    }
}
