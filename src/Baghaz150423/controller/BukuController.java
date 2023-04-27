/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz150423.controller;
import Baghaz150423.model.*;
import Baghaz150423.view.FormBuku;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bagas
 */
public class BukuController {
    private FormBuku form;
    private BukuDao bukuDao;
    private Buku buku;
    public BukuController(FormBuku form){
        this.form = form;
        bukuDao = new BukuDaoImpl();
    }
    public void cls(){
        form.getTxtKode().setText("");
        form.getTxtJudul().setText("");
        form.getTxtPengarang().setText("");
        form.getTxtPenerbit().setText("");
        form.getTxtTahun().setText("");
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKode(form.getTxtKode().getText());
        buku.setJudul(form.getTxtJudul().getText());
        buku.setPengarang(form.getTxtPengarang().getText());
        buku.setPenerbit(form.getTxtPenerbit().getText());
        buku.setTahun(form.getTxtTahun().getText());
        bukuDao.save(buku);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }
    public void getBuku(){
        int index = form.getTabelBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            form.getTxtKode().setText(buku.getKode());
            form.getTxtJudul().setText(buku.getJudul());
            form.getTxtPengarang().setText(buku.getPengarang());
            form.getTxtPenerbit().setText(buku.getPenerbit());
            form.getTxtTahun().setText(buku.getTahun());
        }
    }
    
    public void updateBuku(){
        int idx = form.getTabelBuku().getSelectedRow();
        buku.setKode(form.getTxtKode().getText());
        buku.setJudul(form.getTxtJudul().getText());
        buku.setPengarang(form.getTxtPengarang().getText());
        buku.setPenerbit(form.getTxtPenerbit().getText());
        buku.setTahun(form.getTxtTahun().getText());
        bukuDao.update(idx,buku);
    }
    
    public void deleteBuku(){
        int idx = form.getTabelBuku().getSelectedRow();
        bukuDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTabelBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAll();
        for(Buku buku : list){
            Object[] data = {
                buku.getKode(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getTahun()
            };
            tabelModel.addRow(data);
        }
    }
}
