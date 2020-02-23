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
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }

    @Override
    public void remove() {


    }

    @Override
    public void search(String firstName) {
        Node<Person> temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.getData().getFirstName().equals(firstName))
                count++;
            temp = temp.getNext();
        }

    }

    @Override
    public void print() {

    }
}
