package javaPackages.abastractDemo;

public class ImplementAbstract extends AbstractA{



    public void placeOrder(){
        // connect with the bank server
        // verify info
        // return positive or negative response
       super.cardInfo();
        System.out.println(cardNo);
        System.out.println(customerName);
        System.out.println(cvvNo);
        System.out.println(billingAddress);
        System.out.println(exp);
        System.out.println("Your order has been placed");

    }


    public void emailMessage(){

        System.out.println("Your order has been successfull");

    }





    public static void main(String[] args) {
        ImplementAbstract obj = new ImplementAbstract();
       // obj.emailMessage();
        obj.placeOrder();
    }



}
