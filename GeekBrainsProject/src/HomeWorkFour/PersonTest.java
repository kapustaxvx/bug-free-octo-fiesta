package HomeWorkFour;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Genadiy Petrov", "Engineer", "g.petrov@mail.ru","8900123456", 40000, 70);
        persArray[1] = new Person("Petr Genadiev", "Engineer", "g.petro@mail.ru","8900123456", 6000, 45);
        persArray[2] = new Person("Anton Vasiliev", "Engineer", "g.petr@mail.ru","8900123456", 70000, 27);
        persArray[3] = new Person("Vasiliy Antonov", "Engineer", "g.pet@mail.ru","8900123456", 10000, 33);
        persArray[4] = new Person("Ivan Ivanov", "Engineer", "g.pe@mail.ru","8900123456", 15500, 20);

        for (Person person : persArray){
            if (person.getAge() > 40) person.printPerson();
        }


    }
}
