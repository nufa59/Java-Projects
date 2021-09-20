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
public class Bola {
    
    // atribut
    int jariJari;
    
    // methods
    public void hitungVol(){
        double hasil = (double) 4 / 3 * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * Math.PI * jariJari * jariJari;
        System.out.println("Luas selimut bola: " + hasil);
    }
    
    // main method
    public static void main(String[] args){
        Bola b1 = new Bola();
        b1.jariJari = 21;
        b1.hitungVol();
        b1.hitungLuasSelimut();
    }
    
}
