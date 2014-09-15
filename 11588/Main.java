import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 0; t<tc; t++){
			int r = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[] count = new int[26];
			for (int i=0; i<r; i++){
				String line = sc.next();
				for (int j=0; j<c; j++){
					count[(line.charAt(j)-65)]++;
				}
			}
			int nummax=0;
			int max=0;
			for (int i=0; i<26; i++){
				if(count[i]==max){
					nummax++;
				}
				if(count[i]>max){
					nummax=1;
					max=count[i];
				}
			}

			System.out.println("Case "+(t+1)+": "+(nummax*max*m + (r*c-nummax*max)*n));
		}
		
	}
}