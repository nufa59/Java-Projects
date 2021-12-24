/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author Nufa
 */
public class GolonganC extends Karyawan {
    
    public GolonganC(String kode, String nama, String alamat, String tglLahir, String gol, int statusMenikah, int jmlAnak){
        super(kode, nama, alamat, tglLahir, gol, statusMenikah, jmlAnak);
    }
    
    @Override
    public double hitungGapok(){
        return 7000000;
    }
}
