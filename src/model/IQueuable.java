package model;

import java.util.LinkedList;
import java.util.List;

public abstract class IQueuable {
    protected List<String> contents;

    // EFFECTS: constructs an empty IQueuable
    public IQueuable() {
        contents = new LinkedList<>();
    }

    // EFFECTS: adds an element and returns it
    public String[] enqueue(String v) {
        contents.add(v);
        return contents.toArray((new String[contents.size()]));
    }

    // REQUIRES: IQueuable has at least one element
    // EFFECTS: removes an element and returns the element removed
    public abstract String dequeue();

    // EFFECTS: returns contents as an array
    public String[] getQueue() {
        return contents.toArray((new String[contents.size()]));
    }

    // EFFECTS: returns size of contents
    public int size() {
        return contents.size();
    }
}