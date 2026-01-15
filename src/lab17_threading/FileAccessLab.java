package lab17_threading;

public class FileAccessLab {

    private static final String FILE_NAME =
            "C:\\Users\\FreddieLevett\\OneDrive - Mobility Giant ltd\\Documents\\labs\\shared_file.txt";


    public static void main(String[] args) {

        Thread t1 = new Thread(new WorkerThread(FILE_NAME, "Thread 1 wrote this"));
        Thread t2 = new Thread(new WorkerThread(FILE_NAME, "Thread 2 wrote this"));
        Thread t3 = new Thread(new WorkerThread(FILE_NAME, "Thread 3 wrote this"));
        //wraps the WorkerThread in a thread object

        t1.start();
        t2.start();
        t3.start();
        //starting the threads
    }
}