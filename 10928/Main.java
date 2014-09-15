import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(inp.readLine());
		int min, live;
		String[] currplace;
		for (int i=0; i<cases; i++){
			live=Integer.parseInt(inp.readLine());
			min=Integer.MAX_VALUE;
			TreeMap<Integer, Integer> places=new TreeMap<Integer, Integer>();
			for (int j=0; j<live; j++){
				currplace=inp.readLine().split(" ");
				if(currplace.length<min){
					min=currplace.length;
					places.clear();
					places.put(j+1, 1);
				}
				else if(currplace.length==min){
					places.put(j+1, 1);
				}
			}
			inp.readLine();
			
			
			if(i!=0){
				System.out.print("\n");
			}
			int clr=0;
			for (Map.Entry<Integer, Integer> ent:places.entrySet()){
				if((clr++)!=0){
					System.out.print(" "+ent.getKey());
				}
				else System.out.print(ent.getKey());
				
			}

			
		}
	}
}