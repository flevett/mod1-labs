package lab17_threading;
//package definition

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//imports

public class WorkerThread implements Runnable {
    //implementing runnable so it can be run in a separate thread (to the main)

    private static final Object lock = new Object();
    //static object, used to synchronize access to the file. Static means all instances of WorkerThread share the same lock.
    //this prevents data corruption should multiple threads try to write to the file at the same time
    private final String fileName;
    //the file thread will write to
    private final String message;
    //the message this thread will write

    public WorkerThread(String fileName, String message) {
        this.fileName = fileName;
        this.message = message;
    }
    //constructor to instantiate file name and message

    @Override
    public void run() {
        writeToFile();
    }
    //the run method is what will execute when the thread starts

    private void writeToFile() {
        //method called write to file, no return needed, not accessible by other classes
        synchronized (lock) {
            //only one thread at a time can enter this block
            try (BufferedWriter writer =
                    //automatically closes file after writing
                         new BufferedWriter(new FileWriter(fileName, true))) {
                //the true means append mode, so it adds text to the file instead of overwriting it

                writer.write(message);
                //writes te threads message
                writer.newLine();
                //adds a new line so each message is on a separate line

            } catch (IOException e) {
                e.printStackTrace();
                //if an error occurs it prints the stack trace
            }
        }
    }
}