/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teori_PBO;

/**
 *
 * @author AXIOO
 */
public class BukuFinalize {
    
    public void Finalize(){
        System.out.println("Garbage Collector Berhasil Terkumpul");
    }
    public static void main(String[] args) {
        BukuFinalize satu = new BukuFinalize();
        BukuFinalize dua = new BukuFinalize();
        satu = null;
        dua = null;
        System.gc();
        System.out.println("Garbage Collector Siap!");
    }
}
