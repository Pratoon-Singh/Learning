package interview;

public class Q43ShallowCopy {
    public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
            Address address = new Address("New York", "NY");
            Person person1 = new Person("John", 30, address);
            Person person2 = (Person) person1.clone();

            // Now, person1 and person2 are different objects
            // but person1.address and person2.address refer to the same Address object
        }
    }

}
class  Person implements Cloneable {
    String name;
    int age;
    Address address;

    Person(String name, int age,Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // This is a shallow copy
    }
}

class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
