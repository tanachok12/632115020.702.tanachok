package week8;

public class Bird extends Pet {
    String country;
    String chirping;
    String fly;
    
    public Bird(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void ChekCountry(){
        System.out.println("My Birb country is "+ country);
    }
    public void chirping(){
        System.out.println("My birds  chirping  :"+ chirping);      
    }
    public void itisfly(){
        if(fly == "Fly"){
            System.out.println("Is can fly : true");
        }else if(fly == "Notfly"){
        System.out.println("Is can fly : false");
        }
    }

}
