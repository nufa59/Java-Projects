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
public class Member {
    private String idMember;
    private String nama;
    private String jenis;
    
    public Member(String id, String nama, String jenis){
        this.idMember = id;
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public String getIdMember(){
        return this.idMember;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getJenis(){
        return this.jenis;
    }
}

