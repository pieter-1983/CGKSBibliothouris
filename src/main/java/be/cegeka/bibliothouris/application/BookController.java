package be.cegeka.bibliothouris.application;

import be.cegeka.bibliothouris.domain.book.Book;
import be.cegeka.bibliothouris.domain.book.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by williaam on 25/01/2017.
 */
@Controller
@RequestMapping("/book")
public class BookController {



        @Inject
        private BookService bookService;

        @RequestMapping(method = RequestMethod.GET)
        public
        @ResponseBody
        List<Book> getUsers() {
            return bookService.getAllBooks();
        }

//        @RequestMapping(method = RequestMethod.POST)
//        public
//        @ResponseBody
//        void addUser(@RequestParam(value = "name", required = true) String name) {
//            bookService.addUser(name);
//        }




}