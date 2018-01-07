package lab8;

	public class Consumer extends Thread {
		public void run(){
			try{
				do{
					CriticalSec.flag[CriticalSec.second] = true;
					CriticalSec.turn = CriticalSec.first;
					
					while (CriticalSec.flag[CriticalSec.first] && CriticalSec.turn == CriticalSec.first)
						;// wait for first to finish
					// critical section
					
					if(CriticalSec.counter%2==0){
						System.out.println("\nProducer is blocked\nConsumer is consuming things right now ! ");
					}
						System.out.println("\nConsumer is in critical section\nThe new word is "+CriticalSec.uppercasewords[CriticalSec.counter]);
					
					CriticalSec.counter++;
					CriticalSec.flag[CriticalSec.second] = false;
					
				}while(CriticalSec.counter!=CriticalSec.words.length);
			}
			catch(Exception exp){
				exp.printStackTrace();
			}
		}
	
	
	

}