/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author Nufa
 */
public class SUV extends Mobil {
    
    public SUV(double jarak, double kecepatan){
        super(jarak, kecepatan);
    }
    
    public double hitungBahanBakar(){
        double konsumsiBB = (double) 1 / 12;
        double jumlah = this.jarak * konsumsiBB;
        return Math.ceil(jumlah);
    }
}
