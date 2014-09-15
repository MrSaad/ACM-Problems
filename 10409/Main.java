import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int num = Integer.parseInt(inp.readLine());
			int top = 1;
			int north = 2;
			int west = 3;
			if(num==0){break;}
			for (int i=0; i<num; i++){
				
				String com = inp.readLine();
				int temp;
				if(com.equals("north")){
					temp=north;
					north=top;
					top=7-temp;
				}
				if(com.equals("south")){
					temp=top;
					top=north;
					north=7-top;
				}
				if(com.equals("east")){
					temp=top;
					top=west;
					west=7-top;
				}
				if(com.equals("west")){
					temp=west;
					west=top;
					top=7-temp;
				}
			}
			System.out.println(top);
		}
	}
}