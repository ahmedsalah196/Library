/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Yasmin
 */
public class BorrowerList_FXMLController implements Initializable {

     @FXML // fx:id="fname"
    private TableView<?> fname;

    @FXML // fx:id="lname"
    private TableColumn<?, ?> lname;

    @FXML // fx:id="book"
    private TableColumn<?, ?> book;

    @FXML // fx:id="date"
    private TableColumn<?, ?> date;
    
    @FXML // fx:id="returned"
    private TableColumn<?, ?> returned;
    
     @FXML // fx:id="email"
    private TableColumn<?, ?> email;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
