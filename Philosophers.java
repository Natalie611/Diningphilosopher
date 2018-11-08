
public class Philosophers implements Runnable {
	
	private Philosophers left_Chopstick;
	private Philosophers right_Chopstick;

	
public Philosophers() {      //class constructor
		
		left_Chopstick=null;
		right_Chopstick=null;
		
}


public Philosophers(Philosophers l, Philosophers r) { //class constructor with parameters
	
	
	left_Chopstick=l;
	right_Chopstick=r;
	
}

	

public void display(String m)throws Exception{    
	
	System.out.println(Thread.currentThread().getName()+" "+m);  //return name of thread group
	Thread.sleep(10); //rest a bit to give other threads a chance to work
	
	
}
public void run() {
	while(true) {
		isEating();
	}
}



public void isEating() {
	try {
	while(true) {
		
		
			display(" is thinking"); 
			display(" hungry");
			synchronized(left_Chopstick) {
			
			display(" has picked up left Chopstick");
			synchronized(right_Chopstick) {
				
			display(" has picked up right Chopstick");
			display("Both chopsticks are in use");
				
				display(" is eating");
				
				display(" had put down right chopstick");
			
			display(" has put down left chopstick");
		
			
	}
			}
			}
	
			
	}
	catch(Exception e) {
		
		
		System.out.println(e.getMessage());
	}
			
			
			



}
}