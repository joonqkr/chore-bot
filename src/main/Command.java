package main;

import java.util.ArrayList;

import java.io.File;
import java.io.IOException;

import static main.ReadWriteObject.*;

public class Command {

    /** 
     * Creates a new chore tracking system in the current directory. Creates a directory that contains two files -
     * a file for the chores and a file for the persons. An initial empty array of chores and array of persons
     * is created, serialized, and written to the respective files. 
     */
    public void house(File dir) throws IOException {
        File cwd;
        if (dir == null) {
            cwd = new File(System.getProperty("user.dir"));
        } else {
            cwd = dir;
        }
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

        writeObjectToFile(chores, choreList);
        writeObjectToFile(persons, personList);
    }

    /** 
     * Adds a chore to the system. 
     * @param name the name of the chore
     * @param frequency the frequency of the chore
     */
    public void addChore(String name, int frequency) throws IOException, ClassNotFoundException {
        File cwd = new File(System.getProperty("user.dir"));
        File cb = new File(cwd, ".chore_bot");
        File chores = new File(cb, "chores");

        ArrayList<Chore> choreList = readObjectFromFile(chores, ArrayList.class);

        Chore chore = new Chore(name, frequency);
        choreList.add(chore);

        writeObjectToFile(chores, choreList);
    }

    /**
     * Adds a person to the system.
     * @param name the name of the person to be added
     */
    public void addPerson(String name) {

    }

    /** 
     * Removes a chore from the system. 
     * @param chore the chore to be removed
     */
    public void removeChore(Chore chore) {

    }

    /** 
     * Removes a person from the system. 
     * @param person the person to be removed
     */
    public void removePerson(Person person) {

    }

    /**
     * Updates to the system that the person completed their chore.
     * @param person the person who completed the chore
     * @param chore the chore that was completed
     */
    public void checkIn(Person person, Chore chore) {

    }
}