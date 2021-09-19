package main.java;

public class FancyDress extends DressDecorator {

    public FancyDress(IDress drs) {
        super(drs);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Fancy Feature");
    }
}
