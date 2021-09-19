package main.java;

public class Client {
    public static void main(String[] args) {
        BasicDress basicDress = new BasicDress();
        basicDress.assemble();

        SportyDress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble();

        FancyDress fancyDress = new FancyDress(new SportyDress(new CasualDress(new BasicDress())));
        fancyDress.assemble();
    }
}
