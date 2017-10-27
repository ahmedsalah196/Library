/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author LoayHamdy
 */
public class StockController1 implements Initializable {
    private TableView<Book> result;
    private JFXTextField input;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void searchBook(){
        
        System.out.println("library.StockController1.searchBook()");
        Library searchable=new Library();
        ArrayList <Book> returned = searchable.search(input.getText());
        for (Book book : returned) {
            result.getItems().add(book);
        }
}
}
