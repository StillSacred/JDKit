public class Main {

    public static void main(String[] args) {
        Thread p1 = new Thread(new Philosopher("Pholosopher1"));
        Thread p2 = new Thread(new Philosopher("Pholosopher2"));
        Thread p3 = new Thread(new Philosopher("Pholosopher3"));
        Thread p4 = new Thread(new Philosopher("Pholosopher4"));
        Thread p5 = new Thread(new Philosopher("Pholosopher5"));

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}