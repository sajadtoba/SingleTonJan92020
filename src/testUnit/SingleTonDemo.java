package testUnit;

public class SingleTonDemo {

    private int number;
    private String name;

    // How to create the private constructor
    // it is the same way the regular but only change the access modifier

   // private SingleTonDemo(){}


    public SingleTonDemo(int number, String name) {
        this.number = 10;
        this.name = "Singleton name";
    }
    private static SingleTonDemo instance = new SingleTonDemo(10,"Singleton name");

    public static SingleTonDemo getInstance(){
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
