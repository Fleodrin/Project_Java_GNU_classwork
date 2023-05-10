package Interface;

interface Phone {
    void sendCall();
}

interface MobilePhone extends Phone {
    void sendSMS();
}

interface Camera {
    void takePicture();
}

abstract class PDA {
    void playMusic() {
    }
}

class SmartPhone extends PDA implements MobilePhone, Camera {

    public void sendCall() {

    }

    public void sendSMS() {

    }

    public void takePicture() {

    }
}
