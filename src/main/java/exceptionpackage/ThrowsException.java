package exceptionpackage;

public class ThrowsException {
    public static void main(String[] args) throws LicenseException {

        ThrowsException.ThrowsExceptionMethod(10);
        ThrowsException.ThrowsExceptionMethod02(8);
    }

    public static void ThrowsExceptionMethod(int age) throws LicenseException {
        if (age<18){
            throw new LicenseException("Not Eligible to Open Account");
        } else {
            System.out.println("Eligible to open a new account");
        }
    }

    public static void ThrowsExceptionMethod02(int age) {
        if (age<18){
            throw new ArithmeticException("Not Eligible to Open Account");
        } else {
            System.out.println("Eligible to open a new account");
        }
    }
}
