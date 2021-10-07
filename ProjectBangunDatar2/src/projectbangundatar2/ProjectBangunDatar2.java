/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author nufa
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Persegi Panjang");
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Panjang 10 lebar 5 : " + "\n\tLuas :" + pp.hitungLuas(10, 5) + "\n\tKeliling: " + pp.hitungKeliling(10, 5));
        System.out.println("\nPanjang 3.6 lebar 8 : " + "\n\tLuas :" + pp.hitungLuas(3.6, 8) + "\n\tKeliling: " + pp.hitungKeliling(3.6, 8));
        System.out.println("\nPanjang 6 lebar 8.3 : " + "\n\tLuas :" + pp.hitungLuas(6, 8.3) + "\n\tKeliling: " + pp.hitungKeliling(6, 8.3));
        System.out.println("\nPanjang 5.6 lebar 8.8 : " + "\n\tLuas :" + pp.hitungLuas(5.6, 8.8) + "\n\tKeliling: " + pp.hitungKeliling(5.6, 8.8));
        
        Persegi p = new Persegi();
        System.out.println("\nPersegi");
        System.out.println("Sisi 4.5 : " + "\n\tLuas :" + p.hitungLuas(4.5) + "\n\tKeliling: " + p.hitungKeliling(4.5));
        System.out.println("\nSisi 7 : " + "\n\tLuas :" + p.hitungLuas(7) + "\n\tKeliling: " + p.hitungKeliling(7));
        
        Lingkaran l = new Lingkaran();
        System.out.println("\nLingkaran");
        System.out.println("Jejari 5 : " + "\n\tLuas :" + l.hitungLuas(5) + "\n\tKeliling: " + l.hitungKeliling(5));
        System.out.println("\nJejari 7.4 : " + "\n\tLuas :" + l.hitungLuas(7.4) + "\n\tKeliling: " + l.hitungKeliling(7.4));
        
        Segitiga s = new Segitiga();
        System.out.println("\nSegitiga");
        System.out.println("Alas 8 Tinggi 10 : " + "\n\tLuas :" + s.hitungLuas(8, 10) + "\n\tKeliling: " + s.hitungKeliling(8, 10));
        System.out.println("\nAlas 8 Tinggi 11.5 : " + "\n\tLuas :" + s.hitungLuas(8, 11.5) + "\n\tKeliling: " + s.hitungKeliling(8, 11.5));
        System.out.println("\nAlas 12.2 Tinggi 9 : " + "\n\tLuas :" + s.hitungLuas(12.2, 9) + "\n\tKeliling: " + s.hitungKeliling(12.2, 9));
        System.out.println("\nAlas 13.9 Tinggi 20.7 : " + "\n\tLuas :" + s.hitungLuas(13.9, 20.7) + "\n\tKeliling: " + s.hitungKeliling(13.9, 20.7));
    }
    
}
