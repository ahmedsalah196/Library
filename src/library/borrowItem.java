/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Amr Ayman
 */
public class borrowItem {
    
    public String username;
    public String bookISBN;
    public String bookName;
   
    
    public borrowItem(String u , String i , String n){
        this.username = u;
        this.bookISBN = i;
        this.bookName = n;
    }
}
