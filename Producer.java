package lab8;

public class Producer extends Thread {
		
		
		public void run(){
			try{
				do{
					if(CriticalSec.counter%2==1){
					System.out.println("\nConsumer is blocked\nProducer has not produced anything yet ! ");
					}
					CriticalSec.flag[CriticalSec.first] = true;
					CriticalSec.turn = CriticalSec.second;
					while (CriticalSec.flag[CriticalSec.second] && CriticalSec.turn == CriticalSec.second)
						; // wait for j to finish
					// critical section
					System.out.println("\nproducer is in critical section\n The original word is "+CriticalSec.words[CriticalSec.counter]);
					//Thread.sleep(5);
					process();
					
					CriticalSec.flag[CriticalSec.first] = false;
				}while(CriticalSec.counter!=CriticalSec.words.length-1);
			}
			catch(Exception exp){
				exp.printStackTrace();
			}
		}
		public void process(){
			
			CriticalSec.uppercasewords[CriticalSec.counter]=CriticalSec.words[CriticalSec.counter].toUpperCase();
			
		}
		}