/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextArea;
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
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Amr Ayman
 */


public class RegUsersController implements Initializable {
   @FXML
    private JFXTextField fname1;
    
    @FXML
    private JFXTextField lname;
    
    @FXML
    private JFXTextField userName;
    
     @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField bdate;

    @FXML
    private JFXTextField num;

    @FXML
    private JFXTextField pass;


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
       Library.users.add(new Borrower(fname1.getText(),lname.getText(),bdate.getText(),email.getText(),num.getText(),userName.getText(),pass.getText()));
       for(int i = 0 ; i <Library.users.size();i++){
           System.out.print(Library.users.get(i).firstName);
       }
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
    
}
