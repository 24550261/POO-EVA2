/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_figuras;

/**
 *
 * @author Javis
 */
public class Rectangulo extends Figuras {
    private double b, h;

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public Rectangulo() {
         this.b = 0;
        this.h = 0;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double tenerArea() {
        return b*h;
    }

    @Override
    public double tenerPerimetro() {
       return (2*b)+(2*h);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Area del Rectangulo: "+ tenerArea());
        System.out.println("Perimetro del Rectangulo: "+ tenerPerimetro());
    }

    
    
    
    
    
    
}
