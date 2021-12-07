/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

/**
 *
 * @author Nufa
 */
public class Lingkaran extends BangunDatar{
    public double jari2;
    
    public double hitungLuas(){
        double luas = Math.PI * this.jari2 * this.jari2;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * this.jari2;
        return keliling;
    }
}
