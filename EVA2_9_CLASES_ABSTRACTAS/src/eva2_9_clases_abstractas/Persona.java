/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_clases_abstractas;

/**
 *
 * @author Javis
 */
public abstract class Persona {
    private String name;
    private String l_name;
    private int age;

    public Persona(String name, String l_name, int age) {
        this.name = name;
        this.l_name = l_name;
        this.age = age;
    }

    public Persona() {
        this.name = "~~~~~~~~";
        this.l_name ="~~~~~~~~";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public abstract void imprimirDatos();
    
    
    
    
    
}
