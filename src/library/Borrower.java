/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author Yasmin
 */
public class Borrower {
    public String firstName;
    public String lastName;
    public String birthdate;
    public String Username;
    public String email;
    public String cardNumber;
    public int numOfBooks = 0;
    public String password;
    boolean blacklisted = false;
    public ArrayList<Book> borrowHistory = new ArrayList<Book>();
    
    public Borrower(String f, String l, String b, String e, String c, String u, String p){
    this.firstName=f;
    this.lastName=l;
    this.birthdate=b;
    this.email=e;
    this.cardNumber=c;
    this.Username = u;
    this.password=p;
    }
    
    public void borrowBook(Book b){
        if(!blacklisted){
            borrowHistory.add(b);
        }
    }
}
