/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nufa
 */
public class ArrayProcessing {
    
    // array of integer > data
    int[] dataBil = new int[100];
    
    // jumlah data
    int n = 0;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya data (n): ");
        this.n = input.nextInt();
        for (int i = 0; i < this.n; i++){
            System.out.print("Masukan data ke-" + (i + 1) + ": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for (int i = 0; i < this.n; i++){
            sum += data[i];
        }
        double rerata = sum / this.n;
        return rerata;
    }
    
    int cariMax(int[] data){
        int nilaiMax = data[0];
        for (int i = 1; i < this.n; i++){
            if (data[i] > nilaiMax){
                nilaiMax = data[i];
            }
        }
        return nilaiMax;
    }
    
    int cariMin(int[] data){
        int nilaiMin = data[0];
        for (int i = 1; i < this.n; i++){
            if (data[i] < nilaiMin){
                nilaiMin = data[i];
            }
        }
        return nilaiMin;
    }
    
    int[] urutkan(int[] data){
        for (int i = 0; i < this.n - 1; i++){
            for (int j = 0; j < this.n - i - 1; j++){
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }
    
    String cetakArray(int[] data){
        String hasil = "";
        for (int i = 0; i < this.n; i++){
            if (i != this.n - 1){
                hasil += data[i] + ", ";
            } else {
                hasil += data[i];
            }
        }
        return hasil;
    }
    
    void output(){
        System.out.println("---------------------");
        System.out.println("Data        : " + this.cetakArray(this.dataBil));
        System.out.println("Rerata data : " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai maks  : " + this.cariMax(this.dataBil));
        System.out.println("Nilai min   : " + this.cariMin(this.dataBil));
        System.out.println("Data urut   : " + this.cetakArray(this.urutkan(this.dataBil)));
        
    }
}
