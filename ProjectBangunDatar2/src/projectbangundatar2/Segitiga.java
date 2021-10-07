/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author nufa
 */
public class Segitiga {
    double hitungLuas(int alas, int tinggi){
        return 0.5 * alas * tinggi;
    }
    
    double hitungLuas(double alas, int tinggi){
        return 0.5 * alas * tinggi;
    }
    
    double hitungLuas(int alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
    
    double hitungLuas(double alas, double tinggi){
        return 0.5 * alas * tinggi;
    }
    
    double hitungKeliling(int alas, int tinggi){
        double sisi = Math.sqrt((0.5 * alas) * (0.5 * alas) + tinggi * tinggi);
        return 2 * sisi + alas;
    }
    
    double hitungKeliling(int alas, double tinggi){
        double sisi = Math.sqrt((0.5 * alas) * (0.5 * alas) + tinggi * tinggi);
        return 2 * sisi + alas;
    }
    
    double hitungKeliling(double alas, int tinggi){
        double sisi = Math.sqrt((0.5 * alas) * (0.5 * alas) + tinggi * tinggi);
        return 2 * sisi + alas;
    }
    
    double hitungKeliling(double alas, double tinggi){
        double sisi = Math.sqrt((0.5 * alas) * (0.5 * alas) + tinggi * tinggi);
        return 2 * sisi + alas;
    }
}
