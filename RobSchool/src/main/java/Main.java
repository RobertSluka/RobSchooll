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
// TODO: v??etko toto p????eme sem do mainu
//  1 list mien, aspo?? 10 vec?? hardcoded, takisto list ????sel ??o bude vek, 10 RANDOM ????sel v ??om
//  2 for loop ktor?? vytvor?? 10 Persons, s t??m ??e to meno a vek zoberie randomne z t??ch listov
//  3 vyp??sa?? AllPeople, bude treba asi toString
//  4 vysk????a?? v??etky met??dy z Containera ??i funguj?? tu v maine, ??t??lom ??e:
//

// TODO: ke?? bude?? ch??pa?? ako funguje toto s Person a v??etko ti p??jde, sprav???? to ist?? so School ide??lne bez pozerania do k??du
// TODO: a s??m si t?? School navrhne?? ak?? met??dy bud?? v tom kontajneri, ako si vytvor???? t?? school, etc. precvi??uj for, random, iterovanie listom

// BONUS: list bude len abeceda a to meno pre person/??kolu posklad???? z 5-8 p??smen


