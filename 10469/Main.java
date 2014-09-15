import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=inp.readLine())!=null){
			int first = Integer.parseInt(line.split(" ")[0]);
			int second = Integer.parseInt(line.split(" ")[1]);
			System.out.println(first^second);
		}
	}
}