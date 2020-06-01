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
public class ContohFinally {
    public static void main(String[] args) {
        try {
            int a = 1/0;
        } catch (Exception e) {
            System.out.println("Ada Kesalahan");
        } finally{
            System.out.println("Terima Kasih Telah Menjalankan Program");
        }
    }
}
