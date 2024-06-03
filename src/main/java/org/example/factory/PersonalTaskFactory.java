package org.example.factory;

// Конкретные фабрики для задач
public class PersonalTaskFactory extends TaskFactory {
    public Task createTask() {
        return new PersonalTask();
    }
}
