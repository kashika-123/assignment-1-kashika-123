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
        Node response = null;



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
        if (count != 0) {
            System.out.println(count + "match found!\n-----*-----*-----*-----");
            temp = head;
            while (temp != null) {
                if (temp.getData().getFirstName().equals(firstName)) {
                    System.out.println(temp.getData());

                    System.out.println("-----*-----*-----*-----");

                    temp = temp.getNext();
                } else {
                    System.out.println("No result found.");
                }

            }
        }


    }

    @Override
    public void print() {
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
            System.out.println("-----*-----*-----*-----" + "\n" + "-----*-----*-----*-----");
        }
        System.out.println();


    }
}