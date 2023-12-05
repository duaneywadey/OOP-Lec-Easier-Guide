# OOP STUDY GUIDE (EASIER GUIDE)

```java
class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    // Constructor for Person class
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Encapsulation: Getter methods to access private variables
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // Polymorphism: Method overridden in subclasses
    public String getDetails() {
        return "Name: " + name + ", Address: " + address;
    }

    // Additional method to demonstrate encapsulation
    public String contactInformation() {
        return "Phone: " + phoneNumber + ", Email: " + emailAddress;
    }
}

class Student extends Person {
    private final String classStatus;

    // Constructor for Student class
    public Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    // Encapsulation: Getter method to access private variable
    public String getClassStatus() {
        return classStatus;
    }

    // Polymorphism: Method overridden from superclass
    @Override
    public String getDetails() {
        return "Student - Name: " + getName() + ", Class Status: " + classStatus;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("John Doe", "123 Main St", "123-456-7890", "john.doe@example.com");
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Address: " + person.getAddress());
        System.out.println("Person Contact Information: " + person.contactInformation());

        // Create a Student
        Student student = new Student("Alice Smith", "456 Elm St", "987-654-3210", "alice.smith@example.com", "Senior");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Class Status: " + student.getClassStatus());
        System.out.println("Student Contact Information: " + student.contactInformation());
    }
}

```

# Encapsulation demonstration

```java

```