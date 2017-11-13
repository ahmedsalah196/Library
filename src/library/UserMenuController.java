/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Amr Ayman
 */
public class UserMenuController implements Initializable {
    @FXML
    private JFXTextField name;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void getUser(String id){
        Borrower a = new Borrower("Not available","Not available","Not available","Not available","Not available","na.jpg");
        for(Borrower in:Library.users){
            //System.out.println(id);
            if(in.Username.equalsIgnoreCase(id)){
               a = in;
              
               break;
            }
        }
        
        // System.out.println(a.Username);
         name.setText(a.Username);
         a.Username = "Working";
        for(Borrower in:Library.users){
          System.out.println(in.Username);
        }
    }
    
}
