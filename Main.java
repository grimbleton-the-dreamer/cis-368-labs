
public class Main {
    public static void main(String[] args) {

        Name test = new Name();
        Address test2 = new Address();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        PhoneList test4 = new PhoneList();
        PersonalInfo test5 = new PersonalInfo();


        test.setFname("J3?????<>><@##%!%35a535cob3534");
        test.setMidini('g');
        test.setLast("J123497on@#@%es");
        System.out.println(test.getFname());
        System.out.println(test.getMidini());
        System.out.println(test.getLast());

        test2.setStreetNum("3625");
        test2.setStreetName("Canterbury RD");
        test2.setApartNum("N/A");
        test2.setCity("Westlake");
        test2.setState("oh");
        test2.setZip(44145);
        System.out.println(test2.getStreetNum());
        System.out.println(test2.getStreetName());
        System.out.println(test2.getApartNum());
        System.out.println(test2.getCity());
        System.out.println(test2.getState());
        System.out.println(test2.getZip());

        phone1.setAreaCode("440");
        phone1.setExchange("503");
        phone1.setExtention("5780");
        phone2.setAreaCode("440");
        phone2.setExchange("821");
        phone2.setExtention("0164");
        System.out.println(phone1.getAreaCode() + "-" + phone1.getExchange() + "-" + phone1.getExtention());
        System.out.println(phone2.getAreaCode() + "-" + phone2.getExchange() + "-" + phone2.getExtention());

        test4.addPhone(phone1);
        test4.addPhone(phone2);
        test4.printPhoneArray();

        test5.setName(test);
        test5.setAddress(test2);
        test5.setPhoneList(test4);

        System.out.println(test5.getName());
        System.out.println(test5.getAddress());
    }
}
