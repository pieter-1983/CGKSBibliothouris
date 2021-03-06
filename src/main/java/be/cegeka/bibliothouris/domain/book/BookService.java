package be.cegeka.bibliothouris.domain.book;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by williaam on 25/01/2017.
 */
@Named
public class BookService {


    @Inject
    private BookRepository bookRepository;
    private BookService bookService;

    public List<Book> getAllBooks(){
        return bookRepository.getBooks();
    }

    public void addBook(String isbn, String title, String authorFirstName, String authorLastName){
        Book book = new Book(isbn, title, authorFirstName, authorLastName);
        bookRepository.addBook(book);
    }

    public String detailBook (String isbn) {
        String output = "";
        for (Book book : getAllBooks()) {
            if (isbn == book.getIsbn()){
                output = "ISBN : "+book.getIsbn() + " Title : "+book.getTitle();

            }
        }
        return output;
    }

    public String showSearchIsbn(){



    }


}
