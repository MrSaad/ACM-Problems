import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int test =1;
		while((line=inp.readLine())!=null){
			System.out.println("Case "+(test++)+":");
			int cases = Integer.parseInt(inp.readLine());
			for(int i=0; i<cases; i++){
				String stat = "Yes";
				String next = inp.readLine();
				int a=Integer.parseInt(next.split(" ")[0]);
				int b=Integer.parseInt(next.split(" ")[1]);
				int max = (a>b)?a:b;
				int min = (a<b)?a:b;

				char hold = line.charAt(min);
				for (int j=min; j<=max; j++){
					if(line.charAt(j)!=hold){stat="No"; break;}
				}
				System.out.println(stat);
			}
		}
	}
}