package test;

import main.*;
import org.junit.Test;
import static org.junit.Assert.*;

/** The suite of all JUnit tests for the Person class.
 *  @author Joon Park
 */
public class PersonTest {

    @Test
    public void testPerson() {
        Person joon = new Person("Joon Park");
        assertEquals("Joon Park", joon.getName());
        assertEquals(0, joon.getChores().size());
        assertEquals(0, joon.getHouses().size());

        joon.updateName("Joonseo Park");
        assertEquals("Joonseo Park", joon.getName());

        Chore takeTrash = new Chore("take out trash", 26, 1, 180);
        Chore washDishes = new Chore("wash dishes", 52, 3, 365);
        joon.addChore(takeTrash);
        joon.addChore(washDishes);
        assertEquals(2, joon.numChores());
        joon.removeChore(takeTrash);
        assertEquals(1, joon.numChores());
        joon.removeChore(washDishes);
        assertEquals(0, joon.numChores());


    }

}
