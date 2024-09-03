import java.io.FileInputStream;

public class MyMain {
    public static void main(String[] args) {
        // Instantiate PersonList object
        PersonList personList = new PersonList();

        try {
            // Read data from a file
            FileInputStream fis = new FileInputStream("data.txt");
            personList.store(fis);
            fis.close();

            // Display the list of persons to the console
            personList.display();

            // Finding persons by ID and displaying their index
            System.out.println("Index of person with ID '123': " + personList.find("123"));
            System.out.println("Index of person with ID '456': " + personList.find("456"));
            System.out.println("Index of person with ID '789': " + personList.find("799"));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
