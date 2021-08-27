package main;

import java.io.Serializable;
import java.util.ArrayList;

/** A Person class
 *  @author Joon Park
 */
public class Person implements Serializable {

    /** The name of the person. */
    private String _name;

    /** The list of the person's chores. */
    private ArrayList<Chore> _chores;

    /** The constructor for the Person class, which takes in NAME. */
    public Person(String name) {
        _name = name;
        _chores = new ArrayList<Chore>();
    }

    /** Returns the name of the person. */
    public String getName() {
        return _name;
    }

    /** Updates the name of the person. */
    public void updateName(String name) {
        this._name = name;
    }

    /** Returns the list of the person's chores. */
    public ArrayList<Chore> getChores() {
        return _chores;
    }

    /** Adds a chore. */
    public void addChore(Chore chore) {
        this._chores.add(chore);
    }

    /** Removes a chore. */
    public void removeChore(Chore chore) {
        this._chores.remove(chore);
    }

}