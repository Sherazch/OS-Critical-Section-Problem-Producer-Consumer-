package lab8;


import java.util.*;

public class CriticalSec {
	public static int first=0;
	public static int second=1;
	public static int counter=0;
	public static int turn;
	public static boolean flag[]=new boolean[2];
	public static String words[]={"sufyan","awab","awwabDouble","mohsin","nomi","haroon"};
	public static String uppercasewords[]=new String[6];
	
	public CriticalSec(){
		System.out.println("\nStarting... Solution of Producer/Consumer using Peterson's Algorithm");
		
		
		Thread I = new Producer();
		Thread J = new Consumer();
		I.start(); // start P1 process
		J.start(); // start P2 process
		
		
	}
	public static void main(String[] args) {
		CriticalSec cs=new CriticalSec();
				}
	
	


	}
