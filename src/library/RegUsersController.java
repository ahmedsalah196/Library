/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Amr Ayman
 */


public class RegUsersController implements Initializable {
  @FXML
    JFXTextField fname;
    @FXML
    JFXTextField lname;
    @FXML
    JFXTextField bdate;
    @FXML
    JFXTextField num;
    @FXML
    JFXTextField email;

    /**
     * Initializes the controller class.
     */
    
   ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    
    
     @FXML

    private void reg(ActionEvent event){
       Library.users.add(new Borrower(fname.getText(),lname.getText(),bdate.getText(),email.getText(),num.getText()));
       for(int i = 0 ; i <Library.users.size();i++){
           System.out.print(Library.users.get(i).firstName);
       }
    }
    
}
