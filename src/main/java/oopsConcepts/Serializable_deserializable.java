package oopsConcepts;

import java.io.*;

public class Serializable_deserializable implements Serializable {
    public String name;
    public int age;
    public static void main(String[] args){
        Serializable_deserializable obj = new Serializable_deserializable();
        obj.name = "kiki";
        obj.age = 22;
        Serializable_deserializable deserializedObj;
        try{
            FileOutputStream fout = new FileOutputStream("store.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(obj);
            oout.close();
            System.out.println("object serialized");

            FileInputStream fin = new FileInputStream("store.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            deserializedObj = (Serializable_deserializable) in.readObject();
            in.close();
            fin.close();
            System.out.println(deserializedObj.name+ " "+ deserializedObj.age);

        } catch (IOException i){
            i.printStackTrace();
        } catch (Exception e){
            System.out.println("class not found");
            e.printStackTrace();
        }

    }
}
