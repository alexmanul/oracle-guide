package lv.java.oracleguide.chapter11;

public class MyThread {
    private Thread thread;

    private volatile boolean suspended;
    private volatile boolean stopped;

    MyThread(String name){
        // thread = new Thread(this, name);
        suspended = false;
        stopped = false;
        thread.start();
    }
}