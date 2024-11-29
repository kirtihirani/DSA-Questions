package oopsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonComparator {
    private String name;
    private int age;
    public PersonComparator(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static class NameComparator implements Comparator<PersonComparator>{
        @Override
        public int compare(PersonComparator p1, PersonComparator p2){
            return p1.name.compareTo(p2.name);
        }
    }

    public static class AgeComparator implements Comparator<PersonComparator>{
        @Override
        public int compare(PersonComparator p1, PersonComparator p2){
            return Integer.compare(p1.age, p2.age);
        }
    }

    public static void main(String[] args){
        ArrayList<PersonComparator> li = new ArrayList<>();
        li.add(new PersonComparator("kirti", 23));
        li.add(new PersonComparator("divri", 25));
        Collections.sort(li, new NameComparator());
        System.out.println(li);
        Collections.sort(li, new AgeComparator());
        System.out.println(li);
    }

}
