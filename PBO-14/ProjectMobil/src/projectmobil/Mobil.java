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
public abstract class Mobil {
    public double jarak;
    public double kecepatan;
    
    public Mobil(double jarak, double kecepatan){
        this.jarak = jarak;
        this.kecepatan = kecepatan;
    }
    
    public abstract double hitungBahanBakar();
    public double hitungWaktuPerjalanan(){
        double waktu = (double) this.jarak / this.kecepatan;
        return waktu;
    };
    
    public void tampilHasil(){
        System.out.println("Bahan bakar minimal yang dibutuhkan: " + this.hitungBahanBakar() + " liter");
        System.out.println("Waktu perjalanan: " + this.hitungWaktuPerjalanan() + " jam");
    }
}
