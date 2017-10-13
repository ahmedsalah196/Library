
package library;

/**
 *
 * @author Amr Ayman
 */
public class Book {
    public String Title;
    public String Author;
    public String Description;
    public String ISBN;
    public String Genre;
    public int quantity;
    public float rating;
    
    
    public Book(String t , String a , String d , String i ,String g){
        this.Title = t;
        this.Author = a;
        this.Description = d;
        this.ISBN = i;
        this.Genre = g;
    }
    
    public void calcRating(){
        
    }
    
    public void checkAvaialbilty(){
        
    }
    
    
    
}
