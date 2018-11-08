package practice;

class RunnableDemo implements Runnable {
	   private Thread t;
	   private String threadName;
	   
	   RunnableDemo( String name) {
	      threadName = name;
	      System.out.println( threadName + " Picks up fork " );
	   }
	   
	   public void run() {
	      System.out.println("Eating " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println( threadName + ", " + i);
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	public class TestThread {

	   public static void main(String args[]) {
	      RunnableDemo R1 = new RunnableDemo( "Philosopher 1");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "Philosopher 2");
	      R2.start();
	      
	      RunnableDemo R3 = new RunnableDemo( "Philosopher 3");
	      R3.start();
	      
	      RunnableDemo R4 = new RunnableDemo( "Philosopher 4");
	      R4.start();
	      
	      RunnableDemo R5 = new RunnableDemo( "Philosopher 5");
	      R5.start();
	   }   
	}
