package ch.stefanhohl.sh.simplecounter.entity;

/**
 * @author stefan.hohl
 * @version 16.10.2021
 */
public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void addCount(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
