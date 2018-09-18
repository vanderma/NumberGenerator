package ch.vanderma;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        System.err.println("Hello World");

        Counter counter = new Counter(new ConsoleOutput());

        while(true) {
            counter.generateNextNumber();
            Thread.sleep(1000);
        }
    }
}
