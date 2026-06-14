package practice.level15;

public class task11 {
    public static void main(String[] args) {
        SmartLamp lamp = new SmartLamp();
        lamp.setCurrentlyOn(true);
        System.out.println(lamp.isCurrentlyOn());

    }
}

class SmartLamp {
    private boolean isCurrentlyOn;

    SmartLamp() {
        this.isCurrentlyOn=false;
    }

    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }

    public void setCurrentlyOn(boolean newState) {
        this.isCurrentlyOn=newState;
    }
}