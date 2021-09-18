/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Nufa
 */
public class Kerucut {
    
    // atribut
    int jariJari;
    int tinggi;
    
    // methods
    public void hitungVolume(){
        double hasil = 1 / 3 * 3.14 * jariJari * jariJari * tinggi;
        System.out.println("Volume kerucut: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double garisPelukis = (double) (jariJari * jariJari) + (tinggi * tinggi);
        double s = Math.sqrt(garisPelukis);
        double hasil = 22 / 7 * jariJari * s;
        System.out.println("Luas selimut kerucut: " + hasil);
    }
}
