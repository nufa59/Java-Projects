/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class Pythagoras {
    
    int pilihMenu;
    double a, b, c;
    
    Scanner input = new Scanner(System.in);
    
    void cekPythagoras(){
        System.out.print("Masukan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukan nilai c: ");
        c = input.nextDouble();
        
        if (a*a + b*b == c*c){
            System.out.println("Merupakan triple pythagoras");
        } else {
            System.out.println("Bukan triple pythagoras");
        }
    }
    
    void cariSisiMiring(){
        System.out.print("Masukan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukan nilai b: ");
        b = input.nextDouble();
        
        c = Math.sqrt(a*a + b*b);
        System.out.println("Nilai c adalah " + c);
    }
    
    void cariSisiSiku2(){
        System.out.print("Masukan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukan nilai c: ");
        c = input.nextDouble();
        
        b = Math.sqrt(c*c - a*a);
        System.out.println("Nilai b adalah " + b);
    }
    
    void menu(){
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit\n");
        
        System.out.print("Pilih menu: ");
        pilihMenu = input.nextInt();
        
        switch (pilihMenu){
            case 1:
                this.cekPythagoras();
                break;
            case 2:
                this.cariSisiMiring();
                break;
            case 3:
                this.cariSisiSiku2();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}
