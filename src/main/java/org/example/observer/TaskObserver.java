
package org.example.observer;

// Конкретный наблюдатель
public class TaskObserver implements Observer {
    private String name;

    public TaskObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}
