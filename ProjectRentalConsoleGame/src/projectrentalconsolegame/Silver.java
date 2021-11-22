/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolegame;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class Silver {
    // atribut
    protected String idMember;
    protected String nama;
    protected LocalDate tglPinjam;
    protected LocalDate tglKembali;
    protected int poin;
    protected int lamaSewa;
    protected long totalSewa;
    
    protected String jenis = "Silver";
    
    public Silver(String id, String nama, LocalDate pinjam, LocalDate kembali){
        this.idMember = id;
        this.nama = nama;
        this.tglPinjam = pinjam;
        this.tglKembali = kembali;
    }
    
    protected void hitungLamaSewa(){
        this.lamaSewa = (int) ChronoUnit.DAYS.between(tglPinjam, tglKembali);
    }
    
    protected void hitungPoin(){
        int poinPerHari = 1;
        this.poin = this.lamaSewa * poinPerHari;        
    }
    
    protected void hitungTotalSewa(){
        int biayaSewaSehari = 25000;
        double diskon = 0.01;
        double total = this.lamaSewa * biayaSewaSehari;
        total -= (total * diskon);
        this.totalSewa = (long) total;
    }

    
    public void printMember(){
        this.hitungLamaSewa();
        this.hitungTotalSewa();
        this.hitungPoin();

        System.out.println("\nID Member                       : " + this.idMember);
        System.out.println("Nama Member                     : " + this.nama);
        System.out.println("Jenis Member                    : " + this.jenis);
        System.out.println("\nTanggal Pinjam                  : " + this.tglPinjam);
        System.out.println("Tanggal Kembali                 : " + this.tglKembali);
        System.out.println("Lama Sewa                       : " + this.lamaSewa + " hari");
        System.out.println("\nTotal Sewa                      : Rp " + this.totalSewa);
        System.out.println("Jumlah Poin                     : " + this.poin);
    }
}
