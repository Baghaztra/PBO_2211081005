/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz300323;

/**
 *
 * @author Bagas
 */
public class Aritmatika {
    public int tambah(int a, int b){
        return a+b;
    }
    public boolean cekganjil(int a){
        return(a%2!=0);
    }
    public int[] nGanjilPertama(int n){
        int list[] = new int[n];
        int i = 0,j = 1;
        while(i<n){
            if(cekganjil(j)){
                list[i]=j;
                i++;
            }
            j++;
        }
        return list;
    }
    public boolean prima(int n){
        int f = 1;
        for(int i = 2;i<=n;i++)
            if(n%i==0)
                f++;
        return(f==2);
    }
    public int[] nPrimaPertama(int n){
        int list[] = new int[n];
        int i = 0,j = 1;
        while(i<n){
            if(prima(j)){
                list[i]=(j);
                i++;
            }
            j++;
        }
        return list;
    }
}