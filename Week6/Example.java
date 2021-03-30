package Week6;
//tanachok 632115020
public class Example {
    public static void main(String[] args) {
        Rsheep1 R1 = new Rsheep1("BOOM", 14, "Male");
        Rsheep2 R2 = new Rsheep2("Poom", 15, "Male");
        Rsheep3 R3 = new Rsheep3("Jook", 16, "Male");
        Rsheep4 R4 = new Rsheep4("Tom", 17, "Male");
        Rsheep5 R5 = new Rsheep5("Tun", 18, "Male");
        Art art = new Art("Bom",13,"Male");

        art.genre = " Sad song";
        R1.Rsheep1 = " Industrial engineers";
        R2.Rsheep2 = " Computer user support specialists";
        R3.Rsheep3 = " Elementary school teachers";
        R4.Rsheep4 = "Speech-language pathologists";
        R5.Rsheep5 = "Industrial machinery mechanics";

        art.introduce();
        art.playMusic();
        R1.introduce();
        R1.Rsheep1();
        R2.introduce();
        R2.Rsheep2();
        R3.introduce();
        R3.Rsheep3();
        R4.introduce();
        R4.Rsheep4();
        R5.introduce();
        R5.Rsheep5();

    }
}
