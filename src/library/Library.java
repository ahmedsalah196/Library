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
 String hp1des ="Harry Potter, a boy who learns on his eleventh birthday that he is the orphaned son of two powerful wizards and possesses unique magical powers of his own. He is summoned from his life as an unwanted child to become a student at Hogwarts, an English boarding school for wizards. There, he meets several friends who become his closest allies and help him discover the truth about his parents' mysterious deaths.";
 String hp2des = "The follow-up to \"Harry Potter and the Sorcerer's Stone\" finds young wizard Harry Potter and his friends, Ron and Hermione, facing new challenges during their second year at Hogwarts School of Witchcraft and Wizardry as they try to discover a dark force that is terrorizing the school.";
 String hp4des="Harry Potter is midway through his training as a wizard and his coming of age. Harry wants to get away from the pernicious Dursleys and go to the International Quidditch Cup. He wants to find out about the mysterious event that's supposed to take place at Hogwarts this year, an event involving two other rival schools of magic, and a competition that hasn't happened for a hundred years. He wants to be a normal, fourteen-year-old wizard. But unfortunately for Harry Potter, he's not normal - even by wizarding standards. ";
String hp5des="Harry Potter is due to start his fifth year at Hogwarts School of Witchcraft and Wizardry. His best friends Ron and Hermione have been very secretive all summer and he is desperate to get back to school and find out what has been going on. However, what Harry discovers is far more devastating than he could ever have expected. Suspense, secrets and thrilling action from the pen of J.K. Rowling ensure an electrifying adventure that is impossible to put down.";
String hp6des="The war against Voldemort is not going well: even Muggle governments are noticing. Ron scans the obituary pages of The Daily Prophet looking for familiar names. Dumbledore is absent from Hogwarts for long stretches of time, and the Order of the Phoenix has already suffered losses. And yet... As in all wars, life goes on. Sixth-year students learn to Apparate, and lose a few eyebrows in the process. The Weasley twins expand their business. Teenagers flirt and fight and fall in love. Classes are never straightforward, though Harry receives some extraordinary help from the mysterious Half-Blood Prince. So it's the home front that takes center stage in the multilayered sixth installment of the story of Harry Potter. Harry struggles to uncover the identity of the Half-Blood Prince, the past owner of a potions textbook he now possesses that is filled with ingenious, potentially deadly, spells. But Harry's life is suddenly changed forever when someone close to him is heinously murdered right before his eyes. With Dumbledore's guidance, he seeks out the full, complex story of the boy who became Lord Voldemort, and thereby attempts to find what may be his only vulnerability.";
String hp7des="It's no longer safe for Harry at Hogwarts, so he and his best friends, Ron and Hermione, are on the run. Professor Dumbledore has given them clues about what they need to do to defeat the dark wizard, Lord Voldemort, once and for all, but it's up to them to figure out what these hints and suggestions really mean.\n" +
"\n" +
"Their cross-country odyssey has them searching desperately for the answers, while evading capture or death at every turn. At the same time, their friendship, fortitude, and sense of right and wrong are tested in ways they never could have imagined. The ultimate battle between good and evil that closes out this final chapter of the epic series takes place where Harry's Wizarding life began: at Hogwarts. The satisfying conclusion offers shocking last-minute twists, incredible acts of courage, powerful new forms of magic, and the resolution of many mysteries.";
 String sevdes = "The 7 Habits of Highly Effective People, first published in 1988, is a business and self-help book written by Stephen R. Covey.[1] Covey presents an approach to being effective in attaining goals by aligning oneself to what he calls \"true north\" principles of a character ethic that he presents as universal and timeless.\n" +
"\n" +
"Covey defines effectiveness as balancing obtaining desirable results with caring for that which produces the desirable results. He illustrates this by referring to the fable of the \"Goose That Laid the Golden Eggs\". He further claims that effectiveness can be expressed in terms of the P/PC ratio, where P refers to getting desired results and PC is caring for that which produces the results.";
 String women="Once upon a time Martians and Venusians met, fell in love, and had happy relationships together because they respected and accepted their differences. Then they came to Earth and amnesia set in: they forgot they were from different planets.\n" +
"\n" +
"Based on years of successful counseling of couples and individuals, Men Are from Mars, Women Are from Venus has helped millions of couples transform their relationships. Now viewed as a modern classic, this phenomenal book has helped men and women realize how different they really are and how to communicate their needs in such a way that conflict doesn't arise and intimacy is given every chance to grow!!!!";
 String women2="Using his signature insight that has helped millions of couples transform their relationships, John Gray once again arms the inhabitants of Mars and Venus with information that will help them live harmoniously ever after. In Why Mars and Venus Collide, Gray focuses on the ways that men and women misinterpret and mismanage the stress in their daily lives, and how these reactions ultimately affect their relationships. \"It's not that he's just not into you; he needs to fulfill a biological need,\" Gray explains. \"And it's not that she wants to henpeck you; she also has a biological drive.\" He shows, for instance, how a husband's withdrawal is actually a natural way for him to replenish his depleted testosterone levels and restore his well-being, and how a woman's need for conversation and support helps her build her own stress-reducing hormone, oxytocin.\n" +
"\n" +
"Backed up by groundbreaking scientific research, Gray offers a clear, easy-to-understand program to bridgethe gap between the two planets, providing effective communication strategies that will actually lower stress levels. Whether in a relationship or single, this book will help both men and women understand their new roles in a modern, work-oriented society, and allow them to discover a variety of new and practical ways to create a lifetime of love and harmony.";
 String anne ="Discovered in the attic in which she spent the last years of her life, Anne Frank's remarkable diary has since become a world classic—a powerful reminder of the horrors of war and an eloquent testament to the human spirit.\n" +
"\n" +
"In 1942, with Nazis occupying Holland, a thirteen-year-old Jewish girl and her family fled their home in Amsterdam and went into hiding. For the next two years, until their whereabouts were betrayed to the Gestapo, they and another family lived cloistered in the \"Secret Annexe\" of an old office building. Cut off from the outside world, they faced hunger, boredom, the constant cruelties of living in confined quarters, and the ever-present threat of discovery and death.\n" +
"\n" +
"In her diary Anne Frank recorded vivid impressions of her experiences during this period. By turns thoughtful, moving, and amusing, her account offers a fascinating commentary on human courage and frailty and a compelling self-portrait of a sensitive and spirited young woman whose promise was tragically cut short.";
 String malala="I come from a country that was created at midnight. When I almost died it was just after midday.\n" +
"\n" +
"When the Taliban took control of the Swat Valley in Pakistan, one girl spoke out. Malala Yousafzai refused to be silenced and fought for her right to an education.\n" +
"\n" +
"On Tuesday, October 9, 2012, when she was fifteen, she almost paid the ultimate price. She was shot in the head at point-blank range while riding the bus home from school, and few expected her to survive. \n" +
"\n" +
"Instead, Malala's miraculous recovery has taken her on an extraordinary journey from a remote valley in northern Pakistan to the halls of the United Nations in New York. At sixteen, she has become a global symbol of peaceful protest and the youngest-ever Nobel Peace Prize laureate.\n" +
"\n" +
"I Am Malala is the remarkable tale of a family uprooted by global terrorism, of the fight for girls' education, of a father who, himself a school owner, championed and encouraged his daughter to write and attend school, and of brave parents who have a fierce love for their daughter in a society that prizes sons.";
 String kite="“It may be unfair, but what happens in a few days, sometimes even a single day, can change the course of a whole lifetime.\" \n" +
"\n" +
"Amir is the son of a wealthy Kabul merchant, a member of the ruling caste of Pashtuns. Hassan, his servant and constant companion, is a Hazara, a despised and impoverished caste. Their uncommon bond is torn by Amir's choice to abandon his friend amidst the increasing ethnic, religious, and political tensions of the dying years of the Afghan monarchy, wrenching them far apart. But so strong is the bond between the two boys that Amir journeys back to a distant world, to try to right past wrongs against the only true friend he ever had.\n" +
"\n" +
"The unforgettable, heartbreaking story of the unlikely friendship between a wealthy boy and the son of his father’s servant, The Kite Runner is a beautifully crafted novel set in a country that is in the process of being destroyed. It is about the power of reading, the price of betrayal, and the possibility of redemption; and an exploration of the power of fathers over sons—their love, their sacrifices, their lies.\n" +
"\n" +
"A sweeping story of family, love, and friendship told against the devastating backdrop of the history of Afghanistan over the last thirty years, The Kite Runner is an unusual and powerful novel that has become a beloved, one-of-a-kind classic.";
 String splendid ="At once an incredible chronicle of thirty years of Afghan history and a deeply moving story of family, friendship, faith, and the salvation to be found in love.\n" +
"\n" +
"Propelled by the same superb instinct for storytelling that made The Kite Runner a beloved classic, A Thousand Splendid Suns is at once an incredible chronicle of thirty years of Afghan history and a deeply moving story of family, friendship, faith, and the salvation to be found in love. \n" +
"\n" +
"Born a generation apart and with very different ideas about love and family, Mariam and Laila are two women brought jarringly together by war, by loss and by fate. As they endure the ever escalating dangers around them - in their home as well as in the streets of Kabul - they come to form a bond that makes them both sisters and mother-daughter to each other, and that will ultimately alter the course not just of their own lives but of the next generation. With heart-wrenching power and suspense, Hosseini shows how a woman's love for her family can move her to shocking and heroic acts of self-sacrifice, and that in the end it is love, or even the memory of love, that is often the key to survival.";
String davinci ="A fascinating and absorbing thriller -- perfect for history buffs, conspiracy nuts, puzzle lovers or anyone who appreciates a great, riveting story.\n" +
"\n" +
"While in Paris on business, Harvard symbologist Robert Langdon receives an urgent late-night phone call: the elderly curator of the Louvre has been murdered inside the museum. Near the body, police have found a baffling cipher. While working to solve the enigmatic riddle, Langdon is stunned to discover it leads to a trail of clues hidden in the works of Da Vinci -- clues visible for all to see -- yet ingeniously disguised by the painter.\n" +
"\n" +
"Langdon joins forces with a gifted French cryptologist, Sophie Neveu, and learns the late curator was involved in the Priory of Sion -- an actual secret society whose members included Sir Isaac Newton, Botticelli, Victor Hugo, and Da Vinci, among others.\n" +
"\n" +
"In a breathless race through Paris, London, and beyond, Langdon and Neveu match wits with a faceless powerbroker who seems to anticipate their every move. Unless Langdon and Neveu can decipher the labyrinthine puzzle in time, the Priory's ancient secret -- and an explosive historical truth -- will be lost forever.\n" +
"\n" +
"The Da Vinci Code heralds the arrival of a new breed of lightning-paced, intelligent thriller utterly unpredictable right up to its stunning conclusion.";
String symbol ="In this stunning follow-up to the global phenomenon The Da Vinci Code, Dan Brown demonstrates once again why he is the world's most popular thriller writer. The Lost Symbol is a masterstroke of storytelling - a deadly race through a real-world labyrinth of codes, secrets, and unseen truths...all under the watchful eye of Brown's most terrifying villain to date. Set within the hidden chambers, tunnels, and temples of Washington, DC., The Lost Symbol accelerates through a startling landscape toward an unthinkable finale.\n" +
"\n" +
"As the story opens, Harvard symbologist Robert Langdon is summoned unexpectedly to deliver an evening lecture in the U.S. Capitol Building. Within minutes of his arrival, however, the night takes a bizarre turn. A disturbing object - artfully encoded with five symbols - is discovered in the Capitol Building. Langdon recognizes the object as an ancient invitation...one meant to usher its recipient into a long-lost world of esoteric wisdom.";
String morrie="Maybe it was a grandparent, or a teacher or a colleague. Someone older, patient and wise, who understood you when you were young and searching, and gave you sound advice to help you make your way through it. For Mitch Albom, that person was Morrie Schwartz, his college professor from nearly twenty years ago.\n" +
"\n" +
"Maybe, like Mitch, you lost track of this mentor as you made your way, and the insights faded. Wouldn't you like to see that person again, ask the bigger questions that still haunt you? \n" +
"\n" +
"Mitch Albom had that second chance. He rediscovered Morrie in the last months of the older man's life. Knowing he was dying of ALS - or motor neurone disease - Mitch visited Morrie in his study every Tuesday, just as they used to back in college. Their rekindled relationship turned into one final 'class': lessons in how to live.";
String time ="The inventor of the world's first clock is punished for trying to measure God's greatest gift. He is banished to a cave for centuries and forced to listen to the voices of all who come after him seeking more days, more years. Eventually, with his soul nearly broken, Father Time is granted his freedom, along with a magical hourglass and a mission: a chance to redeem himself by teaching two earthly people the true meaning of time.\n" +
"\n" +
"He returns to our world - now dominated by the hour-counting he so innocently began - and commences a journey with two unlikely partners: one a teenage girl who is about to give up on life, the other a wealthy old businessman who wants to live forever. To save himself, he must save them both. And stop the world to do so.";
String it ="To the children, the town was their whole world. To the adults, knowing better, Derry, Maine was just their home town: familiar, well-ordered for the most part. A good place to live.\n" +
"\n" +
"It was the children who saw - and felt - what made Derry so horribly different. In the storm drains, in the sewers, IT lurked, taking on the shape of every nightmare, each one's deepest dread. Sometimes IT reached up, seizing, tearing, killing . . .\n" +
"\n" +
"The adults, knowing better, knew nothing.\n" +
"\n" +
"Time passed and the children grew up, moved away. The horror of IT was deep-buried, wrapped in forgetfulness. Until they were called back, once more to confront IT as IT stirred and coiled in the sullen depths of their memories, reaching up again to make their past nightmares a terrible present reality.";
String tattoo="A spellbinding amalgam of murder mystery, family saga, love story, and financial intrigue.\n" +
"\n" +
"It’s about the disappearance forty years ago of Harriet Vanger, a young scion of one of the wealthiest families in Sweden . . . and about her octogenarian uncle, determined to know the truth about what he believes was her murder.\n" +
"\n" +
"It’s about Mikael Blomkvist, a crusading journalist recently at the wrong end of a libel case, hired to get to the bottom of Harriet’s disappearance . . . and about Lisbeth Salander, a twenty-four-year-old pierced and tattooed genius hacker possessed of the hard-earned wisdom of someone twice her age—and a terrifying capacity for ruthlessness to go with it—who assists Blomkvist with the investigation. This unlikely team discovers a vein of nearly unfathomable iniquity running through the Vanger family, astonishing corruption in the highest echelons of Swedish industrialism—and an unexpected connection between themselves.";
String mesdes = "Introducing one of the most famous characters in literature, Jean Valjean—the noble peasant imprisoned for stealing a loaf of bread—Les Misérables ranks among the greatest novels of all time. In it, Victor Hugo takes readers deep into the Parisian underworld, immerses them in a battle between good and evil, and carries them to the barricades during the uprising of 1832 with a breathtaking realism that is unsurpassed in modern prose. Within his dramatic story are themes that capture the intellect and the emotions: crime and punishment, the relentless persecution of Valjean by Inspector Javert, the desperation of the prostitute Fantine, the amorality of the rogue Thénardier, and the universal desire to escape the prisons of our own minds. Les Misérables gave Victor Hugo a canvas upon which he portrayed his criticism of the French political and judicial systems, but the portrait that resulted is larger than life, epic in scope—an extravagant spectacle that dazzles the senses even as it touches the heart.";
Book b = new Book("The Three Musketeers","Alexandre Dumas",des,"1","Fiction","Penguin books","threemusket.jpg");
Book b1 = new Book("Harry Potter and The Prisoner of Azkaban","JK Rowling",hpdes,"2","Fantasy","Amr books","hp.jpg");
Book b2 = new Book("Treasure Island","Robert Louis Stevenson",tresdes,"3","Fiction","Amr books","tres.jpg");
Book b3 = new Book("Seven Habits of Highly Effective People"," Stephen R. Covey",sevdes,"4","Self-Help","Mamdouh books","seven.jpg");
Book b4 = new Book("Les Miserables","Victor Hugo",mesdes,"5","Fiction","Amr books","lesmes_.jpg");
Book b5= new Book ("Harry Potter and the Philosopher's Stone", "J.K Rowling", hp1des, "6", "Fantasy", "Amr Books","hp1.jpg");  
Book b6 = new Book ("Harry Potter and the Chamber of Secrets","J.K Rowling", hp2des, "7", "Fantasy", "Amr Books", "hp2.jpg");
Book b7 = new Book ("Harry Potter and the Goblet of Fire","J.K Rowling", hp4des, "8", "Fantasy", "Amr Books", "hp4.jpg");
Book b8 = new Book ("Harry Potter and the Order of the Phoenix","J.K Rowling", hp5des, "9", "Fantasy", "Amr Books", "hp5.jpg");
Book b9 = new Book ("Harry Potter and the Half Blood Prince","J.K Rowling", hp6des, "10", "Fantasy", "Amr Books", "hp6.jpg");
Book b10 = new Book ("Harry Potter and the Deathley Hallows","J.K Rowling", hp7des, "11", "Fantasy", "Amr Books", "hp7.jpg");
Book b11 = new Book ("The Da Vinci Code", "Dan Brown", davinci, "12","Thriller","Yasmin Books","davinci.jpg");
Book b12 = new Book ("The Lost Symbol", "Dan Brown", symbol, "13","Thriller","Yasmin Books","symbol.jpg");
Book b13 = new Book ("Men are from Mars, Women are from Venus", "John Gray",women,"14","Self-Help","Sarah Books","women.jpg");
Book b14 = new Book ("Why Mars and Venus Collide", "John Gray",women2,"15","Self-Help","Sarah Books","women2.jpg");
Book b15 = new Book ("Tuesdays with Morrie", "Mitch Albom", morrie,"16", "Biography","Sarah Books","morrie.jpg");
Book b16= new Book ("The Time Keeper","Mitch Albom",time, "17","Fiction","Sarah Books","TimeKeeper.jpg");
Book b17= new Book ("A Thousand Splendid Suns", "Khaled Hosseini",splendid, "18","Drama","Yasmin Books","splendid.jpg");
Book b18= new Book ("The Kite Runner", "Khaled Hosseini",kite, "19","Drama","Yasmin Books","The Kite Runner.jpe");
Book b19 = new Book ("IT", "Stephen King",it,"20","Thriller","Yasmin Books","IT.jpg");
Book b20 = new Book ("I Am Malala", "Malala Yousafzai",malala,"21","Biography","Sarah Books","malala.jpg");
Book b21 = new Book ("The Diary of a Young Girl", "Anne Frank",anne,"22","Biography","Yasmin Books","anne frank.jpg");
Book b22 = new Book ("The Girl with the Dragon Tattoo","Stieg Larsson",tattoo,"23","Thriller","Sarah Books","tattoo.jpg");

Borrower a1 = new Borrower("Amr","Ayman","","a","1","amr","123");
Borrower a2 = new Borrower("Loay","VeryAyman","","a","2","loay","456");
Borrower a3 = new Borrower("Ahmed","ExtremleyAyman","","a","3","salah","789");
  
  
//Borrower a1 = new Borrower("Amr","Ayman","","a","1","amr");
//  Borrower a2 = new Borrower("Amr","VeryAyman","","a","2","loay");
//  Borrower a3 = new Borrower("Amr","ExtremleyAyman","","a","3","salah");
  
  users.add(a1);
  users.add(a2);
  users.add(a3);
  bookList.add(b);
  bookList.add(b1);
  bookList.add(b2);
  bookList.add(b3);
  bookList.add(b4);
  bookList.add(b5);
  bookList.add(b6);
  bookList.add(b7);
  bookList.add(b8);
  bookList.add(b9);
  bookList.add(b10);
         bookList.add(b11);
         bookList.add(b12);
         bookList.add(b13);
         bookList.add(b14);
         bookList.add(b15);
         bookList.add(b16);
         bookList.add(b17);
         bookList.add(b18);
         bookList.add(b19);
         bookList.add(b20);
         bookList.add(b21);
         bookList.add(b22);
  
  
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
