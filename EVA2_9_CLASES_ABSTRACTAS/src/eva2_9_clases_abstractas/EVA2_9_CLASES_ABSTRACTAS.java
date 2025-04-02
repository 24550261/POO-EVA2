/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author Javis
 */
public class EVA2_9_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Empleado: ");
        System.out.println("    ");
                Empleado worker=new Empleado("783465837465234239");
        worker.setAge(18);
        worker.setName("Javier Ivan");
        worker.setL_name("Bernal loya");
        worker.imprimirDatos();
        System.out.println("    ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Cliente");
        Cliente customer=new Cliente("BELJ061116KZ3", "Fisica");
        customer.setName("Javier Ivan");
        customer.setL_name("Bernal Loya");
        customer.setAge(18);
        customer.imprimirDatos();
    }
    
}
