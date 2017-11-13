/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yasmin
 */
public class BorrowerList_FXMLController implements Initializable {
  @FXML
    private TextField username;
  
  @FXML
    private TextField isbn;
  @FXML
    private TextField bookname;
  
  @FXML
    private TextField rdate;
  @FXML
  private AnchorPane rootpane;
  
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        
    }    
     @FXML
    private void back(ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("Library_FXML.fxml"));
         try {
             loader.load();       
        } catch(Exception e) {
           e.printStackTrace();
          }
         
             //FXMLController d = loader.getController();
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                //d.getUser(loginID.getText());
                //System.out.println(loginID.getText());
         Parent root1 = loader.getRoot();            
            Undecorator undecorator = new Undecorator(stage, (Region) root1);
 
// Default theme
 undecorator.getStylesheets().add("skin/undecorator.css");
 Scene scene1 = new Scene(undecorator);
 scene1.setFill(Color.TRANSPARENT);
stage.setScene(scene1);
stage.show();
        stage.setResizable(false);

    }
    
    
    @FXML
       private void borrowBook(ActionEvent event) {
          JFXSnackbar snack = new JFXSnackbar(rootpane);
           Borrower a = new Borrower("Not available","Not available","Not available","Not available","Not available","na.jpg");
           Book b = new Book("Not available","Not available","Not available","Not available","Not available","Not available","na.jpg");
         for(Book in:Library.bookList){
        
            if(in.ISBN.equalsIgnoreCase(isbn.getText())){
               b = in;
              // System.out.println(b.Author);
               break;
            }
        }
         
            for(Borrower in:Library.users){
            //System.out.println(id);
            if(in.Username.equalsIgnoreCase(username.getText())){
               a = in;
              
               break;
            }
        }
           
           if(a.firstName=="Not available"){
               
               snack.show("Not a vaild User",3000);
               
           }
           
           else if(b.Author=="Not available")
           {
                 snack.show("Not a vaild Book",3000);
           }
             
           else if(b.available==false){
                snack.show("Book is reserved",3000);
           }
           
           else{
                 Library.borrowList.add(new borrowItem(a.Username,b.ISBN,b.Title));
               a.borrowHistory.add(b);
               b.available = false;
               for(Book in: a.borrowHistory){
                     System.out.println(in.Author);
               }
           }
               
           
          
           
       }
    
    
}
