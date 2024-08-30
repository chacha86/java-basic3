package day6.objectArrayList;

import java.util.ArrayList;

public class ObjectArrayList {
    public static void main(String[] args) {

        String name1 = "홍길동";
        int age1 = 20;

        ArrayList<String> names = new ArrayList<>();
        names.add(name1);

        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(age1);


        Person p1 = new Person();
        p1.name = name1;

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);


    }
}
