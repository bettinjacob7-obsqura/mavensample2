package sampleinterfacepackage;

public interface SampleInterface {
    //correct format for an interface variable
    public static final int num01 = 10;
    // allowed to declare like this, JVM will rewrite in the correct interface variable format during compilation
    int num02 = 20;

    //correct format for an interface method
    public abstract void sampleAbstractMethod01();
    // allowed to declare like this, JVM will rewrite in the correct interface method format during compilation
    public void sampleAbstractMethod02();


}
