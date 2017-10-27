/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Yasmin
 */
public class BorrowerListData {
    private final ObservableList<Borrower> data = 
      FXCollections.observableArrayList();
  
  public ObservableList<Borrower> getData() {
    return data;
  }

  public BorrowerListData() {
    data.add(new Borrower("Chris", "Evans","13/6/1981","chris.evans81@gmail.com","3405"));
    data.add(new Borrower("Jennifer", "Aniston","11/2/1969","jen_aniston@gmail.com","3210" ));
   
    
  }

}
