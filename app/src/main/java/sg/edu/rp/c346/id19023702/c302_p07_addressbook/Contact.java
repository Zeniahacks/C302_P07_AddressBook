package sg.edu.rp.c346.id19023702.c302_p07_addressbook;

public class Contact {

    private int contactId;
    private String firstName, lastName, mobile;

    public Contact(int contactId, String firstName, String lastName, String mobile) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public int getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

}