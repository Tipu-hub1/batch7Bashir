package constructorDemo;

public class ConstructorPractice {
// Constructor is a special method that has the same name as class
   public String name;
   public int id;
   public int batch;

   public String location;


    public ConstructorPractice( String name,int id,int batch ){
       this.name = name;
       this. id = id ;
       this. batch = batch;
    }

    public ConstructorPractice( String location ){
        this.location = location;
    }



    public static void main(String[] args) {
        ConstructorPractice obj1 = new ConstructorPractice("Anjuman", 101,1  );
//        obj1.name = "Anjuman";
//        obj1.id  = 101;
//        obj1.batch = 1;
        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);

        System.out.println("-----------------------");

        ConstructorPractice obj2 = new ConstructorPractice("Naznin", 201, 2);
//        obj2.name = "Naznin";
//        obj2.id  = 201;
//        obj2.batch = 2;

        System.out.println(obj2.name);
        System.out.println(obj2.id);
        System.out.println(obj2.batch);

        System.out.println("-----------------------");

        ConstructorPractice obj3 = new ConstructorPractice("Razia", 301, 3);
//        obj3.name = "Razia";
//        obj3.id  = 301;
//        obj3.batch = 3;

        System.out.println(obj3.name);
        System.out.println(obj3.id);
        System.out.println(obj3.batch);


        ConstructorPractice obj4 = new ConstructorPractice("New York");
        System.out.println(obj4.location);

    }




}
