package pl.javastart.task.test;

import pl.javastart.task.exception.IncorrectAgeException;
import pl.javastart.task.exception.NameUndefinedException;
import pl.javastart.task.model.Person;

public class Main {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Jan", null, 25, "1234567890");
            System.out.println(person1);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person person2 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person2);
            person2.setAge(-10);
            System.out.println(person2);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
