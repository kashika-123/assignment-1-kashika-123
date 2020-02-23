package definition;

import adt.contactADT;
import helper.Node;
import helper.Person;

import java.util.Scanner;

public class ContactList implements contactADT {
    Scanner sc = new Scanner(System.in);
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
        while (head != null) {
            Node<Person> temp = head;
            Node previous = null;
            int count = 0;
            int index = printName();
            sc.nextLine();
            while (count < index - 1) {
                previous = temp;
                temp = temp.getNext();
                count++;
            }
            System.out.println(temp.getData().getFirstName() + " " + temp.getData().getLastName() + "'s contact deleted from list!");

            if (previous != null) {
                response = previous.getNext();
                previous.setNext(null);

            } else {
                response = head;
                head = null;
            }
        }


    }

    public int printName() {
        System.out.println("Here are all your contacts: ");
        Node<Person> temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". " + temp.getData().getFirstName() + " " + temp.getData().getLastName());
            temp = temp.getNext();
        }
        System.out.print("Press the number against the contact to delete it:");
        return sc.nextInt();
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

    public void sortList() {

    }


}