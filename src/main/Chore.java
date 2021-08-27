package main;

import java.util.ArrayList;

/** A Chore class
 *  @author Joon Park
 */
public class Chore {

    /** The name of the chore. */
    private String _name;

    /** The current person assigned to the chore. */
    private Person _current;

    /** The list of the people assigned to the chore. */
    private ArrayList<Person> _persons;

    /** The frequency of the chore, represented as # of times per 
     *  year. */
    private int _frequency;

    /** The status of the chore.  */
    private boolean _status;

    /** The constructor for the Chore class, which takes in the NAME, 
     *  the NUMPEOPLE, and DURATION. */
    public Chore(String name, int frequency) {
        this._name = name;
        this._current = null;
        this._persons = new ArrayList<Person>();
        this._frequency = frequency;
        this._status = true;
    }

    /** Returns the name of the chore. */
    public String getName() {
        return this._name;
    }

    /** Updates the name of chore. */
    public void updateName(String name) {
        this._name = name;
    }

    /** Returns the current person assigned to the chore. */
    public Person getCurrent() {
        return _persons.get(0);
    }

    /** Returns the list of people assigned to the chore. */
    public ArrayList<Person> getPersons() {
        return this._persons;
    }

    /** Adds PERSON to _persons. */
    public void addPerson(Person person) {
        this._persons.add(person);
    }

    /** Removes PERSON from _persons. */
    public void removePerson(Person person) {
        this._persons.remove(person);
    }

    /** Returns the frequency of the chore. */
    public int getFrequency() {
        return this._frequency;
    }

    /** Sets the frequency of the chore. */
    public void setFrequency(int _frequency) {
        this._frequency = _frequency;
    }

    /** Returns the status of the chore. */
    public boolean getStatus() {
        return this._status;
    }

    /** Switches the status. */
    public void updateStatus() {
        this._status = !_status;
    }

}