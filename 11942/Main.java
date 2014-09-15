import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(inp.readLine().trim());
		String[] vals;
		boolean inc, flag;
		System.out.println("Lumberjacks:");
		for (int i=0; i<num; i++){
			flag=true;
			vals=inp.readLine().trim().split(" ");
			inc=Integer.parseInt(vals[0])<Integer.parseInt(vals[1]);
			for(int j=1; j<9; j++){
				if(inc){
					if(Integer.parseInt(vals[j])>Integer.parseInt(vals[j+1])){flag=false;break;}
				}
				if(!inc){
					if(Integer.parseInt(vals[j])<Integer.parseInt(vals[j+1])){flag=false;break;}
				}
			}
			if(flag){System.out.println("Ordered");}
			else{System.out.println("Unordered");}
		}
	}
}