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
    public void hitungVol(){
        double hasil = (double) 1 / 3 * Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume kerucut: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double garisPelukis = (double) (jariJari * jariJari) + (tinggi * tinggi);
        double s = Math.sqrt(garisPelukis);
        double hasil = Math.PI * jariJari * s;
        System.out.println("Luas selimut kerucut: " + hasil);
    }
    
    public static void main(String[] args){
        Kerucut k1 = new Kerucut();
        k1.jariJari = 7;
        k1.tinggi = 10;
        k1.hitungVol();
        k1.hitungLuasSelimut();
    }
}
