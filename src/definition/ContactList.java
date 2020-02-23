package definition;

import adt.contactADT;
import helper.Node;
import helper.Person;

public class ContactList implements contactADT {
    Node<Person> head;

    public ContactList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public void add(Object data) {

    }

    @Override
    public void remove() {

    }

    @Override
    public void search(String firstName) {

    }

    @Override
    public void print() {

    }
}
