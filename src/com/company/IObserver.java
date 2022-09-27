package com.company;

import java.util.Observable;

public interface IObserver {
    public void update();
    public void setTopic(String topic);
}
