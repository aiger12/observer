package com.company;

import java.util.Observable;

public class Student implements IObserver{
    private String name;

    private String topic;

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Student(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = topic.toString();
        if(msg == null){
            System.out.println(name+" :: No new message");
        }else
            System.out.println(name+" :: Consuming message:: "+msg);
    }
}
