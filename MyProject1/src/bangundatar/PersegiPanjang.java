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
public class PersegiPanjang {
    
    // atribut
    int panjang;
    int lebar;
    
    // methods
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Luas persegi panjang: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + hasil);
    }
    
}
