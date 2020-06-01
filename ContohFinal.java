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
public class ContohFinal {
   private final int max = 5;
   private final int hargaPena = 2000;
   private static int a;
   public static void main(String[] args) {
      ContohFinal x = new ContohFinal();
      for(a=1;a<=x.max;a++){
          System.out.println("Harga Pena " +a+ ":"+ x.hargaPena*a);
      }
   }
    
}

