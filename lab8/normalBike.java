package  lab8;

public class normalBike extends bicycle{

    public normalBike(int currentSpeed){
        setCurrentSpeed(currentSpeed);
        System.out.println("Normal Bike!");
        if(checkSpeed(getCurrentSpeed())){
            setCurrentSpeed(getCurrentSpeed()-currentSpeed);
        }
    }
    public void speedup(){
        setCurrentSpeed(getCurrentSpeed()+ getConstanceSpeed());
        if (checkSpeed(getCurrentSpeed())) {
            setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
        }
    }

    public void Break() {
        setCurrentSpeed(getCurrentSpeed() - getConstanceSpeed());
    }
}
