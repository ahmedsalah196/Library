/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 *
 * @author ahmedsalah
 */
public class Library extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< HEAD

        
      

       

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));


        

        

=======
         Parent root1 = FXMLLoader.load(getClass().getResource("BookView.fxml")); 
        Scene scene1 = new Scene(root1);
        stage.setScene(scene1);
        stage.show();
        stage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
>>>>>>> 42455e9d4d3c6e746ae4577a954fcad0f6d9ac3b
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
