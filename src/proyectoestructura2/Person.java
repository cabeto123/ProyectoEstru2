/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructura2;

/**
 *
 * @author dcasc
 */
public class Person {
    private String name;
    private int age;
    private int cityId;

    public Person(String name, int age, int cityId) {
        this.name = name;
        this.age = age;
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Person createPerson(String name, int age, int cityId) {
        return new Person(name, age, cityId);
    }

    public static Person parsePersonData(String data) {
        String[] parts = data.split(",");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid person data format");
        }
        String name = parts[0].trim();
        int age = Integer.parseInt(parts[1].trim());
        int cityId = Integer.parseInt(parts[2].trim());
        return new Person(name, age, cityId);
    }

    public static Person fromString(String data) {
        String[] parts = data.split(",");
        if (parts.length == 3) {
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());
            int cityId = Integer.parseInt(parts[2].trim());

            return new Person(name, age, cityId);
        } else {
            return null;
        }
    }
}
