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
public class Bola extends BangunRuang {
    public double jari2;
    
    public double hitungLuasPermukaan(){
        double luas = 4 * Math.PI * this.jari2 * this.jari2;
        return luas;
    }
    
    public double hitungVolume(){
        double volume = (double) 4 / 3 * Math.PI * this.jari2 * this.jari2 * this.jari2;
        return volume;
    }
}
