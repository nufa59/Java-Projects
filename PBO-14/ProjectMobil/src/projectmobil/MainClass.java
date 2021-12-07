/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author Nufa
 */
public class MainClass {
    public static void main(String[] args){
//        Perjalanan(nama mobil, jenis mobil, tujuan, kecepatan, jarak)
        Perjalanan A = new Perjalanan("A", "Sedan", "Kudus", 60, 157.6);
        Perjalanan B = new Perjalanan("B", "Sedan", "Jakarta", 65, 536.4);
        Perjalanan C = new Perjalanan("C", "SUV", "Banten", 57, 660.6);
        Perjalanan D = new Perjalanan("D", "SUV", "Bandung", 62, 532.2);
        Perjalanan E = new Perjalanan("E", "MPV", "Banyuwangi", 64, 539.4);
        Perjalanan F = new Perjalanan("F", "MPV", "Jember", 53, 431.1);
    }
}
