/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz010423;

/**
 *
 * @author Bagas
 */

import java.util.Scanner;
public class BukuAlamatApp {
    public static void main(String[] args){
        BukuAlamat[] data = new BukuAlamat[100];
        BukuAlamat tmp = new BukuAlamat(); //untuk template 
        Scanner in = new Scanner(System.in);
        
        int menu;
        int i=0;
        do{
            tmp = new BukuAlamat();//agar objek untuk template menjadi objek baru
            System.out.println("\n\n===================================");
            System.out.println("Pilih menu yang anda ingin lakukan: ");
            System.out.println("1. Masukkan data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampilkan data");
            System.out.println("4. Update data");
            System.out.println("0. Exit");
            menu = in.nextInt();
            System.out.println();
            switch (menu){
                case 1: //insert
                    System.out.println("Data ke-"+i);
                    System.out.print("Masukkan nama      : ");
                    in.nextLine();
                    tmp.setNama(in.nextLine());
                    System.out.print("Masukkan alamat    : ");
                    tmp.setAlamat(in.nextLine());
                    System.out.print("Masukkan no.telpon : ");
                    tmp.setTelpon(in.nextLine());
                    System.out.print("Masukkan email     : ");
                    tmp.setEmail(in.nextLine());
                    data[i] = tmp;
                    i++;
                    break;
                case 2: //delete
                    tmp.setNama("");
                    tmp.setAlamat("");
                    tmp.setTelpon("");
                    tmp.setEmail("");
                    data[i] = tmp;
                    System.out.println("Data ke-"+(i--)+" telah dihapus");
                    break;
                case 3: //display
                    for(int j = 0;j<i;j++){
                        System.out.println("Data ke-"+j);
                        System.out.println("Nama     : "+data[j].getNama());
                        System.out.println("Alamat   : "+data[j].getAlamat());
                        System.out.println("No.Telpon: "+data[j].getTelpon());
                        System.out.println("Email    : "+data[j].getEmail());
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4: //update
                    System.out.print("Masukkan index data yang idingin diupdate: ");
                    int idx = in.nextInt();
                    System.out.print("Masukkan nama      : ");
                    in.nextLine();
                    tmp.setNama(in.nextLine());
                    System.out.print("Masukkan alamat    : ");
                    tmp.setAlamat(in.nextLine());
                    System.out.print("Masukkan no.telpon : ");
                    tmp.setTelpon(in.nextLine());
                    System.out.print("Masukkan email     : ");
                    tmp.setEmail(in.nextLine());
                    data[i] = tmp;
                    data[idx] = tmp;
                    break;
                default:
                    //tidak terjadi apa-apa
                    break;
            }
        }while(menu != 0);
    }
}
