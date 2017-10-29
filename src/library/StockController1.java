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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.input.KeyEvent;
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
        input.deselect();
       //isbn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
        title.setCellValueFactory(cellData -> cellData.getValue().getTitle());
        genre.setCellValueFactory(cellData -> cellData.getValue().getGenre());
        isbn.setCellValueFactory(cellData -> cellData.getValue().getISBN());
        
fill();
    }    
    private void fill(){
        ObservableList <info> content=FXCollections.observableArrayList();
        ArrayList<Book> blist=Library.bookList;
        for(int i=0;i<blist.size();i++){
            Book tmp=blist.get(i);
            content.add(new info(tmp.ISBN,tmp.Title,tmp.Genre));
        }
        result.setItems(content);
     
    }
    @FXML
    public void searchBook(){
        input.textProperty().addListener((observable, oldText, newText)->{ // lambda style
        if(newText.isEmpty())fill();
                else{
        Library searchable=new Library();
        System.out.println(newText);
        ObservableList <info> returned = searchable.search(newText);
        result.setItems(returned);
        }
        });;  

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
