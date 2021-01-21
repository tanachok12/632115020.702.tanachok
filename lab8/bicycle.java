package lab8;

public class bicycle{
    private int currentSpeed;
    final private static int SPEEDUPDOWN = 5;
    public bicycle(){
        
    }
    public void setCurrentSpeed(int setCurrentSpeed){
        this.currentSpeed = setCurrentSpeed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public int getConstanceSpeed(){
        return SPEEDUPDOWN;
    }
    public void displaySpeed(){
        System.out.println(getCurrentSpeed()+" km/h.");
    }
    public boolean checkSpeed(int getspeed){
        if(getspeed > 99){
            System.out.println("can't go 99");
            return true;
        }
        else {
            return false;
        }
    }
}