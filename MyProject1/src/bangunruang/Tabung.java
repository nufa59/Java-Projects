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
public class Tabung {
    
    // atribut
    int jariJari;
    int tinggi;
    
    // methods
    public void hitungVolume(){
        double hasil = 3.14 * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * 3.14 * jariJari * tinggi;
        System.out.println("Luas selimut tabung: " + hasil);
    }
    
}
