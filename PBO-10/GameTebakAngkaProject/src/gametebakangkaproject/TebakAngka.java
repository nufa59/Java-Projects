/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Nufa
 */
public class TebakAngka {
    int tebakan;
    int angkaRandom;
    Scanner input = new Scanner(System.in);
    
    void tebak(){
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        
        while(true){
            angkaRandom = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            System.out.println(angkaRandom);
            while (true){
                System.out.print("\nMasukan Tebakan Anda: ");
                tebakan = input.nextInt();

                if (tebakan < angkaRandom){
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                } else if (tebakan > angkaRandom){
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                } else {
                    System.out.println("Yeeee… Bilangan tebakan anda BENAR");
                    break;
                }
            }
            System.out.print("Tebak lagi? (y/n): ");
            char confirm = input.next().charAt(0);
            input.nextLine();
            if(confirm == 'n' || confirm == 'N'){
                System.out.println("Terimakasih telah bermain");
                break;
            }
        }
    }
}
