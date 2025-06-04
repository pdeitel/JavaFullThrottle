// CoverViewerController.java
// Controller for Cover Viewer application
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoverViewerController {
   // instance variables for interacting with GUI
   @FXML private ListView<Book> booksListView;
   @FXML private ImageView coverImageView;

   // stores the list of Book Objects
   private final ObservableList<Book> books = 
      FXCollections.observableArrayList();

   // initialize controller
   public void initialize() {
      // populate the ObservableList<Book>
      books.add(new Book("C How to Program", 
         "/images/small/chtp.jpg", "/images/large/chtp.jpg"));
      books.add(new Book("C++ How to Program",
         "/images/small/cpphtp.jpg", "/images/large/cpphtp.jpg"));
      books.add(new Book("Intro to Python",  
         "/images/small/python.jpg", "/images/large/python.jpg"));
      books.add(new Book("Internet and World Wide Web How to Program",  
         "/images/small/iw3htp.jpg", "/images/large/iw3htp.jpg"));
      books.add(new Book("Java How to Program", 
         "/images/small/jhtp.jpg", "/images/large/jhtp.jpg"));
      books.add(new Book("Python for Programmers", 
         "/images/small/pythonfp.jpg", "/images/large/pythonfp.jpg"));
      books.add(new Book("Visual Basic How to Program", 
         "/images/small/vbhtp.jpg", "/images/large/vbhtp.jpg"));
      books.add(new Book("Visual C# How to Program", 
         "/images/small/vcshtp.jpg", "/images/large/vcshtp.jpg"));
      booksListView.setItems(books); // bind booksListView to books

      // when ListView selection changes, show large cover in ImageView
      booksListView.getSelectionModel().selectedItemProperty().
         addListener(
            (ov, oldValue, newValue) -> {                        
               coverImageView.setImage(
                  new Image(newValue.largeImage()));
            }
         );                                                                  
         
      // set custom ListView cell factory
      booksListView.setCellFactory(
         listView -> new ImageTextCell()
      );   
   }     
}

/**************************************************************************
 * (C) Copyright 1992-2025 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
