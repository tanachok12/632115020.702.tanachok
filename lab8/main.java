package lab8;

public class main {
    public static void main(String[] args) {
        normalBike nb = new normalBike(10);
        nb.speedup();
        nb.Break();
        nb.speedup();
        nb.displaySpeed();
        mountainBike mb = new mountainBike(10);
        mb.gear(2);
        mb.Break();
        mb.displaySpeed();
        mb.gear(3);
        mb.displaySpeed();
        mb.gear(14);
        mb.displaySpeed();
    }
}
