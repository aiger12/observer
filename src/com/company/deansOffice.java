package com.company;

import java.util.ArrayList;
import java.util.List;
//import java.util.Observer;

public class deansOffice implements IObserable {
    private List<IObserver> observers;
    private final Object MUTEX=new Object();
    private String message;
    private boolean changed;
    public deansOffice(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void add(IObserver obj) {
        if(obj==null)throw new NullPointerException("Null Observer");
        synchronized (MUTEX){
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void remove(IObserver obj) {
        synchronized (MUTEX){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<IObserver> observersLocal = null;
//        synchronized (MUTEX) {
//            if (!changed)
//                return;
//            observersLocal = new ArrayList<>(this.observers);
//            this.changed=false;
//        }
        for (IObserver obj : observers) {
            obj.setTopic(this.message);
        }
    }


    public void postMessage(String msg){
        System.out.println("NEWS FOR THIS WEEK:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
