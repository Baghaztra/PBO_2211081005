/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baghaz080423;
/**
 *
 * @author Bagas
 */
import Baghaz010423.StudentRecord;
public class ComputerStudent extends StudentRecord{
    //latihan 1 dimodule 11
    private double compGrade;
    public ComputerStudent(){
        super( "Ali", "Padang" );
        System.out.println("Inside ComputerStudent Constructor");
    }
    
    public double getCompGrade(){
        return compGrade;
    } 
    public void setCompGrade(double cGrade){
        this.compGrade = cGrade;
    }
    @Override
    public double getAverage(){
        return (getMathGrade() + getEnglishGrade() + getScienceGrade()+getCompGrade())/4;
        //untuk memeanggil variabel average, kita harus merubah public menjadi protected
    }
}
