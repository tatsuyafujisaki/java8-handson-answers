enum Gender {
    MALE, FEMALE
}

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    Person(String lastName, String firstName, int age, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    int getAge(){
        return age;
    }
}