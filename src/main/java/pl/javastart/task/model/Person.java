package pl.javastart.task.model;

import pl.javastart.task.exception.IncorrectAgeException;
import pl.javastart.task.exception.NameUndefinedException;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private static final int AGE_LIMIT = 1;
    private static final int LENGTH_LIMIT = 2;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkStringDefined();
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkStringDefined();
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < AGE_LIMIT) {
            throw new IncorrectAgeException("Limit wieku przekroczony \n" + "Koniec programu");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void checkStringDefined() {
        if (lastName == null || lastName.length() < LENGTH_LIMIT) {
            throw new NameUndefinedException("Nazwisko jest nieprawidłówe null albo zawiera mniej niż 2 znaki \n" + "Koniec programu");
        }
        if (firstName == null || firstName.length() < LENGTH_LIMIT) {
            throw new NameUndefinedException("Imię jest nieprawidłówe null albo zawiera mniej niż 2 znaki \n" + "Koniec programu");
        }

    }

}
