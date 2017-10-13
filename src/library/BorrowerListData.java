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

  
    
  
}
