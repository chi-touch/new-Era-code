
package FireDrill;

public class Bike {
    private boolean isTurnOn;
    private boolean isTurnOff;

    private int speed;
    private int gear =1;

    public void powerOn(){
        isTurnOn = true;
    }
    public void powerOff(){
        isTurnOn = false;
    }
    public boolean isTurnOff(){
        return isTurnOff;
    }
    public boolean isTurnOn(){
        return isTurnOn;
    }



    public void changeGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;

        } else if (speed >= 21 && speed <= 30) {
            gear = 2;

        } else if (speed >= 31 && speed <= 40) {
            gear = 3;

        } else if (speed >= 41) {
            gear = 4;
        }
    }

    public void accelerate(){
        if(gear == 1 ){
            speed ++;
        }else if(gear == 2){
            speed +=2;
        }else if(gear ==3){
            speed +=3;
        }else if(gear ==4){
            speed +=4;
        }

        changeGear();

    }
    public int getSpeed(){
        return speed;

    }

    public void decelerate(){
        if(gear == 1 ){
            speed --;
        }else if(gear == 2){
            speed -=2;
        }else if(gear ==3){
            speed -=3;
        }else if(gear ==4){
            speed -=4;
        }

        if(speed < 0){
            speed = 0;
        }

            changeGear();
    }


    public int getGear() {
        return gear;
    }
}

