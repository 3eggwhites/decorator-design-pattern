package main.java;

public class SportyDress extends DressDecorator {

    public SportyDress(IDress drs) {
        super(drs);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sporty Feature");
    }
}
