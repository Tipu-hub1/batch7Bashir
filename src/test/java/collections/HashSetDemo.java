package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    /*
    Set is an Interface and HashSet is a class. HashSet implements Set
    HashSet does not allow duplicate value
    HashSet does not follow insertion order
     */


    public void HashSetPractice(){
        Set<String> cars = new HashSet<>();

        cars.add("Rickshaw");
        cars.add("Murir Tin");
        cars.add("Leguna");
        cars.add("Tomtom");
        cars.add("CNGCar");
        cars.add("Tomtom");

        int carSize = cars.size();
        System.out.println(carSize);

        System.out.println(cars);

      boolean honda =   cars.contains("Honda");
        System.out.println(honda);

        // Add integer value for set and try to use Collections class..

        Set<Integer> Num = new HashSet<>();

        Num.add(5);
        Num.add(7);
        Num.add(8);
        Num.add(12);
        Num.add(15);
        Num.add(18);

        for (int i = 1; i<20; i++){
            if (Num.contains(i)){
                System.out.println(i + " is there");
            }
            else {
                System.out.println(i + " is not there");
            }
        }

    }



    public static void main(String[] args) {
        HashSetDemo ref = new HashSetDemo();
        ref.HashSetPractice();
    }

}
