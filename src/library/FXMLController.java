package library;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
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
          try {
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("USER_FXML.fxml"));
            
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
      private void handleListButtonAction(ActionEvent event) {

<<<<<<< HEAD

=======
>>>>>>> 42455e9d4d3c6e746ae4577a954fcad0f6d9ac3b
        try {
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("BorrowerList_FXML.fxml"));
            
            Scene clerkScene = new Scene(clerkRoot);
            String css=Library.class.getResource("main.css").toExternalForm();
            clerkScene.getStylesheets().add(css);
            Stage clerkStage=(Stage)((Node)event.getSource()).getScene().getWindow();
            clerkStage.setScene(clerkScene);
            clerkStage.show();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
<<<<<<< HEAD


 try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BorrowerList_FXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
=======
>>>>>>> 42455e9d4d3c6e746ae4577a954fcad0f6d9ac3b

       
    }
      @FXML
       private void handleStockButtonAction(ActionEvent event) {
         try {
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("Stockato.fxml"));
            
            Scene clerkScene = new Scene(clerkRoot);
            String css=Library.class.getResource("main.css").toExternalForm();
            clerkScene.getStylesheets().add(css);
            Stage clerkStage=(Stage)((Node)event.getSource()).getScene().getWindow();
            clerkStage.setScene(clerkScene);
            clerkStage.show();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
       
<<<<<<< HEAD




       
    }
       
=======
       }   
>>>>>>> 42455e9d4d3c6e746ae4577a954fcad0f6d9ac3b
         @FXML
       private void bookbutton(ActionEvent event) {
         try {



        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookView.fxml"));

                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(Exception e) {
           e.printStackTrace();
          }
       
    }
       
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


