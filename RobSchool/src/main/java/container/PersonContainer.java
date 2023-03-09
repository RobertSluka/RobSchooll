package container;

import model.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonContainer {
    private static PersonContainer instance;
    private static LinkedList<Person> people;

    public PersonContainer() {
        people = new LinkedList<>();
    }

    public static PersonContainer getInstance() {
        if (instance == null) {
            instance = new PersonContainer();
        }
        return instance;
    }

    // TODO: implementacia
    public boolean addPersonByFields(String name, int age) {
        return people.add(new Person(name, age));}
    public boolean editPersonByFields(String name, int age)
    {return false;}
    public boolean addPersonByObject(Person p) {
        return people.add(p);}
    public boolean editPersonByObject(Person p) {return false;}
    public List<Person> getPersonByName(String name) {
        List<Person> names = new ArrayList<>();
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                names.add(p);
            }
        }
        System.out.println(names);
        return names;

    }

    public List<Person> getPeopleByAgeMoreThan(int age) {
        List<Person> ages = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > age) {
                ages.add(p);
            }

        }
        System.out.println(ages);
        return ages;
    }
    public void removePersonByName(String name) {
        for(Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                people.remove(p);

            }
        }
    }
    public LinkedList<Person> getAllPeople() {
        System.out.println(people);
        return people;

    }




    @Override
    public String toString() {
        return "PersonContainer{" +
                "people=" + people +
                '}';
    }
}
