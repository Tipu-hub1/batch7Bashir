package javaPackages.abastractDemo;

public abstract class AbstractA {
    // Abstract is a process when Hiding the implementation showing only functionality
    // Abstract class cannot be instantiated.
    // Abstract class can hold both abstract and non-abstract methods
    // Abstract class can be 0-100% abstraction.
    int cardNo;
    String customerName;
    int cvvNo;
    String billingAddress;
    int exp;

   public abstract void placeOrder();

   public abstract void emailMessage();



   public void cardInfo(){

 cardNo = 244535353;
 customerName = "Bashir";
 cvvNo = 434;
 billingAddress = "144-25 Roosevelt Ave";
 exp = 1225;

   }





    public static void main(String[] args) {
  //      AbstractA obj = new AbstractA();
//        obj.placeOrder();
    }





}
