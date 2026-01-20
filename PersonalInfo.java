
public class PersonalInfo {
    private Name name = new Name();
    private Address address = new Address();
    private PhoneList phoneList = new PhoneList();

    public void setName(Name name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneList(PhoneList phoneList) {
        this.phoneList = phoneList;
    }

    public Name getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public PhoneList getPhoneList(){
        return this.phoneList;
    }
}
