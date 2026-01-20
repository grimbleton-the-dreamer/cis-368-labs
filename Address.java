
public class Address{
    private String streetNum;
    private String streetName;
    private String apartNum;
    private String city;
    private String state;
    private int zip;

    /**Sets the Street Number*/
    public void setStreetNum(String streetNum) {
        //Fun little regex to remove unwanted characters
        streetNum = streetNum.replaceAll("[^\\d]", "");
        if (streetNum.length() > 5){
            throw new IllegalArgumentException("Len is too long enough");
        }
        this.streetNum = streetNum;
    }

    /**Sets the Street Name*/
    public void setStreetName(String streetName) {
        //Fun little regex to remove unwanted digits 
        streetName = streetName.replaceAll("[^a-zA-Z\\s]", "");
        this.streetName = streetName;
    }

    /**Sets the Apartment Number if applicable*/
    public void setApartNum(String apartNum) {
        this.apartNum = apartNum;
    }

    /**Sets the City*/
    public void setCity(String city) {
        //Fun little regex to remove unwanted characters
        city = city.replaceAll("[^a-zA-Z\\s]", "");
        this.city = city;
    }

    /**Sets the State in the form of Postal Code*/
    public void setState(String state) {
        if (state.length() != 2){
            throw new IllegalArgumentException("State should only be two letters");
        }
        this.state = state.toUpperCase();
    }

    /**Sets the Zip Code*/
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**returns the Street number as a String*/
    public String getStreetNum() {
        return streetNum;
    }

    /**Returns the Street Name as a String*/
    public String getStreetName() {
        return streetName;
    }

    /**Returns the Apartment Number as a String*/
    public String getApartNum() {
        return apartNum;
    }

    /**Returns City as a String*/
    public String getCity() {
        return city;
    }

    /**Returns the Zip Code as an int*/
    public int getZip() {
        return zip;
    }

    /**Returns the State as a String*/
    public String getState() {
        return state;
    }
}
