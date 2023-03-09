package controller;

import container.PersonContainer;
import model.Person;

import java.util.LinkedList;
import java.util.List;

public class PersonController {
    PersonContainer personContainer = new PersonContainer();


    public boolean addPersonByFields(String name, int age) {
        return PersonContainer.getInstance().addPersonByFields(name, age);}
    public boolean editPersonByFields(String name, int age) {
        return PersonContainer.getInstance().editPersonByFields(name, age)
                ;}
    // TODO: spravit ostatne
    public boolean addPersonByObject(Person p) {
        return PersonContainer.getInstance().addPersonByObject(p);}
    public boolean editPersonByObject(Person p) {
        return PersonContainer.getInstance().editPersonByObject(p);}
    public List<Person> getPersonByName(String name) {
        return PersonContainer.getInstance().getPersonByName(name);}
    public List<Person> getPeopleByAgeMoreThan(int age) {
        return PersonContainer.getInstance().getPeopleByAgeMoreThan(age);}

    public void removePersonByName(String name) {
        PersonContainer.getInstance().removePersonByName(name);

    }
    public LinkedList<Person> getAllPeople() {
        return PersonContainer.getInstance().getAllPeople();}




    @Override
    public String toString() {
        return "PersonController{" +
                "personContainer=" + personContainer +
                '}';
    }
}
