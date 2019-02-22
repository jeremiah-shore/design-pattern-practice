package net.jeremiahshore.patterns.behavioral.observer;

public interface Subject {

    public void register(Observer obs);
    public void deregister(Observer obs);
    public void notifyObservers();
    public Object getUpdate(Observer obs);

}

