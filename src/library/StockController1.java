/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


   
public class StockController1 implements Initializable {
    @FXML
    private TableView<info> result;
    @FXML
    private JFXTextField input;
    @FXML
    private JFXTextField bookISBN;
    @FXML
    private TableColumn<info, String> isbn,title,genre;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       //isbn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        title.setCellValueFactory(cellData -> cellData.getValue().getTitle());
        genre.setCellValueFactory(cellData -> cellData.getValue().getGenre());
        isbn.setCellValueFactory(cellData -> cellData.getValue().getISBN());
        
     
        //result.getColumns().addAll(isbn);
    }    
    public void searchBook(){
        
        System.out.println("library.StockController1.searchBook()");
        Library searchable=new Library();
        //result.getItems().clear();
        System.out.println(input.getText());
        ObservableList <info> returned = searchable.search(input.getText());
        for(info in:returned){
            //System.out.println(in.Title);
        }
        
        result.setItems(returned);  
        //result.refresh();
}
    
        @FXML
       private void openBook(ActionEvent event) {
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("BookView.fxml"));
         try {
             loader.load();
          
        
     
                
        } catch(Exception e) {
           e.printStackTrace();
          }
         
             BookViewController d = loader.getController();
      System.out.println(bookISBN.getText());
                d.getBook(bookISBN.getText());
         Parent root1 = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.showAndWait();
   
       
    }
     @FXML
    private void back(ActionEvent event){
        try {
            Parent clerkRoot = FXMLLoader.load(getClass().getResource("Library_FXML.fxml"));
            
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
    
}
