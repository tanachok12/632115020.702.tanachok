public class NerfGun {
    int ammuition;
    int ID;

    public NerfGun() {
        ammuition = 0;
        ID++;
    }

    public NerfGun(int ammo) {
        this.ammuition = ammo;
        ID++;
    }

    public void fire() {
        if (ammuition > 0) {
            System.out.println("BANG !!!");
            ammuition -= 1;
        } else
            System.out.println("There is no ammuition");
    }

    public void displayNumOfAmmunition() {
        System.out.println(ammuition + " bullet left");
    }

    public void reload(int bullet) {
        if (ammuition + bullet <= 15)
            ammuition += bullet;
        else
            System.out.println("Error!! the ammuition is overload");
    }

    public void displayGunID() {
        System.out.println("The ID of this gun is " + ID);
    }
}
