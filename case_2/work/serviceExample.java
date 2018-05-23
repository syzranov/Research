import java.util.List;
import java.util.ArrayList;

public class serviceExample {
  public static void main(String[] args) {
	    List<MyThread> list = new ArrayList<MyThread>();	 
	    for(int i = 0; i < 50000; i++) {
		list.add(new MyThread("Thread_" + i));
	    }
	    for(int i = 0; i < 50000; i++) {
		list.get(i).start();
	    }
    }	                   
}

