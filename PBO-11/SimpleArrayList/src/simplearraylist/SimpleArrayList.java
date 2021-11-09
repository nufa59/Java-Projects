/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class SimpleArrayList {
    // array list data string
    ArrayList<String> dataStr = new ArrayList<String>();
    
    // input
    Scanner input = new Scanner(System.in);
    
    void tambahData(){
        System.out.print("\nMasukan data string: ");
        dataStr.add(input.nextLine());
        System.out.println("Daftar string dalam array list: " + dataStr);
    }
    
    void cariData(){
        System.out.print("\nString yang mau dicari: ");
        String cariStr = input.nextLine();
        int indexStr = dataStr.indexOf(cariStr);
        if (indexStr != -1){
            System.out.println("String " + cariStr + " ada di index ke " + indexStr + " di dalam data");
        } else {
            System.out.println("String " + cariStr + " tidak ada dalam data");
        }
    }
    
    void hapusData(){
        System.out.print("\nString yang mau dihapus: ");
        String str = input.nextLine();
        boolean hapus = dataStr.remove(str);
        if (hapus){
            System.out.println("String " + str + " sudah dihapus di dalam data");
        } else {
            System.out.println("String " + str + " tidak ada dalam data");
        }
        System.out.println("Daftar string dalam array list: " + dataStr);
    }
    
    void tampilData(){
        System.out.println("\nDaftar string dalam array list: " + dataStr);
    }
    
    void output(){
        while(true){
            System.out.println("\nMenu Data ArrayList");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih nomor berapa: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch (pilihan){
                case 1:
                    this.tambahData();
                    break;
                case 2:
                    this.cariData();
                    break;
                case 3:
                    this.hapusData();
                    break;
                case 4:
                    this.tampilData();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nomor yang dipilih tidak ada!");
            }
        }
    }
}
