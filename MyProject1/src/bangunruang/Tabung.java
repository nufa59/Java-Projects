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
    public void hitungVol(){
        double hasil = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil =  2 * Math.PI * jariJari * tinggi;
        System.out.println("Luas selimut tabung: " + hasil);
    }
    
    public static void main(String[] args){
        Tabung t1 = new Tabung();
        t1.jariJari = 7;
        t1.tinggi = 10;
        t1.hitungVol();
        t1.hitungLuasSelimut();
    }
}
