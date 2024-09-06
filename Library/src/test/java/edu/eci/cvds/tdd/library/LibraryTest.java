package edu.eci.cvds.tdd.library;


import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    
    @Before
    public void setUp() {
        Library lybrary=new Library();
        
    }

    @Test
    public void testAct() {
        Book book1=new Book("Libro muy interesante","Desconocido","123");
    }

}