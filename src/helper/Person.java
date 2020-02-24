package helper;

public class Person {
    private String firstName;
    private String lastName;
    private StringBuffer contactNumber;
    private String email;


    @Override
    public String toString() {
        if (email != null) {
            return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                    "Contact Number: " + "" + "\n" +
                    "Email Address: " + email;
        } else {
            return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                    "Contact Number: ";

        }

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StringBuffer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(StringBuffer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
