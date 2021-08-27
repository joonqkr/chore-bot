package test;

import main.Chore;
import main.Person;

import org.junit.Test;
import static org.junit.Assert.*;

/** The suite of all JUnit tests for the Chore class.
 *  @author Joon Park
 */
public class ChoreTest {

    @Test
    public void testChoreAttributes() {
        Chore washDishes = new Chore("wash dishes", 52);
        assertEquals("wash dishes", washDishes.getName());
        assertEquals(52, washDishes.getFrequency());
        assertEquals(0, washDishes.getPersons().size());
        assertNull(washDishes.getCurrent());
        assertTrue(washDishes.getStatus());

        Chore takeTrash = new Chore("take out trash", 26);
        assertEquals("take out trash", takeTrash.getName());
        assertEquals(26, takeTrash.getFrequency());
        assertEquals(0, takeTrash.getPersons().size());
        assertNull(takeTrash.getCurrent());
        assertTrue(takeTrash.getStatus());
    }

    @Test
    public void testChoreMethods() {
        Chore cleanBathroom = new Chore("clean the bathroom", 24);
        cleanBathroom.setFrequency(26);
        assertEquals(26, cleanBathroom.getFrequency());
        cleanBathroom.updateName("cleaning the bathroom");
        assertEquals("cleaning the bathroom", cleanBathroom.getName());
        cleanBathroom.updateStatus();
        assertFalse(cleanBathroom.getStatus());

        Person joon = new Person("Joon");
        cleanBathroom.addPerson(joon);
        Person twong = new Person("Tiff");
        cleanBathroom.addPerson(twong);
        assertEquals(2, cleanBathroom.getPersons().size());
        cleanBathroom.removePerson(joon);
        assertEquals(1, cleanBathroom.getPersons().size());
    }
}
