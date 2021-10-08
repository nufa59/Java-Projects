/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author nufa
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // luas persegi
        Persegi persegi = new Persegi();
        int luasPersegi = persegi.hitungLuas(42);
        
        // luas lingkaran
        Lingkaran lingkaran = new Lingkaran();
        double jari2 = (double) 42/2;
        double luasTotalLingkaran = 2 * lingkaran.hitungLuas(jari2);
        
        // luas bangun
        double luasBangun = luasPersegi + luasTotalLingkaran;
        System.out.println("Luas bangun : " +  luasBangun);
        
    }
    
}
