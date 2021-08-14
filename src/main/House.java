package main;

import java.util.ArrayList;

/** A House class
 *  @author Joon Park
 */
public class House {

    /** The name of the house. */
    private String _name;

    /** The list of people in the house. */
    private ArrayList<Person> _members;

    /** The list of chores for the house. */
    private ArrayList<Chore> _chores;

    /** The constructor for the House class, which takes in NAME. */
    public House(String name) {
        _name = name;
        _members = new ArrayList<Person>();
        _chores = new ArrayList<Chore>();
    }

    /** Returns the name of the house. */
    public String getName() {
        return _name;
    }

    /** Returns the list of members in the house. */
    public ArrayList<Person> getMembers() {
        return _members;
    }

    /** Returns the list of chores assigned in the house. */
    public ArrayList<Chore> getChores() {
        return _chores;
    }

    /** Returns the number of people in the house. */
    public int numMembers() {
        return _members.size();
    }

    /** Updates the name of the house. */
    public void updateName(String name) {
        this._name = name;
    }

    /** Adds a person to the house. */
    public void addMember(Person member) {
        this._members.add(member);
    }

    /** Removes a person from the house. */
    public void removeMember(Person member) {
        this._members.remove(member);
    }

    /** Adds a chore to the house. */
    public void addChore(Chore chore) {
        this._chores.add(chore);
    }

    /** Removes a chore from the house. */
    public void removeChore(Chore chore) {
        this._chores.remove(chore);
    }
}