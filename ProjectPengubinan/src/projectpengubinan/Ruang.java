/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author nufa
 */
public class Ruang {
//    // panjang ruang
//    int panjang;
//    // lebar ruang
//    int lebar;
    
    int hitungLuas(int panjang, int lebar){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        
//        // panjang dari persegi panjang diambil dari panjang ruang
//        p.panjang = this.panjang;
//        // lebar dari persegi panjang diambil dari lebar ruang
//        p.lebar = this.lebar;
        
        // hitung luasnya
        return PersegiPanjang.perkalian(panjang, lebar);
    }
}
