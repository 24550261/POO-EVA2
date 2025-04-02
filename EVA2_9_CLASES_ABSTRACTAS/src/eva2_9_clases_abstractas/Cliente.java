/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author Javis
 */
public class Cliente extends Persona {
    private String RFC;
    private String t_persona;

    public Cliente(String RFC, String t_persona) {
        this.RFC = RFC;
        this.t_persona = t_persona;
    }

    public Cliente() {
         this.RFC = "~~~~~~~~~~~~";
        this.t_persona = "----------";
        
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getT_persona() {
        return t_persona;
    }

    public void setT_persona(String t_persona) {
        this.t_persona = t_persona;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Name: "+getName());
        System.out.println("Last Name: "+getL_name());
        System.out.println("Age: "+getAge());
        System.out.println("RFC: "+RFC);
        System.out.println("Tipo de persona: "+t_persona);
    }
    
    
    
    
    
}
