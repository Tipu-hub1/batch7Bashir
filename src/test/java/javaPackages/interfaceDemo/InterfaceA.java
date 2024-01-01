package javaPackages.interfaceDemo;

public interface InterfaceA {
    // Interface is a process when Hiding the implementation showing only functionality
    // Interface cannot be instantiated.
    // Interface can hold only abstract methods
    // Interface can be 100% abstraction.
    // In Interface the variables are final by default

    int cardNo = 244535353;
    String customerName = "Bashir";
    int cvvNo = 434;
    String billingAddress = "144-25 Roosevelt Ave";
    int exp = 1225;


    public void placeOrder();

    public void emailMessage();



    public static void main(String[] args) {
        //InterfaceA obj = new InterfaceA();

    }




}