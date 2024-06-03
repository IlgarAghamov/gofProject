package org.example.factory;

public class WorkTaskFactory extends TaskFactory {
    public Task createTask() {
        return new WorkTask();
    }
}
