package Interface;

public class Refrigerator implements RemoteControl {
    public boolean onOff = false;

    public void turnOn() {
        onOff = true;
    }

    public void turnOff() {
        onOff = false;
    }

    public void printInfo() {
        System.out.println(onOff);
    }
}
