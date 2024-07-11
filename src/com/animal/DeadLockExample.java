package com.animal;

public class DeadLockExample {
    public static void main(String[] args) {
        // Create file resources
        FileResource file1 = new FileResource("File1");
        FileResource file2 = new FileResource("File2");

        // Create threads that will cause a deadlock
        FileAccessThread thread1 = new FileAccessThread("Thread1", file1, file2);
        FileAccessThread thread2 = new FileAccessThread("Thread2", file2, file1);
        FileAccessThread thread3 = new FileAccessThread("Thread3", file1, file2);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
