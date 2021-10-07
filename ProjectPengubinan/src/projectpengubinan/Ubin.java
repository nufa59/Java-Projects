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
public class Ubin {
//    // panjang ubin
//    int panjang;
//    // lebar ubin
//    int lebar;
    
    int hitungLuas(int panjang, int lebar){
        PersegiPanjang p = new PersegiPanjang();
//        p.panjang = this.panjang;
//        p.lebar = this.lebar;
        return p.hitungLuas(panjang, lebar);
    }
}
