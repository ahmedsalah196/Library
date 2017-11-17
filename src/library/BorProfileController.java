/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

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
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Farida Abouish
 */
public class BorProfileController implements Initializable {
    
     @FXML
    private Label Fname;
    @FXML
    private Label Lname;
    @FXML
    private Label Username;
    @FXML
    private Label CardNum;
    @FXML
    private Label BirthDate;
    

   @FXML
    private void Borrback(ActionEvent event){
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
        Fname.setText(LoginController.user.firstName);
        Lname.setText(LoginController.user.lastName);
        Username.setText(LoginController.user.Username);
        CardNum.setText(LoginController.user.cardNumber);
        BirthDate.setText(LoginController.user.birthdate);
    }    
    
}
