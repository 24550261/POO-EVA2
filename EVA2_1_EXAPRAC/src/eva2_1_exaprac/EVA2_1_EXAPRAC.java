/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_exaprac;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_EXAPRAC {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      TestCovid covi=new TestCovid();
      Scanner captu= new Scanner(System.in);
      
      covi.TestCovid();
      covi.imprimirDatos();
      covi.calificarPerso();
      
      System.out.println("Ingrese edad");
      int r=captu.nextInt();
      System.out.println("Ingrese peso");
      double r2=captu.nextDouble();
      System.out.println("Ingrese Estatura");
      double r3=captu.nextDouble();
      System.out.println("Ingrese si padece usted de una enfermedad cronica");
      boolean r4=captu.nextBoolean();
      
      covi.setEdad(r);
      covi.setPeso(r2);
      covi.setEstat(r3);
      covi.setEnfer(r4);
      
      covi.imprimirDatos();
      covi.calificarPerso();
      
      
      
   }
   
}
