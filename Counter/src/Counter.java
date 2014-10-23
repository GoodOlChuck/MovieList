public class Counter {

    private int value, max;

    public Counter(int max) {
        value = 0;
        this.max = max;
    }

    public int getValue() {
        return value;
    }
    
    public void increment() {
        value ++;
        if (value == max) value = 0;
    }
}
