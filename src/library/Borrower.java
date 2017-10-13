/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Yasmin
 */
public class Borrower {
    public String firstName;
    public String lastName;
    public String birthdate;
    public String email;
    public String cardNumber;
    public int numOfBooks;
    boolean blacklisted;
    
    public Borrower(String f, String l, String b, String e, String c, int n, boolean bl){
    this.firstName=f;
    this.lastName=l;
    this.birthdate=b;
    this.email=e;
    this.cardNumber=c;
    this.numOfBooks=n;
    this.blacklisted=bl;
    }
}
