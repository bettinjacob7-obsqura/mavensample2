package samplepackagexx;

public class sampleclassxx {
    public static void main(String[] args) {

        // Call add method
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        // Call greet method
        String greeting = greet("Alice");
        System.out.println(greeting);

        // Call calculateArea method
        double area = calculateArea(5.0);
        System.out.println("Area of circle: " + area);

        // Call printMessage method
        printMessage("This is a simple message!");


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
