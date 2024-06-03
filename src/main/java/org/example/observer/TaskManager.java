
package org.example.observer;

import java.util.ArrayList;
import java.util.List;

// Класс задач, реализующий Subject
public class TaskManager implements Subject {
    private List<Observer> observers;
    private List<String> tasks;

    public TaskManager() {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New task added");
        }
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
}
