/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.controller;

import Baghaz.dao.*;
import Baghaz.db.DbHelper;
import Baghaz.model.*;
import Baghaz.view.FormPengembalian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bagas
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    private Connection con;
    private FormPengembalian form;
    
    
    public PengembalianController(FormPengembalian form) {
        try {
            this.form = form;
            con = DbHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(con);
            anggotaDao = new AnggotaDaoImpl(con);
            bukuDao = new BukuDaoImpl(con);
            pengembalian = new Pengembalian();
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public void clear(){
//        try {
//            form.getTxtTglPinjam().setText("yyyy-mm-dd");
//            form.getTxtTglKembali().setText("yyyy-mm-dd");
//            
//            List<Anggota> listAnggota = anggotaDao.getAll();
//            form.getCboAnggota().removeAllItems();
//            for(Anggota anggota : listAnggota){
//                form.getCboAnggota().addItem(anggota.getKodeAnggota());
//            }
//            form.getCboAnggota().setSelectedIndex(0);
//            
//            List<Buku> listBuku = bukuDao.getAll();
//            form.getCboBuku().removeAllItems();
//            for(Buku buku : listBuku){
//                form.getCboBuku().addItem(buku.getKodeBuku());
//            }
//            form.getCboBuku().setSelectedIndex(0);
//        } catch (Exception ex) {
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void get(){
//        try {
//            String kodeA = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 0).toString();
//            String kodeB = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 2).toString();
//            String tglPi = form.getTblpengembalian().getValueAt(form.getTblpengembalian().getSelectedRow(), 4).toString();
//            pengembalian = pengembalianDao.getpengembalian(kodeA,kodeB,tglPi);
//            form.getCboAnggota().setSelectedItem(pengembalian.getKodeAnggota());
//            form.getCboBuku().setSelectedItem(pengembalian.getKodeBuku());
//            form.getTxtTglPinjam().setText(pengembalian.getTglPinjam());
//            form.getTxtTglKembali().setText(pengembalian.getTglKembali());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(form, e);
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }
//    
//    public void insert(){
//        try {
//            pengembalian = new pengembalian();
//            pengembalian.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
//            pengembalian.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
//            pengembalian.setTglPinjam(form.getTxtTglPinjam().getText());
//            pengembalian.setTglKembali(form.getTxtTglKembali().getText());
//            pengembalianDao.insert(pengembalian);
//            JOptionPane.showMessageDialog(form, "Insert Ok!");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(form, ex.getMessage());
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void update(){
//        try {
//            pengembalian.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
//            pengembalian.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
//            pengembalian.setTglPinjam(form.getTxtTglPinjam().getText());
//            pengembalian.setTglKembali(form.getTxtTglKembali().getText());
//            pengembalianDao.update(pengembalian);
//            JOptionPane.showMessageDialog(form, "Update Ok!");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(form, ex.getMessage());
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void delete(){
//        try {
//            pengembalianDao.delete(pengembalian);
//            JOptionPane.showMessageDialog(form, "Delete OK!");
//        } catch (Exception ex) {
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public void display(){
//        try {
//            Connection connection = DbHelper.getConnection();
//            DefaultTableModel tableModel = (DefaultTableModel) form.getTblpengembalian().getModel();
//            tableModel.setRowCount(0);
//            String sql = "SELECT kodeAnggota,  namaAnggota, kodeBuku, judulBuku, tglPinjam, tglKembali "
//                + "FROM pengembalian JOIN buku USING(kodeBuku) JOIN anggota USING(kodeAnggota)";
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
//        } catch (Exception ex) {
//            Logger.getLogger(pengembalianController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
