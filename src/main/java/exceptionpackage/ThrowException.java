package exceptionpackage;

public class ThrowException {
    public static void ThrowExceptionMethod(int age){
        if (age<18){
            throw new ArithmeticException("Not Eligible to Open Account");
        } else {
            System.out.println("Eligible to open a new account");
        }
    }

    public static void main(String[] args) {
        try {
            ThrowException.ThrowExceptionMethod(15);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
