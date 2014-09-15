import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int amount=sc.nextInt();
			int maxNumCont = sc.nextInt();
			int[] vessels=new int[amount];
			for (int i=0; i<vessels.length; i++){
				vessels[i]=sc.nextInt();

			}

			int min=0; int max=1000000000;
			while(min!=max){
				int mid = (max+min)/2;
				if(can(vessels, maxNumCont, mid)){
					max=mid;
				}
				else{
					min=mid+1;
				}
			}
			System.out.println(max);
		}
	}

	public static boolean can(int[] nums, int max, int cont){
		int loc=0;
		for (int i=0; i<max; i++){
			int tot=0;
			while(true){
				if((tot+nums[loc])<=cont){
					tot+=nums[loc];
					loc++;
					if(loc==nums.length){return true;}
				}
				else break;
			}
		}
		return false;
	}
}