package lab8;

public class mountainBike extends bicycle{
    public mountainBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Mountain Bike!");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
    }
    public void gear(int gear){
        setCurrentSpeed(getCurrentSpeed()+(gear* getConstanceSpeed()));
        if (checkSpeed(getCurrentSpeed())) {
            setCurrentSpeed(getCurrentSpeed() - (gear * getConstanceSpeed()));
        }
    }

    public void Break() {
        setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
    }
}