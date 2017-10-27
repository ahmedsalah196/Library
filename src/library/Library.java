/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 *
 * @author ahmedsalah
 */
public class Library extends Application {
    
     public static ArrayList<Book> bookList = new ArrayList<Book>();
     public static ArrayList<Borrower> users = new ArrayList<Borrower>();
    @Override
    public void start(Stage stage) throws Exception {
                String des = "One of the most celebrated and popular historical romances ever written. The Three Musketeers tell the story of the early adventures of the young Gascon gentleman d'Artagnan and his three friends from the regiment of the King's Musketeers: Athos, Porthos, and Aramis.\n" +
"\n" +
"Under the watchful eye of their patron M. de Treville, the four defend the honour of the regiment against the guards of the Cardinal Richelieu and the honor of the queen against the machinations of the Cardinal himself as the power struggles of 17th-century France are vividly played out in the background.\n" +
"\n" +
"But their most dangerous encounter is with the Cardinal's spy: Milady, one of literature's most memorable female villains.";
  String hpdes = "Harry Potter is lucky to reach the age of thirteen, since he has already survived the murderous attacks of the feared Dark Lord on more than one occasion. But his hopes for a quiet term concentrating on Quidditch are dashed when a maniacal mass-murderer escapes from Azkaban, pursued by the soul-sucking Dementors who guard the prison. It's assumed that Hogwarts is the safest place for Harry to be. But is it a coincidence that he can feel eyes watching him in the dark, and should he be taking Professor Trelawneys ghoulish predictions seriously?";
Book b = new Book("The Three Musketeers","Alexandre Dumas",des,"1","Fiction","Penguin books","threemusket.jpg");
Book b1 = new Book("Harry Potter and The Prisoner of Askabaan","JK Rowling","Fantasy",hpdes,"2","Amr books","hp.jpg");
  Borrower a1 = new Borrower("Amr","Ayman","","a","1");
  Borrower a2 = new Borrower("Amr","VeryAyman","","a","2");
  Borrower a3 = new Borrower("Amr","ExtremleyAyman","","a","3");
  

  bookList.add(b);
  bookList.add(b1);
        
  
  
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
