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
public class Tabung extends BangunRuang {
    public double jari2;
    public double tinggi;
    
    public double hitungLuasPermukaan(){
        double luas = 2 * Math.PI * this.jari2 * (this.jari2 + this.tinggi);
        return luas;
    }
    
    public double hitungVolume(){
        double volume = Math.PI * this.jari2 * this.jari2 * this.tinggi;
        return volume;
    }
}
