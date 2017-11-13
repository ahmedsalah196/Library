/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ahmedsalah
 */
public class LoginController implements Initializable {

 
    @FXML
    private JFXTextField loginID;
    @FXML
    private JFXPasswordField loginPassword;
    @FXML
    private AnchorPane main;

    @FXML
    private AnchorPane pane;

    @FXML
    private void handleLibrarianButtonAction(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Library_FXML.fxml"));
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //FXMLController d = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //d.getUser(loginID.getText());
        System.out.println(loginID.getText());
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
    private void handleBorrowerButtonAction(ActionEvent event) {
        JFXSnackbar snack = new JFXSnackbar(pane);
        FXMLLoader loader = new FXMLLoader();
       

        // BorrowerInterface_FXMLController d = loader.getController();
        BorrowerInterface_FXMLController d = loader.getController();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        for(int i = 0; i < Library.users.size(); i++) {
            if (loginID.getText().equalsIgnoreCase(Library.users.get(i).Username)) {
                if (loginPassword.getText().equals(Library.users.get(i).password)) {
                    
                    loader.setLocation(getClass().getResource("borrowerInterface_FXML.fxml"));
                    try {
                        loader.load();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //d.getUser(Library.users.get(i));

                } else {
                    System.out.println("NOO");
                    snack.show("Invalid Password",3000);

                }
                break;
            }  
            if(i== Library.users.size()-1)
            {
               snack.show("Invalid Username",3000);
            }
        }

        // d.getUsername(loginID.getText());
        //d.getPassword(passID.getText());
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

    
}
