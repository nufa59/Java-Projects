/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolegame;

/**
 *
 * @author Nufa
 */
public class ProjectRentalConsoleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataMember d = new DataMember();
        d.tambahMember(new Member("M001", "Mr. X", "Silver"));
        d.tambahMember(new Member("M002", "Mr. Y", "Gold"));
        d.tambahMember(new Member("M003", "Mr. Z", "Platinum"));
        
        // saat proses input id member dan nama member harus benar
        d.cekDataMember();
    }
    
}
