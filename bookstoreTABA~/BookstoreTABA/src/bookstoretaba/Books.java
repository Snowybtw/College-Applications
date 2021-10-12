/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoretaba;

import java.io.Serializable;

/** TABA Assignment
 * student number : x19227451
 * @author callum_snow 
 */
public class Books implements Serializable {
    private String title;
    private String author;
   private Double cost; 
    private String narrator; 
    private String filetype;
    
    public Books (){
       title="";
       author="";
       narrator="";
       filetype="";
    }

    

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    
           
}
