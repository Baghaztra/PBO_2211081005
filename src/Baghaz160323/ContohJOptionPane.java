/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz160323;

import javax.swing.JOptionPane;

/**
 *
 * @author Bagas
 */
public class ContohJOptionPane {
    public static void main(String[] args){
        String nama = JOptionPane.showInputDialog("Enter your name: ");
        String msg = "Hello "+nama+"!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
