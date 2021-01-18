package week8;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog("mark", "bully", "white", 3);
        System.out.println("My dog");
        dog.size = "Thin";
        dog.bark = "Hong Hong";
        dog.hair = "normal";

        dog.intro();
        dog.Run();
        dog.Barksound();
        dog.itislonghair();

        Fish fish = new Fish("Toon", "Catfish", "Black and white", 1);
        System.out.println("My fish");
        fish.size = "Big";
        fish.water = "sea water";
        fish.speed = "fast";

        fish.intro();
        fish.IsSwimToTheSea();
        fish.SwimFast();

        Bird bird = new Bird("White-breasted Waterhen", "Bird", "black", 2);
        System.out.println("My bird");
        bird.country = "Thailand";
        bird.chirping= "wrak wrak";
        bird.fly = "Fly";

        bird.intro();
        bird.chirping();
        bird.ChekCountry();
        bird.itisfly();


    }
}
