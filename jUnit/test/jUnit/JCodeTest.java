package jUnit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zac Allen
 */
public class JCodeTest {
    
    public JCodeTest() {
    }
    
    String[] array = {"a", "b", "c"};
    String[] expectedValues = {"a", "b", "c"};

    JCode man1 = new JCode("Zac", 22, 210, "Steak", true, false, array);
    JCode man2 = new JCode();
    
    @Test
    public void testArray(){
        assertArrayEquals(expectedValues, man1.getArray());
    }
    
    @Test
    public void testEquals(){
        assertEquals("Zac", man1.getName());
    }
    
    @Test
    public void testNotEquals(){
        assertNotEquals(500, man1.getWeight());
    }
    
    @Test
    public void testNull(){
        assertNull(man2.getFavoriteFood());
    }
    
    @Test
    public void testNotNull(){
        assertNotNull(man1.getFavoriteFood());
    }
    
    @Test
    public void testNotSame(){
        assertNotSame("Bob", man1.getName());
    }
    
    @Test
    public void testSame(){
        assertSame("Steak", man1.getFavoriteFood());
    }
    
    @Test
    public void testFalse(){
        assertFalse(man1.getOld());
    }
    
}
