/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXSnackbar;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 * FXML Controller class
 *
 * @author Yasmin
 */

class info2 {
    
    private final StringProperty user;
    private final StringProperty i;
    private final StringProperty b;
    private final StringProperty r;
    
        public info2() {
        this(null, null,null,null);
    }
    public info2(String ISBN, String Title, String Genre, String x) {
        this.user =  new SimpleStringProperty(ISBN);
        this.i =  new SimpleStringProperty(Title);
        this.b =  new SimpleStringProperty(Genre);
        this.r = new SimpleStringProperty(x);
    }
    
     public StringProperty getUser() {
        return user;
    }

    public StringProperty getISBN() {
         return i;
    }
    
      public StringProperty getBorrow() {
         return b;
    }
        public StringProperty getReturn() {
         return r;
    }
       public void seUser(String lastName) {
        this.user.set(lastName);
    }
       public void setISBN(String lastName) {
        this.i.set(lastName);
    }
        public void setBorrow(String lastName) {
        this.b.set(lastName);
    }
      public void setReturn(String lastName) {
        this.r.set(lastName);
    }
    
}




public class BorrowerList_FXMLController implements Initializable {
  @FXML
    private TextField username;
  
  @FXML
    private TextField isbn;
  @FXML
    private TextField bookname;
   @FXML
    private TableView<info2> result;
  @FXML
    private TextField time;
  @FXML
  private AnchorPane rootpane;
   @FXML
    private TableColumn<info2, String> userfiled,isbnfield,borrowfield,returnfield;
  
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       userfiled.setCellValueFactory(cellData -> cellData.getValue().getUser());
       isbnfield.setCellValueFactory(cellData -> cellData.getValue().getISBN());
       borrowfield.setCellValueFactory(cellData -> cellData.getValue().getBorrow());
        returnfield.setCellValueFactory(cellData -> cellData.getValue().getReturn());
        
        fill();
    }    
    
    
    
      private void fill(){
        ObservableList <info2> content=FXCollections.observableArrayList();
        ArrayList<borrowItem> blist=Library.borrowList;
        for(int i=0;i<blist.size();i++){
            borrowItem tmp=blist.get(i);
            content.add(new info2(tmp.username,tmp.bookISBN,tmp.bdate,tmp.retdate));
        }
       result.setItems(content);
     
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
    
    
    @FXML
       private void borrowBook(ActionEvent event) {
          JFXSnackbar snack = new JFXSnackbar(rootpane);
           Borrower a = new Borrower("Not available","Not available","Not available","Not available","Not available","na.jpg","Not available");
           Book b = new Book("Not available","Not available","Not available","Not available","Not available","Not available","na.jpg");
         for(Book in:Library.bookList){
        
            if(in.ISBN.equalsIgnoreCase(isbn.getText())){
               b = in;
              // System.out.println(b.Author);
               break;
            }
        }
         
            for(Borrower in:Library.users){
            //System.out.println(id);
            if(in.Username.equalsIgnoreCase(username.getText())){
               a = in;
              
               break;
            }
        }
           
           if(a.firstName=="Not available"){
               
               snack.show("Not a vaild User",3000);
               
           }
           
           else if(b.Author=="Not available")
           {
                 snack.show("Not a vaild Book",3000);
           }
             
           else if(b.available==false){
                snack.show("Book is reserved",3000);
           }
           
           else{
               
               DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = Calendar.getInstance();
                String start = sdf.format(cal.getTime());
                int days = Integer.parseInt(time.getText());
                Calendar cal2 = (Calendar) cal.clone();
                b.borrowDate = (Calendar) cal.clone();
                cal2.add(Calendar.DAY_OF_MONTH, days);
                String finish =  sdf.format(cal2.getTime());
                 System.out.println(start +" " + finish);
                 Library.borrowList.add(new borrowItem(a.Username,b.ISBN,b.Title,start,finish));
                 b.returnDate = (Calendar) cal2.clone();
                 a.borrowHistory.add(b);
                 b.available = false;
               for(Book in: a.borrowHistory){
                     System.out.println(in.Author);
               }
               
               fill();
           }
               
           
          
           
       }
    
    
}
