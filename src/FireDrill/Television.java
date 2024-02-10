package FireDrill;

public class Television {

    private boolean isOn ;
    private int volume;
    private int channel;


    public boolean isOn() {
        return isOn;
    }


    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void increaseVolume() {

        if (isOn() && volume < 100) {
            volume++;

        }

    }
    public void decreaseVolume() {

        if (isOn() && volume > 0) volume--;
    }

    public int getVolume() {
        return volume;
    }

    public void changeChannel() {
        if(channel >0)  {
            channel +=1;
        }
    }

    public int getChannel() {
        return channel;
    }
}
