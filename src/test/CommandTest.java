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
        File dir = tempFolder.newFolder("subfolder");

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
}
