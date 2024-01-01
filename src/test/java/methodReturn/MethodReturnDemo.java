package methodReturn;

import constructorDemo.ConstructorPractice;

public class MethodReturnDemo {


   public void location(){
        System.out.println("hello");
    }


    public String location1(){
        String location = "Texas";
        return location;
    }


    public int zipCode(){
        int myZip = 11354;
        return myZip;
    }



    public static void main(String[] args) {
        MethodReturnDemo obj = new MethodReturnDemo();
        obj.location();


        System.out.println(obj.location1());
       int myZipfromClass = obj.zipCode();
        System.out.println(myZipfromClass);


        ConstructorPractice obj1 = new ConstructorPractice("Musa",102, 1);
     String newName = obj1.name;
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        ConstructorPractice obj3 = new ConstructorPractice("New York");
        System.out.println(obj3.location);

    }




}
