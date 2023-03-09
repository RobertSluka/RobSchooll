package container;

import model.School;

import java.util.LinkedList;
import java.util.List;

public class SchoolContainer {
    private static SchoolContainer instance;
    private final LinkedList<School> schools;

    public SchoolContainer() {
        schools = new LinkedList<>();
    }

    public static SchoolContainer getInstance() {
        if (instance == null) {
            instance = new SchoolContainer();
        }
        return instance;
    }
    public boolean addSchoolByFields(String name ,Integer capacity ,String address){
        return schools.add(new School(name,capacity,address));
    }

    public boolean addSchoolByObject(School s){
        return schools.add(s);
    }

    public LinkedList<School> getAllSchools(){
        return schools;

    }
}
