package model;

public class Stack extends IQueuable {
    // EFFECTS: constructs an empty stack
    public Stack() {
        super();
    }

    // REQUIRES: stack has at least one element
    // EFFECTS: removes last element from stack and returns it
    @Override
    public String dequeue() {
        String returnStr = contents.get(contents.size() - 1);
        contents.remove(contents.size() - 1);
        return returnStr;
    }
}