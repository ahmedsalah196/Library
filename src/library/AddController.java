/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXSnackbar;
import insidefx.undecorator.Undecorator;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author Amr Ayman
 */
public class AddController implements Initializable {

     @FXML
    private TableView<bookRequest> result;
  @FXML
    private TextField name;
   @FXML
    private TextField isbn;
    @FXML
    private TextField genre;
     @FXML
    private TextField pub;
      @FXML
    private TextField author;
      @FXML
      private TextArea des;
  @FXML
  private AnchorPane rootpane;
  String c = "";
  Image image;
   @FXML
    private TableColumn<bookRequest, String> bname,bauthor;
   final FileChooser fileChooser = new FileChooser();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        bname.setCellValueFactory(cellData -> cellData.getValue().getName());
       bauthor.setCellValueFactory(cellData -> cellData.getValue().getAuthor());
       
       result.setItems(Library.req);
    }    
    
    
    @FXML
       private void cover(ActionEvent event){
             Stage primaryStage = new Stage();
      
                  File file = fileChooser.showOpenDialog(primaryStage);
                if (file == null) {
                   return;
                     }   
                  c = file.getAbsoluteFile().getAbsolutePath();
                     
                  
                  
                  //Set extension filter
            FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
            FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
            fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
                  
                  
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                 image = SwingFXUtils.toFXImage(bufferedImage, null);
                
            } catch (IOException ex) {
                //Logger.getLogger(JavaFXPixel.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
       }
       @FXML
        private void add(ActionEvent event){
            if(!c.equalsIgnoreCase("")){
                
            
            Book b = new Book(name.getText(),author.getText(),des.getText(),isbn.getText(),genre.getText(),pub.getText(),image,true);
            Library.bookList.add(b);
            
            
           for(bookRequest r : Library.req){
               if(r.getName().getValue().equalsIgnoreCase(b.Title)){
                   Library.req.remove(r);
                         
               }
              
           }
            }
            
            else{
                 Book b = new Book(name.getText(),author.getText(),des.getText(),isbn.getText(),genre.getText(),pub.getText(),"na.jpg");
                  Library.bookList.add(b);
                   for(bookRequest r : Library.req){
               if(r.getName().getValue().equalsIgnoreCase(b.Title)){
                   Library.req.remove(r);
                    
               }
              
           }
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
