/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_apa;

/**
 *
 * @author Javis
 */
public class LIBRO extends FICHASAPA{
    private String editorial;

    public LIBRO(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void imprimirDatos(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Editorial: "+editorial);
        System.out.println("City: "+getCity() );
        System.out.println("Year: "+getYear() );
        
    }
    
    
}
