/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz06052023.controller;
import Baghaz06052023.model.*;
import Baghaz06052023.view.FormKaryawan;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bagas
 */
public class KaryawanController {
    private FormKaryawan form;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    
    public KaryawanController(FormKaryawan form){
        this.form = form;
        karyawanDao = new KaryawanDaoImpl();
    }
    public void clear(){
        form.getTxtNama().setText("");
        form.getTxtNip().setText("");
        form.getTxtGolongan().setText("");
        form.getTxtJabatan().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtNikah().setText("");
        form.getTxtAnak().setText("");
    }
    public void get(){
        int index = form.getTblKaryawan().getSelectedRow();
        karyawan = karyawanDao.getKaryawan(index);
        if(karyawan != null){
            form.getTxtNama().setText(karyawan.getNama());
            form.getTxtNip().setText(karyawan.getNip());
            form.getTxtGolongan().setText(karyawan.getGolongan());
            form.getTxtJabatan().setText(karyawan.getJabatan());
            form.getTxtAlamat().setText(karyawan.getAlamat());
            form.getTxtNikah().setText(karyawan.getStatusNikah());
            form.getTxtAnak().setText(""+karyawan.getJumlahAnak());
        }
    }
    public void insert(){
        karyawan = new Karyawan();
        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setNip(form.getTxtNip().getText());
        karyawan.setGolongan(form.getTxtGolongan().getText());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatusNikah(form.getTxtNikah().getText());
        karyawan.setJumlahAnak(Integer.parseInt(form.getTxtAnak().getText()));
        karyawanDao.save(karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Karyawan ditambahkan");
    }
    public void update(){
        int idx = form.getTblKaryawan().getSelectedRow();
        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setNip(form.getTxtNip().getText());
        karyawan.setGolongan(form.getTxtGolongan().getText());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatusNikah(form.getTxtNikah().getText());
        karyawan.setJumlahAnak(Integer.parseInt(form.getTxtAnak().getText()));
        karyawanDao.update(idx,karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Karyawan diupdate");
    }
    
    public void delete(){
        int idx = form.getTblKaryawan().getSelectedRow();
        karyawanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Karyawan dipecat");
    }
    
    public void display(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblKaryawan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Karyawan> list = karyawanDao.getAll();
        for(Karyawan karyawan : list){
            Object[] data = {
                karyawan.getNama(),
                karyawan.getNip(),
                karyawan.getGolongan(),
                karyawan.getJabatan(),
                karyawan.getAlamat(),
                karyawan.getStatusNikah(),
                karyawan.getJumlahAnak()
            };
            tabelModel.addRow(data);
        }
    }
}
