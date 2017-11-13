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
    public String bdate;
    public String retdate;
   
    
    public borrowItem(String u , String i , String n,String b , String r){
        this.username = u;
        this.bookISBN = i;
        this.bookName = n;
        this.retdate  = r;
        this.bdate = b;
    }
}
