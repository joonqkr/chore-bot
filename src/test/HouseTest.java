package test;

import main.*;
import org.junit.Test;
import static org.junit.Assert.*;

/** The suite of all JUnit tests for the House class.
 *  @author Joon Park
 */
public class HouseTest {

    @Test
    public void testHouse() {
        House apt = new House("channing");
        assertEquals("channing", apt.getName());
        assertEquals(0, apt.getChores().size());
        assertEquals(0, apt.getMembers().size());

        apt.updateName("durant");
        assertEquals("durant", apt.getName());

        Chore takeTrash = new Chore("take out trash", 26, 1, 180);
        Chore washDishes = new Chore("wash dishes", 52, 3, 365);
        apt.addChore(takeTrash);
        apt.addChore(washDishes);
        assertEquals(2, apt.getChores().size());
        apt.removeChore(takeTrash);
        assertEquals(1, apt.getChores().size());
        apt.removeChore(washDishes);
        assertEquals(0, apt.getChores().size());

        Person twong = new Person("Tiffany Wong");
        apt.addMember(twong);
        assertEquals(1, apt.numMembers());
        apt.removeMember(twong);
        assertEquals(0, apt.numMembers());

    }
}
