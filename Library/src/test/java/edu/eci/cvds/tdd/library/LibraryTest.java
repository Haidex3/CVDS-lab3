package domain;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class F_SearchTest {
    private F_Search fSearch;
    private Garden garden;
    
    @Before
    public void setUp() {
        garden = new Garden(); 
        fSearch = new F_Search(garden, 2, 2); 
    }

    @Test
    public void testAct() {
        fSearch.act();
        assertEquals(1, fSearch.getTime()); 
    }
    
    @Test
    public void testMove() {
        int initialRow = fSearch.getRow();
        int initialColumn = fSearch.getColumn();
        fSearch.act();
        fSearch.move();
        
        int newRow = fSearch.getRow();
        int newColumn = fSearch.getColumn();
        assertEquals(initialRow +1, newRow);
        assertEquals(initialColumn+1, newColumn);
    }
}