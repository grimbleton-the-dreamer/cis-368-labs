
//needs documentation
//look in Address.java for formatting
import java.util.ArrayList;
public class PhoneList {
    private ArrayList<Phone> phoneArray = new ArrayList<Phone>() ;

    public ArrayList<Phone> getPhoneArray() {
        return phoneArray;
    }

    public void addPhone(Phone phone){
        phoneArray.add(phone);
    }

    public void deletePhone(Phone phone){
        phoneArray.remove(phone);
    }

    public void printPhoneArray(){
        for (int i = 0; i < phoneArray.toArray().length; i++) {
            System.out.println(phoneArray.get(i).getPhoneString());
        }
    }
}
