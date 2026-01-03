package sampleinterfacepackage;

public class SampleClass implements SampleInterface {
    public void classMethod(){
        System.out.println("Printing from the instance method inside the Class");
    }

    @Override
    public void sampleAbstractMethod01() {
        System.out.println("Interface Method 01 definition");
    }

    @Override
    public void sampleAbstractMethod02() {
        System.out.println("Interface Method 02 definition");
    }

    public static void main(String[] args) {
        SampleClass obj01 = new SampleClass();
        obj01.classMethod();
        obj01.sampleAbstractMethod01();
        obj01.sampleAbstractMethod02();


        System.out.println("First int variable from interface - " + SampleInterface.num01);
        System.out.println("Second int variable from interface - " + obj01.num02);

        //Interface doesn't have constructor, but we can create 'interface object' in another way
        //We can only create an object of the type Interface using the constructor of the class
        //That constructor/object can only access the properties of the interface
        SampleInterface obj02 = new SampleClass();
        //We cannot access the method of the class using the object of the type Interface
        //obj02.classMethod();
        obj02.sampleAbstractMethod01();
        obj02.sampleAbstractMethod02();
        System.out.println("First int variable from interface - " + obj02.num01);
        System.out.println("Second int variable from interface - " + num02);

    }
}
