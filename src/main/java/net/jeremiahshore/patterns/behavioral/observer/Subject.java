package net.jeremiahshore.patterns.behavioral.observer;

public interface Subject {

    public void register(Observer observer);
    public void deregister(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);

}
