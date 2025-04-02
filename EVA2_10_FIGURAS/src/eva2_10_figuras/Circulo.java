/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_figuras;

/**
 *
 * @author Javis
 */
public class Circulo extends Figuras {
    private double r;

    public Circulo(double r) {
        this.r = r;
        
    }

    public Circulo() {
         this.r = 0;
         
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tenerArea() {
        return Math.PI*(r*r);
    }

    @Override
    public double tenerPerimetro() {
        return 2*Math.PI*r;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Area del Circulo: "+tenerArea());
        System.out.println("Perimetro del Circulo: "+tenerPerimetro());
    }

}
       
        
    

