package edu.eci.cvds.tdd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Este test verifica que un libro pueda ser prestado y luego devuelto correctamente.
     * Se asegura de que:
     * 1. El préstamo del libro se realice con éxito.
     * 2. El préstamo devuelto tenga el estado "RETURNED".
     * 3. El libro devuelto se cuente de nuevo en la biblioteca.
    */
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
