package test;

import main.Chore;
import org.junit.Test;
import static org.junit.Assert.*;

/** The suite of all JUnit tests for the Chore class.
 *  @author Joon Park
 */
public class ChoreTest {

    @Test
    public void testChoreAttributes() {
        Chore washDishes = new Chore("wash dishes", 52, 3, 365);
        assertEquals("wash dishes", washDishes.getName());
        assertEquals(52, washDishes.getFrequency());
        assertEquals(3, washDishes.getNumPeople());
        assertEquals(365, washDishes.getDuration());
        assertTrue(washDishes.getStatus());

        Chore takeTrash = new Chore("take out trash", 26, 1, 180);
        assertEquals("take out trash", takeTrash.getName());
        assertEquals(26, takeTrash.getFrequency());
        assertEquals(1, takeTrash.getNumPeople());
        assertEquals(180, takeTrash.getDuration());
        assertTrue(takeTrash.getStatus());
    }

    @Test
    public void testChoreMethods() {
        Chore cleanBathroom = new Chore("clean the bathroom", 24, 3, 200);
        cleanBathroom.setFrequency(26);
        assertEquals(26, cleanBathroom.getFrequency());
        cleanBathroom.updateName("cleaning the bathroom");
        assertEquals("cleaning the bathroom", cleanBathroom.getName());
        cleanBathroom.updateNumPeople(1);
        assertEquals(1, cleanBathroom.getNumPeople());
        cleanBathroom.updateDuration(365);
        assertEquals(365, cleanBathroom.getDuration());
        cleanBathroom.updateStatus();
        assertFalse(cleanBathroom.getStatus());
    }
}
