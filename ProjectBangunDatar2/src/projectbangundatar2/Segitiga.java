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
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return sisiMiring + alas + tinggi;
    }
    
    double hitungKeliling(int alas, double tinggi){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return sisiMiring + alas + tinggi;
    }
    
    double hitungKeliling(double alas, int tinggi){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return sisiMiring + alas + tinggi;
    }
    
    double hitungKeliling(double alas, double tinggi){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return sisiMiring + alas + tinggi;
    }
}
