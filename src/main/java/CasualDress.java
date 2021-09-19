package main.java;

public class CasualDress extends DressDecorator {

    public CasualDress(IDress drs) {
        super(drs);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Casual Feature");
    }
}
