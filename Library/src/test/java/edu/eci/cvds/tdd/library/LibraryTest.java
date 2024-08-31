package scr.main.java.edu.eci.cvds.tdd.library;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    
    @Before
    public void setUp() {
        library=new Library();
        
    }

    @Test
    public void testAct() {
        book1=new Book("Libro muy interesante","Desconocido","123");
    }

}