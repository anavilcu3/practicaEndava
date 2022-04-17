package section3_inheritance.abstract_classes;


import section3_inheritance.interfaces.ex2.movement.Runner;

public class Dog extends Animal implements Runner {

    public Dog(int noOfLegs) {
        super(noOfLegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ham!");
    }
}
