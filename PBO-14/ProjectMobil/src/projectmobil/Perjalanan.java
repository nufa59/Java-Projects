/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author Nufa
 */
public class Perjalanan {
    public double jarak;
    public double kecepatan;
    public String namaKota;
    public String namaMobil;
    public String jenis;
    
    public Perjalanan(String namaMobil, String jenis, String namaKota, double kecepatan, double jarak){
        this.jarak = jarak;
        this.kecepatan = kecepatan;
        this.namaKota = namaKota;
        this.namaMobil = namaMobil;
        this.jenis = jenis;
        
        this.output();
    }
    
    public void output(){
        System.out.println("Mobil " + this.namaMobil + " jenis " + this.jenis + " pada perjalanan Solo - " + this.namaKota);
        if (this.jenis.equals("Sedan")){
            Sedan sedan = new Sedan(this.jarak, this.kecepatan);
            sedan.tampilHasil();
        } else if (this.jenis.equals("SUV")){
            SUV suv = new SUV(this.jarak, this.kecepatan);
            suv.tampilHasil();
        } else if (this.jenis.equals("MPV")){
            MPV mpv = new MPV(this.jarak, this.kecepatan);
            mpv.tampilHasil();
        }
        System.out.println("");
    }
}
