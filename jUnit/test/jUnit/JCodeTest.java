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

    JCode man1 = new JCode("Zac", 22, 210, "Steak");
    
    @Test
    public void testName(){
        assertEquals("Zac", man1.getName());
    }
    
    @Test
    public void testAge(){
        assertEquals(22, man1.getAge());
    }
    
    @Test
    public void testWeight(){
        assertNotEquals(500, man1.getWeight());
    }
    
    @Test
    public void testFood(){
        assertSame("Steak", man1.getFavoriteFood());
    }
    
}
