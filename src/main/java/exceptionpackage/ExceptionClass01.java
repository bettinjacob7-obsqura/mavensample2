package exceptionpackage;

import java.sql.Array;

public class ExceptionClass01 {

    String str1 = "Jacob";
    int arrayName[] = {6, 5, 45, 98, 156};

    public void arithmExp(){
        System.out.println("Before Exception from instance method");

        //try-catch blocks are used inside a method
        try{
            System.out.println((1/0));
        }
        catch (Exception e){
            System.out.println("Exception Handling start");
            System.out.println(e.toString());
            System.out.println("Exception Handling end");
        }
        finally {
            System.out.println("Printing the finally part");
        }
        //Will throw ArithmeticException and execution stopped if executed w/o Exception Handling
        //System.out.println((5/0));
        System.out.println("After Exception from instance method");
    }

    public void nullPntrExp(){
        System.out.println("Before Exception from instance method");

        //try-catch blocks are used inside a method
        try{
            System.out.println(arrayName[6]);
            //System.out.println(str1.charAt(5));
        }
        catch (Exception e){
            System.out.println("Exception Handling start");
            System.out.println(e.toString());
            System.out.println("Exception Handling end");
        }
        finally {
            System.out.println("Printing the finally part");
        }
        System.out.println("After Exception from instance method");
    }

    public static void main(String[] args) {
        ExceptionClass01 obj01 = new ExceptionClass01();
        System.out.println("Before Exception from main method");
        obj01.arithmExp();
        obj01.nullPntrExp();
        System.out.println("After Exception from main method");
    }
}
