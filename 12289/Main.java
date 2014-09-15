import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(inp.readLine());
		for (int i=0; i<cases; i++){
			String line = inp.readLine();
			if(line.matches("o.e")||line.matches(".ne")||line.matches("on.")){
				System.out.println(1);
			}
			else if(line.matches("t.o")||line.matches(".wo")||line.matches("tw.")){
				System.out.println(2);
			}
			else if(line.matches(".hree")||line.matches("t.ree")||line.matches("th.ee")||line.matches("thr.e")||line.matches("thre.")){
				System.out.println(3);
			}
		}
	}
}