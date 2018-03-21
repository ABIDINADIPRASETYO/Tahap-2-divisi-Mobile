/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orang;

/**
 *
 * @author Abidin
 */

public class orang {

    /**
     * @param args the command line arguments
     */
    //Kelas Sebagai Objek
    //Mempunyai Data atau juga bisa disebut Atribut
    int umur = 20;
    String asal = "Blitar";

    public static void main(String[] args) {
        orang abidin = new orang();
        abidin.berjalan();
        abidin.makan();
        abidin.berfikir();
    }

    //Dapat Melakukan Aktivitas atau kita bisa menyebutnya method pada OOP
    public void berjalan(){
        System.out.println("dengan kaki");
    }
    
    public void makan(){
        System.out.println("dengan mulut");
    }
    
    public void berfikir(){
        System.out.println("dengan otak");
    }  
}
