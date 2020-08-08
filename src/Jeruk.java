/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Jeruk {
    private String warna;
    private int jumlah ;
    
  public Jeruk(String warna,int jumlah){
       this.warna = warna;
       this.jumlah = jumlah;
       System.out.println("Inisialisasi Atribut");
   }
            
    void masak (){
        System.out.println("buah Jeruk sudah masak");
        }
    void belum_masak () {
        System.out.println("buah Jeruk belum masak");
        
    }
    void tampilData(){
        System.out.println("warna :"+this.warna);
        System.out.println("umur :"+this.jumlah);
}
}
