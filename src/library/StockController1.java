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
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

class info{
    String ISBN,Title,Genre;

    public info(String ISBN, String Title, String Genre) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Genre = Genre;
    }
    
}
public class StockController1 implements Initializable {
    private TableView<info> result;
    private JFXTextField input;
    private TableColumn isbn,title,genre;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void searchBook(){
        
        System.out.println("library.StockController1.searchBook()");
        Library searchable=new Library();
        ArrayList <Book> returned = searchable.search(input.getPromptText());
        for (Book book : returned) {
            result.getItems().add(0,new info(book.ISBN,book.Title,book.Genre));
                    }
}
}
