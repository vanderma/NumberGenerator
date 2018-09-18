package ch.vanderma;

public class Counter {

    final ConsoleOutput output;
    int number = 0;

    public Counter(ConsoleOutput output) {
        this.output = output;
    }

    public void generateNextNumber() {
        number++;
        output.handleNumberChanged(number);
    }
}
