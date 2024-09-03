import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonList {
    private LinkedList<Person> list;

    // Constructor
    public PersonList() {
        list = new LinkedList<>();
    }

    // Method to store data from input stream to linked list
    public void store(FileInputStream fis) {
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            if (data.length == 3) {
                Person person = new Person(data[0], data[1], data[2]);
                list.add(person);
            }
        }
        scanner.close();
    }

    // Method to display the linked list to output stream
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    // Method to find a person by ID in the linked list
    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}