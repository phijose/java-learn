package com.animal;

public class FileResource {
    private final String name;

    public FileResource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void access() {
        // Simulate file access
        System.out.println(Thread.currentThread().getName() + " accessing " + name);
        try {
            Thread.sleep(1000); // Simulate some delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

