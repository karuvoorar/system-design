package creational;

import java.util.List;

/**
 * - Whenever we have a class attributes but we may not need to add all values
 * - When we want to make the object immutable once added
 * - Readable and Maintainable object
 *
 * pros:
 * - if we want mutability
 * - clean object creation
 *
 * cons:
 * - tough to write
 * - lengthier code to maintain
 */
public class Builder {

    public static void main(String[] args) {

        Person p = Person.builder()
                .name("Kamesh")
                .age(31)
                .address("Sydney")
                .gender("Male")
                .profession("Software Engineer")
                .hobbies(List.of("Coding", "Reading"))
                .build();

        System.out.println(p);
    }

}

class Person {
    private final String name;
    private final int age;
    private final String address;
    private final String gender;
    private final String profession;
    private final List<String> hobbies;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.gender = builder.gender;
        this.profession = builder.profession;
        this.hobbies = builder.hobbies;
    }

    // FIXED: must be static
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", profession='" + profession + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    public static class PersonBuilder {
        private String name;
        private int age;
        private String address;
        private String gender;
        private String profession;
        private List<String> hobbies;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public PersonBuilder hobbies(List<String> hobbies) {
            this.hobbies = hobbies;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
