import java.util.ArrayList;

public class NicknameGenerator
{
    /** The person’s first name in all uppercase letters, initialized
     * by the constructor.
     */
    private String firstName;

    /** The person’s last name in all uppercase letters, initialized
     * by the constructor.
     */
    private String lastName;

    /** Construct with first name and last name assignments */

    /** Returns the number of vowels in lastName. */
    private int numVowels()
    {
        /* Not too hard, but don't forget the names are in all capital letters!*/
    }

    /** Returns the index of the first vowel in lastName.
     * Returns -1 if there are no vowels in lastName.
     * (not too hard!, but don't forget about it being in all capital
     * letters.  Mine didn't work at first!)
     */
    private int indexOfFirstVowel()
    {

    }


    /** Returns a list of shortened last names, as described
     * in part (a).
     */
    public ArrayList<String> shortLastNames()
    {
    ArrayList<String> shortened = new ArrayList<String>();
    if (numVowels() < 2) {
        shortened.add(lastName);
    }
    else {
        for (int i = indexOfFirstVowel()+1); i<= lastName.length(); i++) {
            shortened.add(lastName.substring(0, i));
        }
    }
    return shortened;
    }

    /** Returns a list of nicknames, as described in part (b). */
    public ArrayList<String> nicknames()
    {
        ArrayList<String> nicks = new ArrayList<String>();
        ArrayList<String> lastNames= shortLastNames();
        for (String name : lastNames) {
            nicks.add(firstName.substring(0, 1) + "-" + name);
        }
        return nicks;
    }
}

