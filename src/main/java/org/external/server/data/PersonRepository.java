package org.external.server.data;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository {
    private final Map<String, Persons> persons = new HashMap<>();
    public PersonRepository(){
        onInit();
    }
    void onInit(){

        Persons johnJohnson = new Persons();
        johnJohnson.setMail("jj@mail.ma");
        johnJohnson.setFirstName("John");
        johnJohnson.setLastName("Johnson");
        johnJohnson.setRegistrationNumber(1010101);
        johnJohnson.setLicenceNumber("AA0001AA");
        johnJohnson.setDate("01.01.1980");

        persons.put(johnJohnson.getFirstName()+" "+johnJohnson.getLastName(), johnJohnson);

        Persons peterPeterson = new Persons();
        peterPeterson.setMail("pp@mail.ma");
        peterPeterson.setFirstName("Peter");
        peterPeterson.setLastName("Peterson");
        peterPeterson.setRegistrationNumber(2020202);
        peterPeterson.setLicenceNumber("AA0002AA");
        peterPeterson.setDate("02.02.1981");

        persons.put(peterPeterson.getFirstName()+" "+peterPeterson.getLastName(), peterPeterson);

        Persons stevenStevenson = new Persons();
        stevenStevenson.setMail("ss@mail.ma");
        stevenStevenson.setFirstName("Steven");
        stevenStevenson.setLastName("Stevenson");
        stevenStevenson.setRegistrationNumber(3030303);
        stevenStevenson.setLicenceNumber("AA0003AA");
        stevenStevenson.setDate("03.03.1983");

        persons.put(stevenStevenson.getFirstName()+" "+stevenStevenson.getLastName(), stevenStevenson);
    }
    public Persons findPerson(String name){
        return persons.get(name);
    }

}
