/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_sobreescritura;

/**
 *
 * @author Javis
 */
public class EVA2_6_SOBREESCRITURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado worker= new Empleado("BELJ061116", "Fisica", "Javier", "Loya", 18);
        worker.imprimirDatos();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Maestro master=new Maestro("2345234", "POO", "KLOI098765LK0", "Fisica", "Ruben", "Hernandez", 97);
        master.imprimirDatos();
    }
    
}
