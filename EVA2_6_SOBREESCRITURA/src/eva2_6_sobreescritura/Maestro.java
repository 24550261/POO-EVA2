/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_sobreescritura;

/**
 *
 * @author Javis
 */
public class Maestro extends Empleado{
    private String Clave;
    private String Asignatura;

    public Maestro() {
        super();
    }

    public Maestro(String Clave, String Asignatura, String RFC, String tipo_person, String name, String l_name, int age) {
        super(RFC, tipo_person, name, l_name, age);
        this.Clave = Clave;
        this.Asignatura = Asignatura;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Clave:"+Clave);
        System.out.println("Asignatura:"+Asignatura);
    }
    
    
    
    
}
