package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Person person = new Person("John", "Smith");
        Person teacher = new Teacher("María", "Montessori", "Educación");
        Person police = new PoliceOfficer("Jake", "Peralta", "B-99");
        Person doctor = new Doctor("Gregory", "House", "Nefrología e infectología");

        Map<String, Person> hashMap = new HashMap<>();
        hashMap.put("person", person);
        hashMap.put("teacher", teacher);
        hashMap.put("police", police);
        hashMap.put("doctor", doctor);

        return hashMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        Person police2 = new PoliceOfficer("Charles", "Boyle", "B-99");
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            entry.getValue().getDetails();
        }
    }
}
