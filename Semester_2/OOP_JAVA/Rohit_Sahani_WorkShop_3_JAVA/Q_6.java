//6. Create a class Lamp with attributes isOn to store boolean value. 
//Also create a method turnOn() to turn on the light, and turnOff() to turn off the light and print the on status of the light. 

package Week_3;

class Lamp {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON: " + isOn);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is ON: " + isOn);
    }
}

public class Q_6 {
    public static void main(String[] args) {
        Lamp Lamp = new Lamp();
        Lamp.turnOn();
        Lamp.turnOff();
    }
}