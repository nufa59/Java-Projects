/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author nufa
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi op = new Operasi();
        
        int hasil1 = op.jumlahkan(3, 4);
        int hasil2 = op.jumlahkan(4, 7, -9);
        double hasil3 = op.jumlahkan(3.4, -0.002, 0.12313);
        
        System.out.println("Hasil dari 3 + 4 = " + hasil1);
        System.out.println("Hasil dari 4 + 7 + (-9) = " + hasil2);
        System.out.println("Hasil dari 3.4  + (-0.002) + 0.12313 = " + hasil3);
        
        System.out.println("Hasil 23 x 9 = " + op.kalikan(23, 9));
        System.out.println("Hasil 3 x 4 x 9  = " + op.kalikan(3, 4, 9));
        System.out.println("Hasil 3.5 x 2 = " + op.kalikan(3.5, 2));
        System.out.println("Hasil 2.7 x 3.1 x 0.26 = " + op.kalikan(2.7, 3.1, 0.26));
    }
    
}
