/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_apa;

/**
 *
 * @author Javis
 */
public class FICHASAPA {
    private String author;
    private String title;
    private int year;
    private String city;

    public FICHASAPA(String author, String title, int year, String city) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.city = city;
    }

    public FICHASAPA() {
        this.author = "-----";
        this.title = "-----";
        this.year = 0;
        this.city = "-----";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
    
    
    
    
    
    
    
}
