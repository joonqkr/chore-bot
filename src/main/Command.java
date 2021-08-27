package main;

import static main.ReadWriteObject.*;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

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
    public void addChore(File dir, String name, int frequency) throws IOException, ClassNotFoundException {
        File cwd;
        if (dir == null) {
            cwd = new File(System.getProperty("user.dir"));
        } else {
            cwd = dir;
        }
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
    public void addPerson(File dir, String name) throws IOException, ClassNotFoundException {
        File cwd;
        if (dir == null) {
            cwd = new File(System.getProperty("user.dir"));
        } else {
            cwd = dir;
        }
        File cb = new File(cwd, ".chore_bot");
        File persons = new File(cb, "chores");

        ArrayList<Person> personList = readObjectFromFile(persons, ArrayList.class);

        Person person = new Person(name);
        personList.add(person);

        writeObjectToFile(persons, personList);
    }

    /** 
     * Removes a chore from the system. 
     * @param name the name of the chore to be removed
     */
    public void removeChore(File dir, String name) {

    }

    /** 
     * Removes a person from the system. 
     * @param name the name of the person to be removed
     */
    public void removePerson(File dir, String name) {

    }

    /**
     * Assigns a person to a chore.
     * @param person the name of the person to be assigned to the chore
     * @param chore the name of the chore that the person will be assigned to
     */
    public void assign(File dir, String person, String chore) {

    }

    /**
     * Prints the order in which people are assigned to do a chore.
     * @param chore the name of the chore the chore to see the order assignment of
     */
    public void viewAssignmentOrder(File dir, String chore) {

    }

    /**
     * Changes the order of the assignment by moving the person to a specific place.
     * @param chore the name of the chore to change the assignment order of
     * @param person the name of the person to move in assignment
     * @param place the location to move the person to
     */
    public void moveAssignment(File dir, String chore, String person, int place) {

    }

    /**
     * Prints all the chores of a person.
     * @param person the name of the person to see the chores of
     */
    public void viewChores(File dir, String person) {

    }

    /**
     * Updates to the system that the person completed their chore.
     * @param person the name of the person who completed the chore
     * @param chore the name of the chore that was completed
     */
    public void checkIn(File dir, String person, String chore) {

    }
}