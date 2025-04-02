/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_sobreescritura;

/**
 *
 * @author Javis
 */
public class Empleado extends Persona{
    private String RFC;
    private String tipo_person;

    public Empleado() {
        super();
    }

    public Empleado(String RFC, String tipo_person, String name, String l_name, int age) {
        super(name, l_name, age);
        this.RFC = RFC;
        this.tipo_person = tipo_person;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTipo_person() {
        return tipo_person;
    }

    public void setTipo_person(String tipo_person) {
        this.tipo_person = tipo_person;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+RFC);
        System.out.println("Tipo de Persona: "+tipo_person);
    }
    
    
    
    
}
