package controller;

import Model.School;
import container.SchoolContainer;

import java.util.LinkedList;
import java.util.List;


public class SchoolController {
    // TODO: see PersonController

    SchoolContainer schoolContainer = new SchoolContainer();


    public boolean addSchoolByFields(String name, Integer capacity, String address) {
        return SchoolContainer.getInstance().addSchoolByFields(name, capacity, address);
    }
    public boolean addSchoolByObject(School s) {
        return SchoolContainer.getInstance().addSchoolByObject(s);}

    public List<School> getAllSchools(){
        return SchoolContainer.getInstance().getAllSchools();
    }


}
