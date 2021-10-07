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
        // Project 1
        System.out.println("Project 1");
        
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
        
        // Project 2
        System.out.println("\nProject 2");
        
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
