import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(inp.readLine());
		for (int t=0; t<testcases; t++){
			long tot=0;
			int[] vals = new int[512];
			int chars = Integer.parseInt(inp.readLine());
			for (int c=0; c<chars; c++){
				String[] temp = inp.readLine().split(" ");
				vals[temp[0].charAt(0)]=Integer.parseInt(temp[1]);
			}
			int lines = Integer.parseInt(inp.readLine());
			String line;
			for (int l=0; l<lines; l++){
				line = inp.readLine();
				for (int i=0; i<line.length(); i++){
					tot+=vals[line.charAt(i)];
				}
			}
			System.out.println((tot/100.0)+"$");
		}
	}
}