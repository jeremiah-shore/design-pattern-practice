package net.jeremiahshore.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ExampleSubject implements Subject{

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();
    //todo: change this implementation to use conventional Mutex, e.g. new Semaphore(1)

    public ExampleSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obs) {
        if(obs == null) throw new NullPointerException("null observer");

        synchronized (MUTEX) {
            if(!observers.contains(obs))
                observers.add(obs);
                //todo: should this be implemented with a Set instead?
        }
    }

    @Override
    public void deregister(Observer obs) {
        synchronized (MUTEX) {
            observers.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        //synchronization ensures observers registered after message is received are not notified
        synchronized (MUTEX) {
            if(changed) {
                observersLocal = new ArrayList<>(observers);
                changed = false;
            }
        }

        observersLocal.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obs) {
        return message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to the topic" + message);
        this.message = message;
        changed = true;
        notifyObservers();
    }
}
