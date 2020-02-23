package adt;

public interface contactADT<Person> {
    public void add(Person data);

    public void remove();

    public void search(String firstName);

    public void print();

}