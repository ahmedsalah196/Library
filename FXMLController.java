/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Yasmin
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLController implements Initializable {
   
    

    
    @FXML
    private void handleSearchButtonAction(ActionEvent event) {
        System.out.println("search");
       
    }
    @FXML
     private void handleProfileButtonAction(ActionEvent event) {
         System.out.println("profile");
       
    }
     @FXML
      private void handleListButtonAction(ActionEvent event) {
         System.out.println("list");
       
    }
      @FXML
       private void handleStockButtonAction(ActionEvent event) {
         System.out.println("stock");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


