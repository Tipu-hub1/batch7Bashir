package javaPackages.exceptionDemo;

import javaPackages.interfaceDemo.InterfaceA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPractice {

    /* There are two types of exceptions
    i. Compile Time Exceptions
         a. InterruptionException
         b. FileNotFound Exception

    ii. Run time Exceptions (logical exception)
         a. ArrayIndexoutofBound Exception
         b.StringIndexOutOfBoundsException
         c.NumberFormatException
     */

    public void compileTimeException() throws InterruptedException, IOException {

        System.out.println(3+3);
        Thread.sleep(10000);
        System.out.println(4*4);
        System.out.println(9+8);

        FileInputStream fs = new FileInputStream("src/test/java/info.properties");
        int number = fs.available();
        System.out.println(number);
    }


    public void runtimeException(){
        String name[] = {"Arafat", "Emu", "Razia"};

       // System.out.println(name[3]);

        String location = "Pennsylvania";
       // char lastLetter = location.charAt(15);
        int locatioNumber = Integer.valueOf(location);
        System.out.println(locatioNumber);


    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ExceptionsPractice obj  = new ExceptionsPractice();
        //obj.compileTimeException();
        obj.runtimeException();
    }

}
