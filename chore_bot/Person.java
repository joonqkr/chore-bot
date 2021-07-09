package chore_bot;

import java.util.ArrayList;

/** A Person class
 *  @author Joon Park
 */
public class Person {

    /** The name of the person. */
    private String _name;

    /** The list of the person's chores. */
    private ArrayList<Chore> _chores;

    /** The list of houses the person is in. */
    private ArrayList<House> _houses;

    /** The constructor for the Person class, which takes in NAME. */
    public Person(String name) {
        _name = name;
        _chores = new ArrayList<Chore>();
        _houses =  new ArrayList<House>();
    }

    /** Returns the name of the person. */
    public String getName() {
        return _name;
    }

    /** Returns the list of the person's chores. */
    public ArrayList<People> getChores() {
        return _chores;
    }

    /** Returns the list of houses the person is in. */
    public ArrayList<Chore> getHouses() {
        return _houses;
    }

    /** Returns the number of chores the person has. */
    public int numChores() {
        return _chores.size();
    }

    /** Updates the name of the person. */
    public void updateName(String name) {
        _name = name;
    }

    /** Adds a chore. */
    public void addChore(Chore chore) {
        _chores.add(chore);
    }

    /** Removes a chore. */
    public void removeChore(Chore chore) {
        _chores.remove(chore);
    }

    /** Adds a house. */
    public void addHouse(House house) {
        _houses.add(house);
    }

    /** Removes a person from the house. */
    public void removeHouse(House house) {
        _houses.remove(house);
    }


}