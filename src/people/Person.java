package people;

import java.util.*;


public class Person {

    public String name;
    public int age;
    public String city;
    public ArrayList<Person> friends;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.friends = new ArrayList<>();
    }
        public void introduce () {
            System.out.println("My name is " + this.name);
            System.out.println("I'm " + this.age + " years old");
            System.out.println("My friends are:");
            for (Person s : friends) {
                System.out.println(s.name);
            }
        }
    }

