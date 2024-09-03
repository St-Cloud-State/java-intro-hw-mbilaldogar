// 'Person' class
public class Person 
{
    // Private variables
    private String firstName;
    private String lastName;
    private String id;

    // Constructor with three parameters
    public Person(String firstName, String lastName, String id) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Accessor methods
    public String getFirstName() 
    {
        return firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public String getId() 
    {
        return id;
    }

    // toString() method
    @Override
    public String toString() 
    {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", ID: " + id;
    }
}