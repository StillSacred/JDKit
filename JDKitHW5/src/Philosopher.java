public class Philosopher implements Runnable{
    private String name;
    private boolean isHungry = false;
    private int counter;

    public Philosopher(String name) {
        this.name = name;
    }

    public void meditate() {
        if (!isHungry) {
            System.out.println(name + " is meditating");
            isHungry = true;
        }
    }

    public void eat() {
        if (isHungry) {
            System.out.println(name + " is eating");
            counter++;
            isHungry = false;
        }
    }

    @Override
    public void run() {
        while (counter < 3) {
            if (isHungry) {
                try {
                    eat();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                meditate();
            }
        }
    }
}