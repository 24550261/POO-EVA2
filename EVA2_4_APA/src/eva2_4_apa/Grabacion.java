/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_apa;

/**
 *
 * @author Javis
 */
public class Grabacion extends FICHASAPA{
    private String interprete;
    private String state;
    private String country;

    public Grabacion(String interprete, String state, String country) {
        this.interprete = interprete;
        this.state = state;
        this.country = country;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public void imprimirDatos(){
        System.out.println(" Title: "+getTitle());
        System.out.println(" Year "+getYear());
        System.out.println(" Author: "+getAuthor());
        System.out.println(" Interprete: "+ interprete);
        System.out.println(" Country: "+country);
        System.out.println(" State: "+state);
        System.out.println(" City: "+getCity());
    }
    
    
}
