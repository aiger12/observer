package com.company;

import java.util.Observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        //create subject
        deansOffice topic = new deansOffice();

        //create observers
        IObserver obj1 = new Student("Raikhan");
        IObserver obj2 = new Student("Aigerim");
        IObserver obj3 = new Student("Binary");

        //register observers to the subject
        topic.add(obj1);
        topic.add(obj2);
        topic.add(obj3);

        //now send message to subject
        topic.postMessage("Schelude UPDATED FINALLY!");

        obj1.update();
    }

}
