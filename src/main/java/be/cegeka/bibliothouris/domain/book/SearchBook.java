package be.cegeka.bibliothouris.domain.book;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by kevinsm on 25/01/2017.
 */
public class SearchBook extends BookService {
    List<Book> bookList = getAllBooks();
    Stream<Book> stream = bookList.stream();


    public String searchIsbn(String isbn) {
                Pattern p = Pattern.compile(isbn);
        List<String> result = stream.filter(s-> 
    }
}
/*List<String>results =
         stream.filter(s -> pattern.matcher(s).matches())
               .collect(Collectors.toList());  // No side-effects!
 */

/* public static void main(String[] args) {
19         NumberAddition add = new NumberAddition(new ArrayList<Integer>());
20

21         add.addNumbers(number -> number>0) ;}
22

23     public void addNumbers(IntPredicate predicate) {
24         for (Integer number1 : number) {
25             if (predicate.test(number1)) {
26                 number.add(number1);
27             }
28         }
29

30     }
31

*/