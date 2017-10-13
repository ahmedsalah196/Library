/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextArea;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Amr Ayman
 */
public class BookViewController implements Initializable {
@FXML
Label title;
@FXML
Label Genre;
@FXML
Label author;
@FXML
ImageView cover;
@FXML
JFXTextArea summ;
@FXML
Label isbn;
@FXML
Label pub;
@FXML
 Label q;       
 
 String des = "One of the most celebrated and popular historical romances ever written. The Three Musketeers tell the story of the early adventures of the young Gascon gentleman d'Artagnan and his three friends from the regiment of the King's Musketeers: Athos, Porthos, and Aramis.\n" +
"\n" +
"Under the watchful eye of their patron M. de Treville, the four defend the honour of the regiment against the guards of the Cardinal Richelieu and the honor of the queen against the machinations of the Cardinal himself as the power struggles of 17th-century France are vividly played out in the background.\n" +
"\n" +
"But their most dangerous encounter is with the Cardinal's spy: Milady, one of literature's most memorable female villains.";
Book b = new Book("The Three Musketeers","Alexandre Dumas",des,"13j3n32","Fiction","Penguin books","threemusket.jpg");
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb)  {
        
        
       System.out.println("hi");

     
     
       ini();
    }    
    
     @FXML
    private void ini()  {
       
        title.setText(b.Title);
        author.setText(b.Author);
        Genre.setText(b.Genre);
        cover.setImage(b.image);
        summ.setText(b.Description);
        q.setText(Integer.toString(b.quantity));
        pub.setText(b.Publisher);
        isbn.setText(b.ISBN);
        summ.setEditable(false);
     
        
    }
    
    
}
