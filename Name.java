
import java.lang.Character;

/**This class stores the First name, middle initial, and last name of a user*/
public class Name{
    private String fname;
    private char midini;
    private String last;

    /**Returns the First name*/
    public String getFname() {
        return fname;
    }

    /**Returns the middle initial*/
    public char getMidini() {
        return midini;
    }

    /**Returns the Last name*/
    public String getLast() {
        return last;
    }

    /**Sets the First name*/
    public void setFname(String fname) {
        //Fun little regex to remove unwanted characters
        fname = fname.replaceAll("[^a-zA-Z\\s]", "");
        this.fname = fname;
    }
    
    /**Sets the middle initial*/
    public void setMidini(char midini) {
        this.midini = Character.toUpperCase(midini);
    }

    /**Sets the last name*/
    public void setLast(String last) {
        last = last.replaceAll("[^a-zA-Z\\s]", "");
        this.last = last;
    }

    /**Prints out the full name to standard out in standard format*/
    public void printFullName(){
        String result = String.format("%s %c %s", this.fname,
                this.midini, this.last);
        System.out.println(result);
    }
}
