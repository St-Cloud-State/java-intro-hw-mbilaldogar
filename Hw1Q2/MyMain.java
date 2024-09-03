import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class MyMain {

    // Method to store data from input stream to linked list
    public static void store(InputStream inputStream, LinkedList<Person> list) {
        Scanner scanner = new Scanner(inputStream);
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
    public static void display(PrintStream outputStream, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            outputStream.println(list.get(i).toString());
        }
    }

    // Method to find a person by ID in the linked list
    public static int find(String sid, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList<Person> personList = new LinkedList<>();

        try {
            // Read data from a file
            FileInputStream fis = new FileInputStream("data.txt");
            store(fis, personList);
            fis.close();

            // Display the list of persons to the console
            display(System.out, personList);

            // Finding persons by ID and displaying their index
            System.out.println("Index of person with ID '123': " + find("123", personList));
            System.out.println("Index of person with ID '456': " + find("456", personList));
            System.out.println("Index of person with ID '789': " + find("799", personList));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}