package edu.eci.cvds.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    private F_Search fSearch;
    private Garden garden;
    
    @Before
    public void setUp() {
        library=new Library();
    }

    @Test
    public void testAct() {
        book1=new Book("Libro muy interesante","Desconocido","123");
    }

}