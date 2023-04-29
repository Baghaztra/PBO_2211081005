/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.controller;
import Baghaz150423.view.FormPeminjaman;
import Baghaz150423.model.*;
//import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bagas
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private FormPeminjaman form;
    
    public PengembalianController(FormPeminjaman form){
        this.form = form;
        pengembalianDao = new PengembalianDaoImpl();
    }
    public void cls(){
        form.getTxtDikembalikan().setText("");
    }
    public void savePengembalian(){
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
    }
    public void getPengembalian(){
        int index = form.getTblPeminjaman().getSelectedRow();
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            form.getTxtDikembalikan().setText(pengembalian.getDikembalikan());
        }
    }
    
    public void updatePengembalian(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void deletePengembalian(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalianDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    /*
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pengembalian> list = pengembalianDao.getAll();
        for(Pengembalian peminjaman : list){
            Object[] data = {
                peminjaman.getDikembalikan(),
                peminjaman.getTerlambat(),
                peminjaman.getDenda()
            };
            tabelModel.addRow(data);
        }
    }
    */
}
