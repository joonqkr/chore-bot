package chore_bot;

/** A Chore class
 *  @author Joon Park
 */
public class Chore {

    /** The name of the chore. */
    private String _name;

    /** The frequency of the chore, represented as # of times per 
     *  year. */
    private int _frequency;

    /** The number of people required. */
    private int _numPeople;

    /** The duration that the chore should be maintained, in days. */
    private int _duration;

    /** The status of the chore.  */
    private boolean _status;

    /** The constructor for the Chore class, which takes in the NAME, 
     *  the NUMPEOPLE, and DURATION. */
    public Chore(String name, int frequency, int numPeople, int duration) {
        _name = name;
        setFrequency(frequency);
        _numPeople = numPeople;
        _duration = duration;
        _status = true;
    }

    public int getFrequency() {
        return _frequency;
    }

    public void setFrequency(int _frequency) {
        this._frequency = _frequency;
    }

    /** Returns the name of the chore. */
    public String getName() {
        return _name;
    }

    /** Returns the number of people required for the chore. */
    public int getNumPeople() {
        return _numPeople;
    }

    /** Returns the duration of the chore. */
    public int getDuration() {
        return _duration;
    }

    /** Returns the status of the chore. */
    public boolean getStatus() {
        return _status;
    }

    /** Updates the name of chore. */
    public void updateName(String name) {
        this._name = name;
    }

    /** Updates number of people. */
    public void updateNumPeople(int numPeople) {
        this._numPeople = numPeople;
    }

    /** Updates the duration of the chore. */
    public void updateDuration(int duration) {
        this._duration = duration;
    }

    /** Switches the status. */
    public void updateStatus() {
        this._status = !_status;
    }
}