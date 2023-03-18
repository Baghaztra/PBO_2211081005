/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz180323;

import javax.swing.JOptionPane;

/**
 *
 * @author Bagas
 */
public class Latihan722 {
    //Module 7, nomor 2, menggunakan JOptionPane
    public static void main(String[] args){
        int nu[] = new int[10];
        int max=0;
        JOptionPane.showMessageDialog(null,"Masukkan 10 angka: ");
        for(int i =0;i<10;i++){
            nu[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+" : "));
            if(nu[i]>max){
                max = nu[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Nilai terbesar: "+max);
    }
}
