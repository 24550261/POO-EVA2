/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_exaprac;

/**
 *
 * @author invitado
 */
public class TestCovid {
   private int edad;
   private boolean enfermedadcron;
   private double peso;
   private double estatura;
   
   public void TestCovid(){
      edad=18;
      enfermedadcron=false;
      peso=90.0;
      estatura=1.87;
      
   }
   
   public void setEdad(int edad){
      this.edad=edad;
   }
   
   public int getEdad(){
      return edad;
   }
   public void setEnfer(boolean enfermedadcron){
      this.enfermedadcron=enfermedadcron;
   }
   
   public boolean getEnfer(){
      return enfermedadcron;
   }
   public void setPeso(double peso){
      this.peso=peso;
   }
   
   public double getPeso(){
      return peso;
   }
   public void setEstat(double estatura){
      this.estatura=estatura;
   }
   
   public double getEstat(){
      return estatura;
   }
   
   
   public double calcIMC(){
      return (peso)/(estatura*estatura);
   }
   
   public void calificarPerso(){
      if(enfermedadcron==true||edad>=65||calcIMC()>30){
         System.out.println("Persona de riesgo");
      }else{
         System.out.println("No es persona de riesgo");
      }
   }
   
   public void imprimirDatos(){
      System.out.println(edad);
      System.out.println("----------------------");
      System.out.println(enfermedadcron);
      System.out.println("----------------------");
      System.out.println(peso);
      System.out.println("----------------------");
      System.out.println(estatura);
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
   }
   
}
