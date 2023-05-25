/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B.controller;
import UTS_B.view.FormGaji;
import UTS_B.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author Bagas
 */
public class GajiController {
    private Gaji gaji;
    private GajiDao gajiDao;
    private PegawaiDao pegawaiDao;
    private FormGaji form;
    
    public GajiController(FormGaji form){
        this.form = form;
        gajiDao = new GajiDaoImpl();
        pegawaiDao = new PegawaiDaoImpl();
    }
    public void bersihForm(){
        //combo pegawai
        List<Pegawai> listPegawai = pegawaiDao.getAll();
        form.getCboPegawai().removeAllItems();
        for(Pegawai pegawai : listPegawai){
            form.getCboPegawai().addItem(pegawai.getNama());
        }
        //combo golongan
        form.getCboGolongan().removeAllItems();
        form.getCboGolongan().addItem("IIIA");
        form.getCboGolongan().addItem("IIIB");
        form.getCboGolongan().addItem("IIIC");
        //txt tanggal
        form.getTxtTanggal().setText("");
    }
    
    public void getGaji(){
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(gaji != null){
            form.getCboPegawai().setSelectedItem(gaji.getPegawai().getNama());
            form.getCboGolongan().setSelectedItem(gaji.getGolongan());
            form.getTxtTanggal().setText(gaji.getTanggal());
        }
    }
    
    public void saveGaji(){
        gaji = new Gaji();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboPegawai().getSelectedIndex()));
        gaji.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        gaji.setTanggal(form.getTxtTanggal().getText());
        gaji.setGapok(gaji.getGolongan());
        gaji.setTunj_anak();
        gaji.setTunj_istri();
        gaji.setGajiBersih();
        gajiDao.save(gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Gaji ditambahkan");
    }
    
    public void updateGaji(){
        int idx = form.getTblGaji().getSelectedRow();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboPegawai().getSelectedIndex()));
        gaji.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        gaji.setTanggal(form.getTxtTanggal().getText());
        gaji.setGapok(gaji.getGolongan());
        gaji.setTunj_anak();
        gaji.setTunj_istri();
        gaji.setGajiBersih();
        gajiDao.update(idx,gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Gaji diubah");
    }
    
    public void deletegaji(){
        int idx = form.getTblGaji().getSelectedRow();
        gajiDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Gaji dihapus");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Gaji> list = gajiDao.getAll();
        for(Gaji gaji : list){
            Object[] data = {
                gaji.getPegawai().getNip(),
                gaji.getGolongan(),
                gaji.getTanggal(),
                gaji.getGapok(),
                gaji.getTunj_anak(),
                gaji.getTunj_istri(),
                gaji.getGajiBersih()
            };
            tabelModel.addRow(data);
        }
    }
}
