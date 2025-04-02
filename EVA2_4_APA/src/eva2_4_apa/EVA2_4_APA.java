/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_apa;

/**
 *
 * @author Javis
 */
public class EVA2_4_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------");
        
        System.out.println("GRABACION:");
       System.out.println("----------");
        Grabacion ddy=new Grabacion("dady Yankee", "Chihuahua", "Mexico");
        ddy.setAuthor("Bad Bunny");
        ddy.setCity("Meoqui");
        ddy.setTitle("Llamado de Emergencia");
        ddy.setYear(2012);
        ddy.imprimirDatos();
        
        System.out.println("----------");
        System.out.println("LIBRO:");
        System.out.println("----------");
        LIBRO book= new LIBRO("Gamesa");
        book.setAuthor("Sofia Licon");
        book.setCity("Torreon");
        book.setTitle("Memoir of Snail");
        book.setYear(2025);
        
        book.imprimirDatos();
        
       
    }
    
}
