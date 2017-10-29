
package library;

import com.jfoenix.controls.JFXTextArea;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
 String s;
 
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb)  {
       System.out.println("hi");
       //ini();
        title.setText(s);
    }    
    
    
     public void getBook(String i){
        Book b = new Book("Not available","Not available","Not available","Not available","Not available","Not available","na.jpg");
         for(Book in:Library.bookList){
            System.out.println(i);
            if(in.ISBN.equalsIgnoreCase(i)){
               b = in;
               System.out.println(b.Author);
               break;
            }
        }
      
      this.s = b.Title;
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
 
    private void func(){
        title.setText(s);
    }
    @FXML
    private void back(ActionEvent event){
        try {
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("stock.fxml"));
            
            Scene clerkScene = new Scene(clerkRoot);
            String css=Library.class.getResource("main.css").toExternalForm();
            clerkScene.getStylesheets().add(css);
            Stage clerkStage=(Stage)((Node)event.getSource()).getScene().getWindow();
            clerkStage.setScene(clerkScene);
            clerkStage.show();
        } catch (IOException ex) {
         
            System.out.println(ex.toString());
        }
    }
    
   
    
   
      public void init(Book b)  {
       // System.out.println(b.Title);
       
        /*author.setText(b.Author);
        Genre.setText(b.Genre);
        cover.setImage(b.image);
        summ.setText(b.Description);
        q.setText(Integer.toString(b.quantity));
        pub.setText(b.Publisher);
        isbn.setText(b.ISBN);
        summ.setEditable(false);*/
        
    }
}
