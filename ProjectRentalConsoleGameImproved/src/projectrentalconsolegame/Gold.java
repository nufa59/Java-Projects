/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolegame;

import java.time.LocalDate;

/**
 *
 * @author Nufa
 */
public class Gold extends Silver {
    private String jenis = "Gold";
    private int cashback = 5000;
    
    public Gold(String id, String nama, LocalDate pinjam, LocalDate kembali){
        super(id, nama, pinjam, kembali);
    }
    
    protected void hitungPoin(){
        int poinPerHari = 5;
        this.poin = this.lamaSewa * poinPerHari;        
    }
    
    protected void hitungTotalSewa(){
        int biayaSewaSehari = 30000;
        double diskon = 0.02;
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
        System.out.println("Jumlah Cashback                 : Rp " + this.cashback);
    }
    
}
