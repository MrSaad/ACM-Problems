import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		int[] path;

		for (int i=0; i<testcases; i++){
			int amount = sc.nextInt();
			int cumTot=0;
			int max = Integer.MIN_VALUE;
			int startIndex=0;
			int endIndex=0;
			int bestsofar=0;
			int maxlength=0;
			path = new int[amount];
			for (int j=0; j<(amount-1); j++){
				cumTot+=sc.nextInt();
				if(cumTot>max){
					max=cumTot;
					startIndex=bestsofar;
					endIndex=j;
					maxlength=endIndex-startIndex;
				}
				else if(cumTot==max){
					if(maxlength<(j-bestsofar)){
						max=cumTot;
						startIndex=bestsofar;
						endIndex=j;
						maxlength=endIndex-startIndex;
					}
				}
				if(cumTot<0){
					bestsofar=j+1;
					cumTot=0;
				}
				
			}

			if(max<0){System.out.println("Route "+(i+1)+" has no nice parts");}
			else{System.out.println("The nicest part of route "+(i+1)+" is between stops "+(startIndex+1)+" and "+(endIndex+2));}
		}

	}
}