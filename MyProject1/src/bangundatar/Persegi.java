/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Nufa
 */
public class Persegi {
    
    // atribut
    int sisi;
    
    // methods
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Luas persegi: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = 4 * sisi;
        System.out.println("Keliling persegi: " + hasil);
    }
    
    // main method
    public static void main(String[] args){
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.hitungLuas();
        p1.hitungKeliling();
        
        System.out.println("");
        
        Persegi p2 = new Persegi();
        p2.sisi = 15;
        p2.hitungLuas();
        p2.hitungKeliling();
    }
    
}
