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
public class Balok extends BangunRuang {
    public double panjang;
    public double lebar;
    public double tinggi;
    
    public double hitungLuasPermukaan(){
        double luas = 2 * ( (this.panjang * this.lebar) + (this.lebar * this.tinggi) + (this.panjang * this.tinggi) );
        return luas;
    }
    
    public double hitungVolume(){
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
}
