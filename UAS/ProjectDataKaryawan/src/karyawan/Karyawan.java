/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

import interfaces.Gaji;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Nufa
 */
public abstract class Karyawan implements Gaji {
    protected String kode;
    protected String nama;
    protected String alamat;
    protected LocalDate tglLahir;
    protected String gol;
    protected int statusMenikah;
    protected int jmlAnak;
    
    public Karyawan(String kode, String nama, String alamat, String tglLahir, String gol, int statusMenikah, int jmlAnak){
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.tglLahir = LocalDate.parse(tglLahir);
        this.gol = gol;
        this.statusMenikah = statusMenikah;
        this.jmlAnak = jmlAnak;
    }
    
    @Override
    public abstract double hitungGapok();
    
    public int hitungUsia(){
        LocalDate today = LocalDate.now();
        return Period.between(this.tglLahir, today).getYears();
    }
    
    public String cariStatusMenikah(){
        String status = "";
        if (this.statusMenikah == 0){
            status = "Belum Menikah";
        } else if (this.statusMenikah == 1){
            status = "Menikah";
        }
        return status;
    }
    
    @Override
    public double hitungTunjNikah(){
        return this.hitungGapok() * 0.1;
    }
    
    @Override
    public double hitungTunjPegawai(){
        double tunj = 0;
        if(this.hitungUsia() > 30){
            tunj = 0.15 * this.hitungGapok();
        }
        return tunj;
    }
    
    @Override
    public double hitungTunjAnak(){
        return (0.05 * this.hitungGapok()) * this.jmlAnak;
    }
    
    @Override
    public double hitungGajiKotor(){
        double gaji = 0;
        if(this.statusMenikah == 1){
            gaji = this.hitungGapok() + this.hitungTunjNikah() + this.hitungTunjPegawai() + this.hitungTunjAnak();
        } else {
            gaji = this.hitungGapok() + this.hitungTunjPegawai();
        }
        return gaji;
    }
    
    @Override
    public double hitungPotongan(){
        return 0.025 * this.hitungGajiKotor();
    }
    
    @Override
    public double hitungGajiBersih(){
        return this.hitungGajiKotor() - this.hitungPotongan();
    }
}
