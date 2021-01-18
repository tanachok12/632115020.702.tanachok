package week8;

public class Dog extends Pet {
    String size;
    String bark;
    String hair;
    
    public Dog(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void Run(){
        System.out.println("My dog is "+ name );
    }
    public void Barksound(){
        System.out.println(size + " bark "+ bark);      
    }
    public void itislonghair(){
        if(hair == "normal"){
            System.out.println("normal hair : true");
        }else if(hair == "Long"){
        System.out.println("normal hair : false");
        }
    }

}
