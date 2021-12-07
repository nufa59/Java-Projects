/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author Nufa
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("----Bangun Datar----\n");
        System.out.println("Persegi");
        Persegi p1 = new Persegi();
        p1.sisi = 10;
        p1.tampilHasil();
        
        System.out.println("--------------------");
        
        System.out.println("Persegi Panjang");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 12;
        pp1.lebar = 8.5;
        pp1.tampilHasil();
        
        System.out.println("--------------------");
        
        System.out.println("Lingkaran");
        Lingkaran l1 = new Lingkaran();
        l1.jari2 = 23;
        l1.tampilHasil();
        
        System.out.println("\n----Bangun Ruang----\n");
        System.out.println("Tabung");
        Tabung tabung = new Tabung();
        tabung.jari2 = 10;
        tabung.tinggi = 20;
        tabung.tampilHasil();
        
        System.out.println("--------------------");
        
        System.out.println("Balok");
        Balok balok = new Balok();
        balok.panjang = 8;
        balok.lebar = 4;
        balok.tinggi = 20;
        balok.tampilHasil();
        
        System.out.println("--------------------");
        System.out.println("Bola");
        Bola bola = new Bola();
        bola.jari2 = 12;
        bola.tampilHasil();
        
    }
    
}
