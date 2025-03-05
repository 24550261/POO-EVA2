/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_2_herencia;

/**
 *
 * @author Ivan
 */
public class Cliente {
    private String name;
    private String lastn;
    private String lastn2;
    private String rfc;
    private int edad;

    public Cliente(String name, String lastn, String lastn2, String rfc, int edad) {
        this.name = name;
        this.lastn = lastn;
        this.lastn2 = lastn2;
        this.rfc = rfc;
        this.edad = edad;
    }
    
    public Cliente(){
        this.name = "Javier";
        this.lastn = "Bernal";
        this.lastn2 = "Loya";
        this.rfc = "BELJ061116KZ3";
        this.edad = 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastn() {
        return lastn;
    }

    public void setLastn(String lastn) {
        this.lastn = lastn;
    }

    public String getLastn2() {
        return lastn2;
    }

    public void setLastn2(String lastn2) {
        this.lastn2 = lastn2;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
  
    
    
    
}
