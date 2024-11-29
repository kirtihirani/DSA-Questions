package oopsConcepts;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PersonComparable implements Comparable<PersonComparable>{
    private String name;
    private int age;
    public PersonComparable(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(PersonComparable other){
        return Integer.compare(this.age, other.age); // defines the natural ordering by age
    }
    @Override
    public String toString(){
        return "name: "+ name+ " age: "+age;
    }

    public static void main(String args[]){
        ArrayList<PersonComparable> li = new ArrayList<>();
        li.add(new PersonComparable("kirti", 25));
        li.add(new PersonComparable("divri", 24));
        Collections.sort(li);
        System.out.println(li);
    }
}
