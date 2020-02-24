package helper;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<String> contactNumber;
    private String email;

    public void getNumber() {

    }

    @Override
    public String toString() {
        if (email != "") {
            if (contactNumber.size() > 1) {
                return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                        "Contact Number(s): " + getContactNumber() + "\n" +
                        "Email Address: " + email;
            } else if (contactNumber.size() == 1) {
                return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                        "Contact Number: " + getContactNumber() + "\n" + "Email Address: " + email;
            }

        } else {
            if (contactNumber.size() == 1) {
                return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                        "Contact Number: " + getContactNumber() + "\n" + "Email Address: " + email;
            } else if (contactNumber.size() > 1) {
                return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" +
                        "Contact Number(s): " + getContactNumber() + "\n" +
                        "Email Address: " + email;

            }
        }
        return null;
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

    public ArrayList<String> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList<String> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
