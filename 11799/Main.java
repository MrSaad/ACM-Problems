import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(inp.readLine());
		for (int i=0; i<num; i++){
			String[] ar = inp.readLine().split(" ");
			int max=Integer.MIN_VALUE;
			for (int j=0; j<ar.length; j++){
				if(Integer.parseInt(ar[j])>max){max=Integer.parseInt(ar[j]);}
			}
			System.out.println("Case "+(i+1)+": "+max);
		}

	}	
}
