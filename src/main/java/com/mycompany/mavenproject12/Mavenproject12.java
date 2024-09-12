/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

/**
 *
 * @author maxy1
 */
public class Mavenproject12 {

    public static void main(String[] args) {
        Article sunArticle = new Article("massimo", "sole", "c'è il sole", "fa caldo");
        Blog firstBlog = new Blog("Massimo", "Blog numero uno", "uno", "primo blog");
        firstBlog.addArticle(sunArticle);
        firstBlog.addArticle(sunArticle);
        firstBlog.addArticle(sunArticle);
        
        System.out.println(firstBlog.toString(2));
        
    }
}
