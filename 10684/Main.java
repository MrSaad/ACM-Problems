import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int amount, cumtot, max;
		while(true){
			amount=sc.nextInt();
			if(amount==0){break;}
			cumtot=0;
			max=Integer.MIN_VALUE;
			for (int i=0; i<amount; i++){
				cumtot+=sc.nextInt();
				if(cumtot>max){
					max=cumtot;
				}
				if(cumtot<0){
					cumtot=0;
				}
			}
			if(max<=0){System.out.println("Losing streak.");}
			else{System.out.println("The maximum winning streak is "+max+".");}
		}
	}
}