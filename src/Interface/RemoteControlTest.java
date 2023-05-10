package Interface;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        RemoteControl ref = new Refrigerator();
        rc.turnOn();
        rc.printInfo();
        ref.printInfo();
    }
}
