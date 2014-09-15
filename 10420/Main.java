import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> count= new HashMap<String,Integer>();
		ArrayList<String> vals=new ArrayList<String>();
		int lines =  Integer.parseInt(inp.readLine());
		for (int i=0; i<lines; i++){
			String val = inp.readLine().split(" ")[0];
			if(!vals.contains(val)){
				vals.add(val);
				count.put(val, 1);
			}
			else{
				count.put(val, count.get(val)+1);
			}
		}
		Collections.sort(vals);
		for (int i=0; i<vals.size(); i++){
			System.out.println(vals.get(i)+" "+count.get(vals.get(i)));
		}
	}
}