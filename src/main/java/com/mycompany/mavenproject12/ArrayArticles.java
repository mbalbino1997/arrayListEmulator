/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject12;

/**
 *
 * @author maxy1
 */
public class ArrayArticles extends Article {
    Article[] articles=new Article[10];
    int count=0;

    public ArrayArticles(String autor, String title, String description, String text) {
        super(autor, title, description, text);
    }

    
    public Article[] copyArticle(Article[] articles) {
       Article[] articlesNew = new Article[articles.length*2];
       for(int i=0;i<articles.length;i++) {
           articlesNew[i]=articles[i];
       }
       return articlesNew;
   }
     public void add(Article article) {
       if(count==articles.length) {
           articles=this.copyArticle(articles);
          
       }
       articles[count]=article;
       count++;
       
       
   }
    
}
