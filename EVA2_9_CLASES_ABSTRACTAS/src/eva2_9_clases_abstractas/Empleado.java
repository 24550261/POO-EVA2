/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author Javis
 */
public class Empleado extends Persona{
    private String num_empleado;

    public Empleado(String num_empleado) {
        this.num_empleado = num_empleado;
    }

    public Empleado() {
         this.num_empleado ="~~~~~~~~";
    }

    public String getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(String num_empleado) {
        this.num_empleado = num_empleado;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Name: "+getName());
        System.out.println("Last Name: "+getL_name());
        System.out.println("Age: "+getAge());
        System.out.println("Clave: "+num_empleado);
    }
    
    
    
    
    
    
    
}
