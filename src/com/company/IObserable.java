package com.company;

import java.util.Observer;

public interface IObserable {
    public void add(IObserver obj);
    public void remove(IObserver obj);
    public void notifyObservers();
}
