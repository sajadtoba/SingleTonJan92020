package testUnit;

public class Main {
    public static void main(String[] args) {

        //SingleTonDemo singleTonDemo = new SingleTonDemo();
        //SingleTonDemo.getInstance();
        SingleTonDemo obj1 = SingleTonDemo.getInstance();
        SingleTonDemo obj2 = SingleTonDemo.getInstance();
        System.out.println(obj2.getNumber());

        System.out.println(obj1.getName());
        System.out.println(obj1.getNumber());
        obj1.setNumber(178);
        System.out.println(obj1.getNumber());


    }
}
