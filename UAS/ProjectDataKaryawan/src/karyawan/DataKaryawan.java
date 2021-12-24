/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class DataKaryawan {
    ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
    Scanner input = new Scanner(System.in);
    
    private void tambahData(){
        while (true){
            System.out.print("Masukan Kode Karyawan             : ");
            String kode = input.nextLine();
            System.out.print("Masukan Nama Karyawan             : ");
            String nama = input.nextLine();
            System.out.print("Masukan Alamat                    : ");
            String alamat = input.nextLine();
            System.out.print("Masukan Tanggal Lahir (YYYY-MM-DD): ");
            String tglLahir = input.nextLine();
            System.out.print("Masukan Golongan (A,B,C)          : ");
            String gol = input.nextLine();
            System.out.print("Masukan Status Menikah (0,1)      : ");
            int statusMenikah = input.nextInt();
            int jmlAnak = 0;
            if (statusMenikah == 1){
            System.out.print("Masukan Jumlah Anak               : ");
            jmlAnak = input.nextInt();
            }
      
            if (gol.equals("A")){
                this.dataKaryawan.add(new GolonganA(kode, nama, alamat, tglLahir, gol, statusMenikah, jmlAnak));
            } else if (gol.equals("B")){
                this.dataKaryawan.add(new GolonganB(kode, nama, alamat, tglLahir, gol, statusMenikah, jmlAnak));
            } else if (gol.equals("C")){
                this.dataKaryawan.add(new GolonganC(kode, nama, alamat, tglLahir, gol, statusMenikah, jmlAnak));
            } else {
                System.out.println("Data gagal ditambahkan, golongan " + gol + " tidak tersedia!");
            }
            
            System.out.println("");
            System.out.println("Pilih SubMenu");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Tambah Data Kembali");
            System.out.println("");
            System.out.print("Menu pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1){
                this.output();
            }
        }
    }
    
    private void hapusData(){
        while (true){
            System.out.print("Kode karyawan yang mau dihapus: ");
            String kode = input.nextLine();
            if (this.dataKaryawan.removeIf(data -> data.kode.equals(kode))){
                System.out.println("Data berhasil dihapus");
            } else {
                System.out.println("Data gagal dihapus, data tidak ditemukan");
            }
            
            System.out.println("");
            System.out.println("Pilih SubMenu");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Hapus Data Kembali");
            System.out.println("");
            System.out.print("Menu pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1){
                this.output();
            }
        }
    }
    
    private void lihatData(){
        String format = "%-15s %-20s %-10s %-10d %-15s %-12s%n";
        System.out.println("=================================================");
        System.out.println("DATA KARYAWAN");
        System.out.format("--------------------------------------------------------------------------------------%n");
        System.out.format("KODE KARY       NAMA KARY            GOL        USIA       STATUS NIKAH    JUMLAH ANAK %n");
        System.out.format("--------------------------------------------------------------------------------------%n");
        for (Karyawan data : this.dataKaryawan){
            System.out.format(format, data.kode, data.nama, data.gol, data.hitungUsia(), data.cariStatusMenikah(), data.jmlAnak);
        }
        System.out.format("--------------------------------------------------------------------------------------%n");
        System.out.println("Jumlah Data: " + this.dataKaryawan.size());
        
        System.out.println("");
        System.out.println("Pilih SubMenu");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("");
        System.out.print("Menu pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        if (pilihan == 1){
            this.output();
        }
    }
    
    private void tampilProfile(Karyawan data){
        System.out.println("========================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("----------------------------------------");
        System.out.println("Kode Karyawan           : " + data.kode);
        System.out.println("Nama Karyawan           : " + data.nama);
        System.out.println("Golongan                : " + data.gol);
        System.out.println("Usia                    : " + data.hitungUsia());
        System.out.println("Status Menikah          : " + data.cariStatusMenikah());
        if(data.statusMenikah == 1){
        System.out.println("Jumlah Anak             : " + data.jmlAnak);
        }
        System.out.println("----------------------------------------");
        System.out.println("Gaji Pokok              : Rp " + data.hitungGapok());
        if(data.statusMenikah == 1){
        System.out.println("Tunjangan Istri/Suami   : Rp " + data.hitungTunjNikah());
        }
        if(data.hitungUsia() > 30){
        System.out.println("Tunjangan Pegawai       : Rp " + data.hitungTunjPegawai());
        }
        if(data.statusMenikah == 1){
        System.out.println("Tunjangan Anak          : Rp " + data.hitungTunjAnak());
        }
        System.out.println("---------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp " + data.hitungGajiKotor());
        System.out.println("Potongan                : Rp " + data.hitungPotongan());
        System.out.println("---------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp " + data.hitungGajiBersih());
    }
    
    private void cariData(){
        System.out.print("Masukan kode karyawan: ");
        String kode = input.nextLine();
        boolean ada = false;
        for (Karyawan data : this.dataKaryawan){
            if(data.kode.equals(kode)){
                ada = true;
                this.tampilProfile(data);
            }
        }
        if(!ada){
            System.out.println("Data tidak ditemukan");
        }
        System.out.println("");
        System.out.println("Pilih SubMenu");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("");
        System.out.print("Menu pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        if (pilihan == 1){
            this.output();
        }
    }
    
    public void output(){

        while (true){
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Menu pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            switch(pilihan){
                case 1:
                    this.tambahData();
                case 2:
                    this.hapusData();
                case 3:
                    this.cariData();
                case 4:
                    this.lihatData();
                case 5:
                    System.exit(0);
            }
        }
    }
}
