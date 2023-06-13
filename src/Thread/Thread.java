package Thread;

class Output implements Runnable {
    private String toSay;

    public Output(String st) {
        toSay = st;
    }

    public void run() {
        try {
            for (; ; ) {
                System.out.println(toSay);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Program {
    public static void main(String[] args) {
        Output out1 = new Output("Hello");
        Output out2 = new Output("There");
        Thread thr1 = new Thread(out1);
        Thread thr2 = new Thread(out2);
        thr1.start();
        thr2.start();
    }
}
