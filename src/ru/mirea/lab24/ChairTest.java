package ru.mirea.lab24;

public class ChairTest {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Client client = new Client();

        VictorianChair vic = factory.createVictorianChair(4242);
        MagicChair mc = factory.createMagicChair();
        FunctionalChair fc = factory.createFunctionalChair();

        client.sit(vic);
        client.sit(mc);
        mc.doMagic();
        client.sit(fc);
        int res = fc.sum(21,21);
        System.out.print(res);
    }
}
