/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz06052023.controller;
import Baghaz06052023.model.*;
import Baghaz06052023.view.FormGaji;
import javax.swing.table.DefaultTableModel;
import java.util.List;
/**
 *
 * @author Bagas
 */
public class GajiController {
    private FormGaji form;
    private GajiDao gajiDao;
    private Gaji gaji;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    
    public GajiController(FormGaji form){
        this.form = form;
        gajiDao = new GajiDaoImpl();
        karyawanDao = new KaryawanDaoImpl();
    }
    public void clear(){
        form.getTxtBulan().setText("");
        form.getTxtTahun().setText("");
    }
    public void generateCombo(){
        List<Karyawan> listKaryawan = karyawanDao.getAll();
        form.getCboKaryawan().removeAllItems();
        for(Karyawan karyawan : listKaryawan){
            form.getCboKaryawan().addItem(karyawan.getNip());
        }
    }
    public void get(){
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(gaji != null){
            form.getCboKaryawan().setSelectedItem(gaji.getKaryawan().getNip());
            form.getTxtBulan().setText(""+gaji.getBulan());
            form.getTxtTahun().setText(""+gaji.getTahun());
        }
    }
    public void insert(){
        try{
            gaji = new Gaji();
            gaji.setBulan(Integer.parseInt(form.getTxtBulan().getText()));
            gaji.setTahun(Integer.parseInt(form.getTxtTahun().getText()));
            gaji.setKaryawan(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setGajiPokok(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTunjanganAnak(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTunjanganIstri(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTotalGaji();
            gajiDao.save(gaji);
            javax.swing.JOptionPane.showMessageDialog(form, "gaji ditambahkan");
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(form, "Tidak valid");
        }
    }
    public void update(){
        try{
            int idx = form.getTblGaji().getSelectedRow();
            gaji.setBulan(Integer.parseInt(form.getTxtBulan().getText()));
            gaji.setTahun(Integer.parseInt(form.getTxtTahun().getText()));
            gaji.setGajiPokok(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTunjanganAnak(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTunjanganIstri(karyawanDao.getKaryawan(form.getCboKaryawan().getSelectedIndex()));
            gaji.setTotalGaji();
            gajiDao.update(idx,gaji);
            javax.swing.JOptionPane.showMessageDialog(form, "gaji diupdate");
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(form, "Tidak valid");
        }
    }
    
    public void delete(){
        int idx = form.getTblGaji().getSelectedRow();
        gajiDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "gaji dipecat");
    }
    
    public void display(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Gaji> list = gajiDao.getAll();
        for(Gaji gaji : list){
            Object[] data = {
                gaji.getBulan(),
                gaji.getTahun(),
                gaji.getKaryawan().getNip(),
                gaji.getGajiPokok(),
                gaji.getTunjanganAnak(),
                gaji.getTunjanganIstri(),
                gaji.getTotalGaji()
            };
            tabelModel.addRow(data);
        }
    }
}
