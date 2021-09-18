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
public class Lingkaran {
    
    // atribut
    int jariJari;
    
    // methods
    public void hitungLuas(){
        double hasil = 3.14 * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * 3.14 * jariJari;
        System.out.println("Keliling lingkaran " + hasil);
    }
    
    // main method
    public static void main(String[] args){
        Lingkaran l1 = new Lingkaran();
        l1.jariJari = 25;
        l1.hitungLuas();
        l1.hitungKeliling();
        
        System.out.println("");
        
        Lingkaran l2 = new Lingkaran();
        l1.jariJari = 37;
        l1.hitungLuas();
        l1.hitungKeliling();
    }
    
}
