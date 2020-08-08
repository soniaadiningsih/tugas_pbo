/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Utama {
    public static void main(String[] args) {
        
        String warna = "Orange";
        int jumlah = 12;
        
        Jeruk jeruk = new Jeruk(warna, jumlah);
        jeruk.masak();
        jeruk.belum_masak();
        jeruk.tampilData();
    }
    
}
