/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolegame;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class DataMember {
    
    private String idMember;
    private String nama;
    private LocalDate tglPinjam;
    private LocalDate tglKembali;
    private ArrayList<Member> dataMember = new ArrayList<Member>();
    
    public void tambahMember(Member data){
        this.dataMember.add(data);
    }
    
    private void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("ID Member                       : ");
        this.idMember = input.nextLine();
        System.out.print("Nama Member                     : ");
        this.nama = input.nextLine();
        System.out.print("Masukan Tanggal Pinjam (1-31)   : ");
        int tglPinjam = input.nextInt();
        System.out.print("Masukan Bulan Pinjam (1-12)     : ");
        int bulanPinjam = input.nextInt();
        System.out.print("Masukan Tahun Pinjam            : ");
        int tahunPinjam = input.nextInt();
        System.out.print("Masukan Tanggal Kembali (1-31)  : ");
        int tglKembali = input.nextInt();
        System.out.print("Masukan Bulan Kembali (1-12)    : ");
        int bulanKembali = input.nextInt();
        System.out.print("Masukan Tahun Kembali           : ");
        int tahunKembali = input.nextInt();
        
        this.tglPinjam = LocalDate.of(tahunPinjam, bulanPinjam, tglPinjam);
        this.tglKembali = LocalDate.of(tahunKembali, bulanKembali, tglKembali);
    }
    
    private void cariMember(String id, String nama){
        boolean ditemukan = false;
        int index = -1;

        for(int i=0; i<this.dataMember.size(); i++){
           if (this.dataMember.get(i).getIdMember().equals(id) && this.dataMember.get(i).getNama().equals(nama)){
              index = i;
              ditemukan = true;
           }
        }
   
        if (ditemukan == true){
           switch(this.dataMember.get(index).getJenis()){
               case "Silver":
                   Silver s = new Silver(this.idMember, this.nama, this.tglPinjam, this.tglKembali);
                   s.printMember();
                   break;
               case "Gold":
                   Gold g = new Gold(this.idMember, this.nama, this.tglPinjam, this.tglKembali);
                   g.printMember();
                   break;
               case "Platinum":
                   Platinum p = new Platinum(this.idMember, this.nama, this.tglPinjam, this.tglKembali);
                   p.printMember();
                   break;
               default:
                   System.out.println("Jenis membership tidak ditemukan");
           }
        } else {
           System.out.println("Data Member tidak ditemukan");
        }
    }
    
    public void cekDataMember(){
        this.input();
        this.cariMember(this.idMember, this.nama);
    }
}
