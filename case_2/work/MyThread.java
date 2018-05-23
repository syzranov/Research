public class MyThread extends Thread {
    String threadName;

    MyThread(String threadName) {
        super("Thread: " + threadName);
	this.threadName = threadName;

        System.out.println("Thread " + this.threadName + " - created " + this);
    }

    public void run() {
	System.out.println("Thread " + this.threadName + "started!"); 

        try {
            for (int i = 5; i > 0; i--) {
		System.out.println("Thread " + this.threadName + ":" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
		System.out.println("Thread " + this.threadName + "interrupted");
        }
    }
}