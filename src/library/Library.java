/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import insidefx.undecorator.Undecorator;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

/**
 *
 * @author ahmedsalah
 */
public class Library extends Application {
    
     public static ArrayList<Book> bookList = new ArrayList<Book>();
     public static ArrayList<Borrower> users = new ArrayList<Borrower>();
     public static ArrayList<borrowItem> borrowList = new ArrayList<borrowItem>();
     public ObservableList<info> search(String str){
      str.toLowerCase();
     ObservableList<info> searched= FXCollections.observableArrayList();
         for (Book book : bookList) {
             String title = book.Title.toLowerCase();
              int cnt=0;
             for(int i=0;i<title.length()-str.length()+1;i++){
                 if(cnt==-1)break;
                 cnt=0;
                 for(int j=0;j<str.length();j++){
                      if(str.charAt(j)==title.charAt(i+j)||str.charAt(j)==title.charAt(i+j)-32)cnt++;
                    if(cnt==str.length()){
                        cnt=-1;
                        searched.add(new info(book.ISBN,book.Title,book.Genre));
                        break;
                    }
                 }
             }
         }
         return searched;
     }
     @Override
    public void start(Stage stage) throws Exception {

        
      Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        
        /*Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();*/

                String des = "One of the most celebrated and popular historical romances ever written. The Three Musketeers tell the story of the early adventures of the young Gascon gentleman d'Artagnan and his three friends from the regiment of the King's Musketeers: Athos, Porthos, and Aramis.\n" +
"\n" +
"Under the watchful eye of their patron M. de Treville, the four defend the honour of the regiment against the guards of the Cardinal Richelieu and the honor of the queen against the machinations of the Cardinal himself as the power struggles of 17th-century France are vividly played out in the background.\n" +
"\n" +
"But their most dangerous encounter is with the Cardinal's spy: Milady, one of literature's most memorable female villains.";
  String hpdes = "Harry Potter is lucky to reach the age of thirteen, since he has already survived the murderous attacks of the feared Dark Lord on more than one occasion. But his hopes for a quiet term concentrating on Quidditch are dashed when a maniacal mass-murderer escapes from Azkaban, pursued by the soul-sucking Dementors who guard the prison. It's assumed that Hogwarts is the safest place for Harry to be. But is it a coincidence that he can feel eyes watching him in the dark, and should he be taking Professor Trelawneys ghoulish predictions seriously?";
  String tresdes = "The most popular pirate story ever written in English, featuring one of literature’s most beloved “bad guys,” Treasure Island has been happily devoured by several generations of boys—and girls—and grownups. Its unforgettable characters include: young Jim Hawkins, who finds himself owner of a map to Treasure Island, where the fabled pirate booty is buried; honest Captain Smollett, heroic Dr. Livesey, and the good-hearted but obtuse Squire Trelawney, who help Jim on his quest for the treasure; the frightening Blind Pew, double-dealing Israel Hands, and seemingly mad Ben Gunn, buccaneers of varying shades of menace; and, of course, garrulous, affable, ambiguous Long John Silver, who is one moment a friendly, laughing, one-legged sea-cook . . . and the next a dangerous pirate leader!";
  String sevdes = "The 7 Habits of Highly Effective People, first published in 1988, is a business and self-help book written by Stephen R. Covey.[1] Covey presents an approach to being effective in attaining goals by aligning oneself to what he calls \"true north\" principles of a character ethic that he presents as universal and timeless.\n" +
"\n" +
"Covey defines effectiveness as balancing obtaining desirable results with caring for that which produces the desirable results. He illustrates this by referring to the fable of the \"Goose That Laid the Golden Eggs\". He further claims that effectiveness can be expressed in terms of the P/PC ratio, where P refers to getting desired results and PC is caring for that which produces the results.";
 String mesdes = "Introducing one of the most famous characters in literature, Jean Valjean—the noble peasant imprisoned for stealing a loaf of bread—Les Misérables ranks among the greatest novels of all time. In it, Victor Hugo takes readers deep into the Parisian underworld, immerses them in a battle between good and evil, and carries them to the barricades during the uprising of 1832 with a breathtaking realism that is unsurpassed in modern prose. Within his dramatic story are themes that capture the intellect and the emotions: crime and punishment, the relentless persecution of Valjean by Inspector Javert, the desperation of the prostitute Fantine, the amorality of the rogue Thénardier, and the universal desire to escape the prisons of our own minds. Les Misérables gave Victor Hugo a canvas upon which he portrayed his criticism of the French political and judicial systems, but the portrait that resulted is larger than life, epic in scope—an extravagant spectacle that dazzles the senses even as it touches the heart.";
  Book b = new Book("The Three Musketeers","Alexandre Dumas",des,"1","Fiction","Penguin books","threemusket.jpg");
Book b1 = new Book("Harry Potter and The Prisoner of Askabaan","JK Rowling",hpdes,"2","Fantasy","Amr books","hp.jpg");
Book b2 = new Book("Treasure Island","Robert Louis Stevenson",tresdes,"3","Fiction","Amr books","tres.jpg");
Book b3 = new Book("seven habits of highly effective people"," Stephen R. Covey",sevdes,"4","Education","Mamdouh books","seven.jpg");
Book b4 = new Book("Les Miserables","Victor Hugo",mesdes,"5","Fiction","Amr books","lesmes_.jpg");
  Borrower a1 = new Borrower("Amr","Ayman","","a","1","amr");
  Borrower a2 = new Borrower("Amr","VeryAyman","","a","2","loay");
  Borrower a3 = new Borrower("Amr","ExtremleyAyman","","a","3","salah");
  
  users.add(a1);
  users.add(a2);
  users.add(a3);
  bookList.add(b);
  bookList.add(b1);
  bookList.add(b2);
  bookList.add(b3);
  bookList.add(b4);
  
  
 Undecorator undecorator = new Undecorator(stage, (Region) root);
 
// Default theme
 undecorator.getStylesheets().add("skin/undecorator.css");
 Scene scene1 = new Scene(undecorator);
 stage.initStyle(StageStyle.TRANSPARENT);
 scene1.setFill(Color.TRANSPARENT);
stage.setScene(scene1);
stage.show();

        stage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
