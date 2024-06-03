
package org.example.observer;

// Интерфейс субъекта
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
