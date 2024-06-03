package org.example.factory;

// Конкретные реализации задач
public class PersonalTask implements Task {
    public String getDetails() {
        return "Personal Task";
    }
}
