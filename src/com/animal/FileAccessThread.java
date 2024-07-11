package com.animal;

public class FileAccessThread extends Thread {
    private final FileResource file1;
    private final FileResource file2;

    public FileAccessThread(String name, FileResource file1, FileResource file2) {
        super(name);
        this.file1 = file1;
        this.file2 = file2;
    }

    @Override
    public void run() {
        synchronized (file1) {
            System.out.println(getName() + " locked " + file1.getName());
            try {
                Thread.sleep(500); // Simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            synchronized (file2) {
                System.out.println(getName() + " locked " + file2.getName());
                file1.access();
                file2.access();
            }
        }
    }
}

