/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject12;

/**
 *
 * @author maxy1
 */
public class Blog extends ArrayArticles {

    public Blog(String autor, String title, String description, String text) {
        super(autor, title, description, text);
    }
   
    public void addArticle(Article article) {
       super.add(article);
    } 
    
    public String toString(int i) {
        
        
    return articles[i].getAutor()+" "+articles[i].getDescription()+" "+articles[i].getText();
            }
        
       
      
      

    
    
}
