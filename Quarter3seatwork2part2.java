class Person {

    // Encapsulated variables (private)
    private String name;
    private int age;

    // Setters (Write data)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0; // validation
        }
    }

    // Getters (Read data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Chile Class (Delivered Class)
// Inheritance: Student inherits Person
class Student extends Person {

    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo() {
        System.out.println("_____Student Information_____");
        System.out.println("Name  : " + getName());
        System.out.println("Age   : " + getAge());
        System.out.println("Course: " + getCourse());
        System.out.println("______________________");
    }
}

//Main Class
public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("kate pogi");
        s.setAge(16);
        s.setCourse("ICT");

        s.displayInfo();
    }
