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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private Peminjaman peminjaman;
    private PeminjamanDao peminjamanDao;
    
    
    public PengembalianController(FormPengembalian form) {
        try {
            this.form = form;
            con = DbHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(con);
            anggotaDao = new AnggotaDaoImpl(con);
            bukuDao = new BukuDaoImpl(con);
            pengembalian = new Pengembalian();
            peminjamanDao = new PeminjamanDaoImpl(con);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clear(){
        try {
            //form.getTxtTglPinjam().setText("yyyy-mm-dd");
//            form.getTxtTglDikembalikan().setText("yyyy-mm-dd");
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter mysqlDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String tgl = currentDate.format(mysqlDateFormatter);
            form.getTxtTglDikembalikan().setText(tgl);
            
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
            
            List<Peminjaman> listPinjam = peminjamanDao.getAll();
            form.getCboPeminjaman().removeAllItems();
            for(Peminjaman peminjaman : listPinjam){
                form.getCboPeminjaman().addItem(peminjaman.getTglPinjam());
            }
            form.getCboBuku().setSelectedIndex(0);
            
            form.getCboPilih().removeAllItems();
            form.getCboPilih().addItem("namaAnggota");
            form.getCboPilih().addItem("kodeAnggota");
            form.getCboPilih().addItem("kodeBuku");
            form.getCboPilih().setSelectedIndex(0);
            
            form.getTxtCari().setText("");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void get(){
        try {
            String kodeA = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 0).toString();
            String kodeB = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 2).toString();
            String tglPi = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 3).toString();
            String tglDk = form.getTblPengembalian().getValueAt(form.getTblPengembalian().getSelectedRow(), 5).toString();
            try{
                pengembalian = pengembalianDao.getPengembalian(kodeA,kodeB,tglPi,tglDk);
                form.getCboAnggota().setSelectedItem(pengembalian.getKodeAnggota());
                form.getCboBuku().setSelectedItem(pengembalian.getKodeBuku());
                form.getCboPeminjaman().setSelectedItem(pengembalian.getTglPinjam());
                form.getTxtTglDikembalikan().setText(pengembalian.getTglDikembalikan());
            }catch(Exception e){
                peminjaman = peminjamanDao.getPeminjaman(kodeA, kodeB, tglPi);
                form.getCboAnggota().setSelectedItem(peminjaman.getKodeAnggota());
                form.getCboBuku().setSelectedItem(peminjaman.getKodeBuku());
                form.getCboPeminjaman().setSelectedItem(peminjaman.getTglPinjam());
                form.getTxtTglDikembalikan().setText("yyyy-mm-dd");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(form, "Get row error\n"+e);
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insert(){
        try {
            pengembalian = new Pengembalian();
            pengembalian.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
            pengembalian.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
            pengembalian.setTglPinjam(form.getCboPeminjaman().getSelectedItem().toString());
            pengembalian.setTglDikembalikan(form.getTxtTglDikembalikan().getText());
            peminjaman = peminjamanDao.getPeminjaman(
                    form.getCboAnggota().getSelectedItem().toString(),
                    form.getCboBuku().getSelectedItem().toString(), 
                    form.getCboPeminjaman().getSelectedItem().toString());
            pengembalian.setTerlambat(peminjaman.getTglKembali());
            pengembalian.setDenda();
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(form, "Insert Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, "Insert error \n"+ex.getMessage());
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            pengembalian.setKodeAnggota(form.getCboAnggota().getSelectedItem().toString());
            pengembalian.setKodeBuku(form.getCboBuku().getSelectedItem().toString());
            pengembalian.setTglPinjam(form.getCboPeminjaman().getSelectedItem().toString());
            pengembalian.setTglDikembalikan(form.getTxtTglDikembalikan().getText());
            peminjaman = peminjamanDao.getPeminjaman(
                    form.getCboAnggota().getSelectedItem().toString(),
                    form.getCboBuku().getSelectedItem().toString(), 
                    form.getCboPeminjaman().getSelectedItem().toString());
            pengembalian.setTerlambat(peminjaman.getTglKembali());
            pengembalian.setDenda();
            pengembalianDao.update(pengembalian);
            JOptionPane.showMessageDialog(form, "Update Ok!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(form, ex.getMessage());
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(){
        try {
            pengembalianDao.delete(pengembalian);
            JOptionPane.showMessageDialog(form, "Delete OK!");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void display(){
        try {
            DefaultTableModel tableModel = (DefaultTableModel) form.getTblPengembalian().getModel();
            tableModel.setRowCount(0);
            String kategori = form.getCboPilih().getSelectedItem().toString();
            String cari = form.getTxtCari().getText();
            List<Pengembalian> list = pengembalianDao.getAll(kategori,cari);
            for(Pengembalian pengembalian : list) {
                Anggota anggota = anggotaDao.getAnggota(pengembalian.getKodeAnggota());
                Buku buku = bukuDao.getBuku(pengembalian.getKodeBuku());
                Peminjaman peminjaman = peminjamanDao.getPeminjaman(
                    pengembalian.getKodeAnggota(),
                    pengembalian.getKodeBuku(), 
                    pengembalian.getTglPinjam());
                Object[] data;
                if(pengembalian.getTglDikembalikan().equals("Belum dikembalikan")){
                    data = new Object[]{
                        anggota.getKodeAnggota(),
                        anggota.getNamaAnggota(),
                        buku.getKodeBuku(),
    //                    buku.getJudulBuku(),
                        peminjaman.getTglPinjam(),
                        peminjaman.getTglKembali(),
                        pengembalian.getTglDikembalikan(),
                        "",
                        ""
                    };
                }else{
                    data = new Object[]{
                        anggota.getKodeAnggota(),
                        anggota.getNamaAnggota(),
                        buku.getKodeBuku(),
    //                    buku.getJudulBuku(),
                        peminjaman.getTglPinjam(),
                        peminjaman.getTglKembali(),
                        pengembalian.getTglDikembalikan(),
                        pengembalian.getTerlambat(),
                        pengembalian.getDenda()
                    };
                }
                tableModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
