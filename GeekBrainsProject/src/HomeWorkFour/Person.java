package HomeWorkFour;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String poneNumber;
    private int salary;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPoneNumber() {
        return poneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Person(String fullName, String position, String email, String poneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.poneNumber = poneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson() {
        System.out.println(
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", poneNumber=" + poneNumber +
                ", salary=" + salary +
                ", age=" + age);
    }
}
