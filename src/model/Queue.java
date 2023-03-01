package model;

public class Queue extends IQueuable {
    // EFFECTS: constructs an empty queue
    public Queue() {
        super();
    }

    // REQUIRES: queue is not empty
    // EFFECTS: removes first element from queue and returns it
    @Override
    public String dequeue() {
        String returnStr = contents.get(0);
        contents.remove(0);
        return returnStr;
    }
}
