
public class Tester {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		int numOfPhilosophers=5;
		
		
		Philosophers []p=new Philosophers[numOfPhilosophers];
		Philosophers[]Chopstick=new Philosophers[numOfPhilosophers];
		
	
		for(int i=0; i<5;i++) {
			
			Chopstick[i]=new Philosophers();
					
			
		}
		
		
		

		for(int i=0; i<5;i++) {
			
			Philosophers left_Chopstick=Chopstick[i];
			Philosophers right_Chopsticks=Chopstick[(i+1)%5];
			
			
			
			if(i==5-1)
		{
			p[i]=new Philosophers(right_Chopsticks, left_Chopstick);
			
		}
		else {
			p[i]=new Philosophers(left_Chopstick, right_Chopsticks);
		}
		
		 
		
		Thread thread1=new Thread(p[i],"Philosopher # "+(i+1));
		thread1.start();
			
		
		
		
	    }
			
			

	  }
		
		
			
		
  }


