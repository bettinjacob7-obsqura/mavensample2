package exceptionpackage;

public class LicenseException extends Exception{

    public LicenseException(String msg){
        super(msg);
        System.out.println(msg);
    }
}


