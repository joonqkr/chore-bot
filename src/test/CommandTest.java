package test;

import main.Chore;
import main.Person;
import main.Command;
import static main.ReadWriteObject.*;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import static org.junit.Assert.*;

/** The tests for the Command class methods.
 *  @author Joon Park
 */
public class CommandTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void houseTest() throws IOException, ClassNotFoundException {
        File dir = tempFolder.newFolder("folder");

        Command com = new Command();
        com.house(dir);
        File cb = new File(dir, ".chore_bot");
        assertTrue(cb.exists());

        File chores = new File(cb, "chores");
        assertTrue(chores.exists());
        File persons = new File(cb, "persons");
        assertTrue(persons.exists());

        ArrayList<Chore> choreList = readObjectFromFile(chores, ArrayList.class);
        assertEquals(0, choreList.size());
        ArrayList<Person> personList = readObjectFromFile(persons, ArrayList.class);
        assertEquals(0, personList.size());
    }

    @Test
    public void addRemoveTest() throws IOException, ClassNotFoundException {
        File dir = tempFolder.newFolder("folder");

        Command com = new Command();
        com.house(dir);
        File cb = new File(dir, ".chore_bot");

        File chores = new File(cb, "chores");
        com.addChore(dir, "take out trash", 26);
        com.addChore(dir, "wash the dishes", 365);
        com.addChore(dir, "water plants", 52);

        ArrayList<Chore> choreList = readObjectFromFile(chores, ArrayList.class);
        assertEquals(3, choreList.size());
        com.removeChore(dir, "wash the dishes");
        choreList = readObjectFromFile(chores, ArrayList.class);
        assertEquals(2, choreList.size());
        for (Chore chore : choreList) {
            assertTrue(chore.getName().equals("take out trash")||chore.getName().equals("water plants"));
        }
        com.removeChore(dir, "take out trash");
        com.removeChore(dir, "water plants");
        choreList = readObjectFromFile(chores, ArrayList.class);
        assertEquals(0, choreList.size());

        File persons = new File(cb, "persons");
        com.addPerson(dir, "Joon");
        com.addPerson(dir, "Cindy");
        com.addPerson(dir, "Tiffany");

        ArrayList<Person> personList = readObjectFromFile(persons, ArrayList.class);
        assertEquals(3, personList.size());
        com.removePerson(dir, "Joon");
        personList = readObjectFromFile(persons, ArrayList.class);
        assertEquals(2, personList.size());
        for (Person person : personList) {
            assertTrue(person.getName().equals("Cindy")||person.getName().equals("Tiffany"));
        }
        com.removePerson(dir, "Cindy");
        com.removePerson(dir, "Tiffany");
        personList = readObjectFromFile(persons, ArrayList.class);
        assertEquals(0, personList.size());
    }
}
