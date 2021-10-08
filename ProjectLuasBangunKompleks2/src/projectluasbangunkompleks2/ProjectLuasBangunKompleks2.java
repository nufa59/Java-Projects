/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author Nufa
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // menghitung luas setengah lingkaran besar
        Lingkaran lingkaranBesar = new Lingkaran();
        double luasLingkaranBesar = lingkaranBesar.hitungLuas(14)/2;
        
        // menghitung lingkaran kecil
        Lingkaran lingkaranKecil = new Lingkaran();
        double jejariKecil = (double) 28/4;
        double luasLingkaranKecil = lingkaranKecil.hitungLuas(jejariKecil);
        
        // menghitung luas bagian yang diarsir
        double luasBangun2 = luasLingkaranBesar - luasLingkaranKecil;
        System.out.println("Luas Bangun: " + luasBangun2);
    }
    
}
