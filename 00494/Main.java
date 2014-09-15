import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=inp.readLine())!=null){
			int count=0;
			String[] text=line.split("[^a-zA-Z]");
			for (String each:text){
				if(each.matches(".*[a-zA-Z]+.*")){count++;
				}
			}
			System.out.println(count);
			
		}
	}
}