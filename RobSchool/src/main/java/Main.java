//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

import Model.School;
import container.PersonContainer;
import container.SchoolContainer;
import controller.PersonController;
import controller.SchoolController;
import model.Person;

public class Main {
    static int pick;
    static String randomSchoolName;
    static int schoolRand;

    public Main() {


    }
    static String generateNameFromABC (int l){
        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXY";
        StringBuilder s = new StringBuilder(l);
        int i;
        for(i=0;i < l;i++){
            int ch = (int) (AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        PersonController controller = new PersonController();
        SchoolController schoolController = new SchoolController();
        List<String> names = new ArrayList();
        names.add("Robike");
        names.add("Marek");
        names.add("Juri");
        names.add("Misko");
        names.add("Martin");
        names.add("Sepetlak");
        names.add("Patres");

        List<Integer> ages = new ArrayList();
        Random generate = new Random();

        for(int i =0;i<names.size();i++){
            pick = generate.nextInt(90);
            ages.add(pick);
        }

        List<String> schoolNames = new ArrayList<>();
        for(int i=0; i<5;i++){
            randomSchoolName = generateNameFromABC(10);
            schoolNames.add(randomSchoolName);
        }

        List<String> schoolAddresses = new ArrayList<>();
        schoolAddresses.add("Marianska");
        schoolAddresses.add("Energetikov");
        schoolAddresses.add("Dobsinska");
        schoolAddresses.add("Malonecpalska");
        schoolAddresses.add("Rastislavova");

        List<Integer> schoolCapacities = new ArrayList<>();
        for(int i =0;i<schoolNames.size();i++){
            schoolRand = generate.nextInt(100);
            schoolCapacities.add(schoolRand);
        }


        for (int i = 0; i < names.size(); ++i) {
            PersonContainer.getInstance().addPersonByObject(new Person((String) names.get(generate.nextInt(names.size())), (Integer) ages.get(generate.nextInt(ages.size()))));

        }

        for(int i =0; i<5;i++){
            schoolController.addSchoolByObject(new School((String) schoolNames.get(generate.nextInt(schoolNames.size())), (Integer) schoolCapacities.get(generate.nextInt(schoolCapacities.size())),(String) schoolAddresses.get(generate.nextInt(schoolAddresses.size()))));
        }


//        Person p = new Person("Marco", 22);
//        PersonContainer.getInstance().addPersonByFields("Marco",11);
        System.out.println(schoolController);
//        System.out.println(PersonContainer.getInstance().toString());
//        controller.getAllPeople();
//        controller.getPeopleByAgeMoreThan(22);
//        controller.getPersonByName("Marek");

//        Collections.shuffle(PersonContainer);
//        PersonContainer.getInstance().removePersonByName("Robike");
//        System.out.println(PersonContainer.getInstance().toString());

//        PersonContainer.getInstance().getPeopleByAgeMoreThan(26);
////        PersonContainer.getInstance().getPersonByName("Marek");
//        PersonContainer.getInstance().getAllPeople();

    }




}



//    Person p = new Person("robike", 24);
//        PersonContainer.getInstance().addPersonByObject(p);
//        System.out.println(PersonContainer.getInstance().getAllPeople());
// TODO: všetko toto píšeme sem do mainu
//  1 list mien, aspoň 10 vecí hardcoded, takisto list čísel čo bude vek, 10 RANDOM čísel v ňom
//  2 for loop ktorý vytvorí 10 Persons, s tým že to meno a vek zoberie randomne z tých listov
//  3 vypísať AllPeople, bude treba asi toString
//  4 vyskúšať všetky metódy z Containera či fungujú tu v maine, štýlom že:
//

// TODO: keď budeš chápať ako funguje toto s Person a všetko ti pôjde, spravíš to isté so School ideálne bez pozerania do kódu
// TODO: a sám si tú School navrhneš aké metódy budú v tom kontajneri, ako si vytvoríš tú school, etc. precvičuj for, random, iterovanie listom

// BONUS: list bude len abeceda a to meno pre person/školu poskladáš z 5-8 písmen


