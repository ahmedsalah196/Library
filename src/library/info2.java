/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Amr Ayman
 */
class info {
    
    private final StringProperty ISBN;
    private final StringProperty Title;
    private final StringProperty Genre;
    
        public info() {
        this(null, null,null);
    }
    public info(String ISBN, String Title, String Genre) {
        this.ISBN =  new SimpleStringProperty(ISBN);
        this.Title =  new SimpleStringProperty(Title);
        this.Genre =  new SimpleStringProperty(Genre);
    }
    
     public StringProperty getISBN() {
        return ISBN;
    }

    public StringProperty getTitle() {
         return Title;
    }
    
      public StringProperty getGenre() {
         return Genre;
    }
      
       public void setISBN(String lastName) {
        this.ISBN.set(lastName);
    }
       public void setTitle(String lastName) {
        this.Title.set(lastName);
    }
        public void setGenre(String lastName) {
        this.Genre.set(lastName);
    }
    
}
