/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz.controller;

import Baghaz.dao.AnggotaDao;
import Baghaz.dao.AnggotaDaoImpl;
import Baghaz.db.DbHelper;
import Baghaz.model.Anggota;
import Baghaz.view.FormAnggota;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Bagas
 */
public class AnggotaController {
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    private Connection con;
    private FormAnggota form;
    private String nip;
    
    
    public AnggotaController(FormAnggota form) throws Exception{
        this.form = form;
        con = DbHelper.getConnection();
        anggotaDao = new AnggotaDaoImpl(con);
        anggota = new Anggota();
    }
    
    public void clear(){
        form.getTxtNama().setText("");
        form.getTxtKodeAnggota().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtNotif().setText("");
        form.getCboKelamin().removeAllItems();
        form.getCboKelamin().addItem("Jenis kelamin");
        form.getCboKelamin().addItem("L");
        form.getCboKelamin().addItem("P");
        form.getCboKelamin().setSelectedIndex(0);
    }
    
    public void get(){
        this.nip = form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 0).toString();
        form.getTxtKodeAnggota().setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 0).toString());
        form.getTxtNama().setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 1).toString());
        form.getTxtAlamat().setText(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 2).toString());
        form.getCboKelamin().setSelectedItem(form.getTblAnggota().getValueAt(form.getTblAnggota().getSelectedRow(), 3).toString());
    }
    
    public void insert() throws Exception{
        anggota.setNamaAnggota(form.getTxtNama().getText());
        anggota.setKodeAnggota(form.getTxtKodeAnggota().getText());
        anggota.setAlamat(form.getTxtAlamat().getText());
        anggota.setJenisKelamin(form.getCboKelamin().getSelectedItem().toString());
        anggotaDao.insert(anggota);
    }
    
    public void update() throws Exception{
        anggota.setKodeAnggota(form.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(form.getTxtNama().getText());
        anggota.setAlamat(form.getTxtAlamat().getText());
        anggota.setJenisKelamin(form.getCboKelamin().getSelectedItem().toString());
        anggotaDao.update(nip,anggota);
    }
    
    public void delete() throws Exception{
        anggotaDao.delete(nip);
    }
    
    public void display() throws Exception{
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from anggota");
            
        DefaultTableModel tableModel = (DefaultTableModel) form.getTblAnggota().getModel();
        tableModel.setRowCount(0);
        while (resultSet.next()) {
            Object[] data = {
                    resultSet.getString("kodeanggota"),
                    resultSet.getString("namaanggota"),
                    resultSet.getString("alamat"),
                    resultSet.getString("jeniskelamin")
            };
            tableModel.addRow(data);
        }
    }
}
