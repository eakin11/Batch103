package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice() {
        System.out.println("Solve guestions");


    }

    public Math() {
super("X");
        System.out.println("Constructur 1");
    }

    public Math(int a) {
        this();

        System.out.println("Constructur 2");



    }
}