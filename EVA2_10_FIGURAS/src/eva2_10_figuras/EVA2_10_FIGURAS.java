/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_figuras;

/**
 *
 * @author Javis
 */
public class EVA2_10_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo choya=new Circulo(4.32);
        Rectangulo Sofos=new Rectangulo(23.23, 45.2);
        
        System.out.println("Circulo: ");
        System.out.println("        ");
        choya.imprimirDatos();
        System.out.println("    ");
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("        ");
        System.out.println("Rectangulo: ");
        System.out.println("    ");
        Sofos.imprimirDatos();
    }
    
}
