package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

/*
List is an Inteface and Arraylist implements List
ArrayList is not fixed. it is dynamic
Arraylist can hold duplicate value
ArrayList follows insertion order
 */
    public void arrayListPractice(){



//        String name[] = {"Ashraf", "Sumaia", "Jewel", "Rupok"};
//
//        System.out.println(name.length);

        List<String> name = new ArrayList<>();
     boolean isEmptyOrNotBeloreAdd =  name.isEmpty();
        System.out.println(isEmptyOrNotBeloreAdd);

        name.add("Ashfar");
        name.add("Sumaia");
        name.add("Jewel");
        name.add("Rupok");

        boolean isEmptyOrNotAfterAdd =  name.isEmpty();
        System.out.println(isEmptyOrNotAfterAdd);

        System.out.println(name);

        System.out.println(name.size());

        name.add("Razia");
        System.out.println(name);

        name.remove("Sumaia");
        System.out.println(name);


        name.add(1, "Sumaia");
        System.out.println(name);

        name.add("Razia");
        System.out.println(name);



//        for (int i = 0; i < name.size(); i ++){
//            System.out.println(name.get(i));
//        }

        // for each loop
        for(String n : name){
            System.out.println("The names contains "+ n);
        }

    }

 public void arrayListPractice2(){
     List<Integer> number = new ArrayList<>(); // Integer is a wrapper Class

     boolean isEmptybefore = number.isEmpty();
     System.out.println(isEmptybefore);

     number.add(50);
     number.add(60);
     number.add(70);
     number.add(80);
     number.add(80);
     number.add(90);

     boolean isEmptyAfter = number.isEmpty();
     System.out.println(isEmptyAfter);

     int size = number.size();
     System.out.println("Size of the numberList is " + size);

     System.out.println(number);

    int thirdNumber =  number.get(2);
     System.out.println(thirdNumber);

     number.remove(2);

     System.out.println(number);

     number.add(2, 70);
     System.out.println(number);

    boolean ninetyIsThereOrNot =  number.contains(90);
     System.out.println(ninetyIsThereOrNot);

     Collections.shuffle(number);
     System.out.println(number);

     Collections.sort(number);
     System.out.println(number);

     Collections. reverse(number);
     System.out.println(number);


     Collections.sort(number);
     System.out.println(number);

     int minimumNumber = Collections.min(number);
     System.out.println(minimumNumber);

     int maximumNumber = Collections.max(number);
     System.out.println(maximumNumber);

// for loop for accessing the list and print all the element of the list
//     for (int i = 0; i < number.size(); i ++){
//         System.out.println("The list contains "+ number.get(i));
//     }


     // for each loop
     for (Integer n : number){
         System.out.println(n);
     }

 }




    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.arrayListPractice();
       // obj.arrayListPractice2();
    }

}
