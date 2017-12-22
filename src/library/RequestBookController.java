/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Farida Abouish
 */
public class RequestBookController implements Initializable {
  
  @FXML
    private AnchorPane pane; 
 @FXML
    private JFXTextField  bookname;
  
  @FXML
    private JFXTextField author;
  @FXML
  
    private void back(ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("borrowerInterface_FXML.fxml"));
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
    }    
    
    @FXML
       private void reg(ActionEvent event){
            JFXSnackbar snack = new JFXSnackbar(pane);
           if(bookname.getText().equalsIgnoreCase("")||author.getText().equalsIgnoreCase("")){
               snack.show("Please enter the data",3000);
           }
           else{
               Library.req.add(new bookRequest(bookname.getText(),author.getText()));
               bookname.clear();
               author.clear();
               snack.show("Request submitted.", 3000);
           }
       }
}
