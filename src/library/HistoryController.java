/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextField;
import insidefx.undecorator.Undecorator;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Farida Abouish
 */
public class HistoryController implements Initializable {
    
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
        
        title.setCellValueFactory(cellData -> cellData.getValue().getTitle());
        genre.setCellValueFactory(cellData -> cellData.getValue().getGenre());
        isbn.setCellValueFactory(cellData -> cellData.getValue().getISBN());
       fill();
       result.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
                        Stage stage=new Stage();
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("BookView.fxml"));
         try {
             loader.load();       
        } catch(Exception e) {
           e.printStackTrace();
          }
         
             BookViewController d = loader.getController();
                d.getBook(newSelection.getISBN().getValue());
                //System.out.println(loginID.getText());
         Parent root1 = loader.getRoot();  
         stage.initStyle(StageStyle.TRANSPARENT);
            Undecorator undecorator = new Undecorator(stage, (Region) root1);
 
// Default theme
 undecorator.getStylesheets().add("skin/undecorator.css");
 Scene scene1 = new Scene(undecorator);
 scene1.setFill(Color.TRANSPARENT);
stage.setScene(scene1);
stage.show();
        stage.setResizable(false);

       
});
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
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                d.getBook(bookISBN.getText());
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
    private void back(ActionEvent event){
        FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("borrowerInterface_FXML.fxml"));
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
