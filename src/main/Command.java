package main;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import static main.ReadWriteObject.*;

public class Command {

    public void house() throws IOException {
        File cwd = new File(System.getProperty("user.dir"));
        File cb = new File(cwd, ".chore_bot");
        if (cb.exists()) {
            System.out.println("A chore system already exists here.");
            return;
        }
        cb.mkdir();
        File chores = new File(cb, "chores");
        chores.createNewFile();
        File persons = new File(cb, "persons");
        persons.createNewFile();

        ArrayList<Chore> choreList = new ArrayList<Chore>();
        ArrayList<Person> personList = new ArrayList<Person>();

        writeObject(chores, choreList);
        writeObject(persons, personList);
    }

}