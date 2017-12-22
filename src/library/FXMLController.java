package library;


import insidefx.undecorator.Undecorator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class FXMLController implements Initializable {
   
    
    @FXML
    private void handleSearchButtonAction(ActionEvent event) {
try {
    System.out.println("here");
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("Search.fxml"));
            
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
    @FXML
     private void handleProfileButtonAction(ActionEvent event) {
          FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("USER_FXML.fxml"));
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
      private void handleListButtonAction(ActionEvent event) {
FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("BorrowerList_FXML.fxml"));
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
       private void handleStockButtonAction(ActionEvent event) {
         FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("stock.fxml"));
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
       private void bookbutton(ActionEvent event) {
         FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("BookView.fxml"));
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
       
        private void openReg(ActionEvent event) {
       FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("RegUsers.fxml"));
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
      private void add(ActionEvent event){
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("add.fxml"));
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
      private void logout(ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("login.fxml"));
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
        // TODO
    }    
    
}


