/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.controller;

import Baghaz.dao.*;
import Baghaz.db.DbHelper;
import Baghaz.model.*;
import Baghaz.view.FormPeminjaman;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bagas
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private Connection con;
    private FormPeminjaman form;
    
    
    public PeminjamanController(FormPeminjaman form) {
        try {
            this.form = form;
            con = DbHelper.getConnection();
            peminjamanDao = new PeminjamanDaoImpl(con);
            anggotaDao = new AnggotaDaoImpl(con);
            bukuDao = new BukuDaoImpl(con);
            peminjaman = new Peminjaman();
        } catch (SQLException ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clear(){
        try {
            form.getTxtTglPinjam().setText("yyyy-mm-dd");
            form.getTxtTglKembali().setText("yyyy-mm-dd");
            
            List<Anggota> listAnggota = anggotaDao.getAll();
            form.getCboAnggota().removeAllItems();
            for(Anggota anggota : listAnggota){
                form.getCboAnggota().addItem(anggota.getKodeAnggota());
            }
            form.getCboAnggota().setSelectedIndex(0);
            
            List<Buku> listBuku = bukuDao.getAll();
            form.getCboBuku().removeAllItems();
            for(Buku buku : listBuku){
                form.getCboBuku().addItem(buku.getKodeBuku());
            }
            form.getCboBuku().setSelectedIndex(0);
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void get(){
        try {
            String kodeA = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 0).toString();
            String kodeB = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 2).toString();
            String tglPi = form.getTblPeminjaman().getValueAt(form.getTblPeminjaman().getSelectedRow(), 4).toString();
            peminjaman = peminjamanDao.getPeminjaman(kodeA,kodeB,tglPi);
            form.getCboAnggota().setSelectedItem(peminjaman.getKodeAnggota());
            form.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
            form.getTxtTglPinjam().setText(peminjaman.getTglPinjam());
            form.getTxtTglKembali().setText(peminjaman.getTglKembali());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, e);
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insert(){
        try {
            peminjaman = new Peminjaman();
            peminjaman.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
            peminjaman.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
            peminjaman.setTglPinjam(form.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(form.getTxtTglKembali().getText());
            peminjamanDao.insert(peminjaman);
            JOptionPane.showMessageDialog(form, "Insert Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            peminjaman.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
            peminjaman.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
            peminjaman.setTglPinjam(form.getTxtTglPinjam().getText());
            peminjaman.setTglKembali(form.getTxtTglKembali().getText());
            peminjamanDao.update(peminjaman);
            JOptionPane.showMessageDialog(form, "Update Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            peminjamanDao.delete(peminjaman);
            JOptionPane.showMessageDialog(form, "Delete OK!");
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void display(){
        try {
            Connection connection = DbHelper.getConnection();
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPeminjaman().getModel();
            tableModel.setRowCount(0);
            
//            String sql = "SELECT kodeAnggota,  namaAnggota, kodeBuku, judulBuku, tglPinjam, tglKembali "
//                + "FROM peminjaman JOIN buku USING(kodeBuku) JOIN anggota USING(kodeAnggota)";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//
//            while(rs.next()){
//                Object[] data = {
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getString(3),
//                    rs.getString(4),
//                    rs.getString(5),
//                    rs.getString(6)
//                };
//                tableModel.addRow(data);
//            }

            tableModel.setRowCount(0);
            List<Peminjaman> list = peminjamanDao.getAll();
            for(Peminjaman peminjaman : list) {
                Anggota anggota = anggotaDao.getAnggota(peminjaman.getKodeAnggota());
                Buku buku = bukuDao.getBuku(peminjaman.getKodeBuku());
                Object[] data = {
                    anggota.getKodeAnggota(),
                    anggota.getNamaAnggota(),
                    buku.getKodeBuku(),
                    buku.getJudulBuku(),
                    peminjaman.getTglPinjam(),
                    peminjaman.getTglKembali()
                };
                tableModel.addRow(data);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
