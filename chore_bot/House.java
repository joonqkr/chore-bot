package chore_bot;

import java.util.ArrayList;

/** A House class
 *  @author Joon Park
 */
public class House {

    /** The name of the house. */
    private String _name;

    /** The list of people in the house. */
    private ArrayList<People> _members;

    /** The list of chores for the house. */
    private ArrayList<Chore> _chores;

    /** The constructor for the House class, which takes in NAME. */
    public House(String name) {
        _name = name;
        _members = new ArrayList<People>();
        _chores = new ArrayList<Chore>();
    }

    /** Returns the name of the house. */
    public String getName() {
        return _name;
    }

    /** Returns the list of members in the house. */
    public ArrayList<People> getMembers() {
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
        _name = name;
    }

    /** Adds a person to the house. */
    public void addMember(People member) {
        _members.add(member);
    }

    /** Removes a person from the house. */
    public void removeMember(People member) {
        _members.remove(member);
    }

    /** Adds a chore to the house. */
    public void addChore(Chore chore) {
        _chores.add(chore);
    }

    /** Removes a chore from the house. */
    public void removeChore(Chore chore) {
        _chores.remove(chore);
    }
}