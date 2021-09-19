package main.java;

public abstract class DressDecorator implements IDress {

    private IDress dress;

    public DressDecorator(IDress drs) {
        this.dress = drs;
    }

    @Override
    public void assemble() {
        this.dress.assemble();
    }
}
