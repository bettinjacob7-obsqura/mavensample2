package sampleinterfacepackage;

public class ClassChildMultipleInheritance implements InterParent1, InterParent2 {

    @Override
    public void displayMethod1() {
        System.out.println("Implementation of displayMethod1 from InterParent1");
    }

    @Override
    public void displayMethod2() {
        System.out.println("Implementation of displayMethod2 from InterParent2");
    }

    public void displayChildMethod() {
        System.out.println("Method from Child Class - ClassChildMultipleInheritance");
    }

    public static void main(String[] args) {
        ClassChildMultipleInheritance child = new ClassChildMultipleInheritance();
        child.displayMethod1();
        child.displayMethod2();
        child.displayChildMethod();
    }
}
