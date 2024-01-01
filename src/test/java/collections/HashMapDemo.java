package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    // Map is an Interface but HashMap is a class. HashMap implements Map
    // HashMap can hold two datatypes
    // Hashmap is a key value pairs
    // One object is used a Key and another is used as Value
    // The key should be unique



public void hashMapPractice(){
    Map<Integer, String> cars= new HashMap<>();

    cars.put(1, "Toyota"); // here 1 is Key and "Toyota" is Value
    cars.put(2, "Nissan");
    cars.put(3, "BMW");
    cars.put(4, "Lexus");
    cars.put(5, "Tesla");
    cars.put(5, "Kia");
    cars.put(6, "Honda");
    cars.put(7, "Honda");

    System.out.println(cars.get(3));
    System.out.println(cars);

    cars.remove(7);
    System.out.println(cars);
    cars.put(7, "Honda");

    cars.replace(3, "Ford");
    System.out.println(cars);

    boolean boo = cars.containsKey(3);
    System.out.println(boo);

    boolean ford = cars.containsValue("Ford");
    System.out.println(ford);
}


public void hashMapPractice2(){
    Map<String, String> capitalCity = new HashMap<>();

    capitalCity.put("India", "Delhi");
    capitalCity.put("Pakistan", "Islamabad");
    capitalCity.put("Bangladesh", "Dhaka");

    Map<String, Integer> zipCode = new HashMap<>();
    zipCode.put("Arafat", 11344);

}

    public static void main(String[] args) {
        HashMapDemo ref = new HashMapDemo();
        ref.hashMapPractice();
    }








}