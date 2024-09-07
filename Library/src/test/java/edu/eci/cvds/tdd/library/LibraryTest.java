package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.Library;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import static org.junit.Assert.*;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void shouldAddBookToLibrary() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123456789");

        assertTrue(library.addBook(book));
        assertEquals(1, library.getBookCount(book));
    }

    @Test
    public void shouldIncrementBookCountWhenBookAlreadyExists() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123456789");

        library.addBook(book);
        assertTrue(library.addBook(book));
        assertEquals(2, library.getBookCount(book));
    }

    @Test
    public void shouldLoanBookToUser() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123456789");
        User user = new User();
        user.setId("user1");
        user.setName("User One");

        library.addBook(book);
        library.addUser(user);

        Loan loan = library.loanABook("user1", "123456789");

        assertNotNull(loan);
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
        assertEquals(0, library.getBookCount(book));
    }

    @Test
    public void shouldReturnLoanedBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "123456789");
        User user = new User();
        user.setId("user1");
        user.setName("User One");

        library.addBook(book);
        library.addUser(user);

        Loan loan = library.loanABook("user1", "123456789");

        assertNotNull(loan);

        Loan returnedLoan = library.returnLoan(loan);

        assertNotNull(returnedLoan);
        assertEquals(LoanStatus.RETURNED, returnedLoan.getStatus());
        assertEquals(1, library.getBookCount(book));
    }
}